agorava-stackoverflow-api-generator
===================================

That project is the base camp of the whole generation part of agorava-stackoverflow. To have you better understanding the whys and hows, let met tell you a story of a ten-headed-hydra ! But before, a short teaser

# Module organsiation #

This module is split in three part

 1. This module itself, which defines how data is to be downloaded and transformed into POJO in a profile (activated by README.md missing)
 1. Download submodules, which all have short names that will be used as package names, and only define the download URL and the class rename operations to perform
 1. The final module, which aggregates all dependencies and make sure that when this generation profile is activated, all pojos will be generated **prior** to compile of `agorava-stackoverflow-api`

And now, the full movie ...

# How can I trang a JSON file ?	#

Weird question, no ? Let me elaborate it a little.

Before working on that project, I worked on some WSDL-madness. In that realm, I wanted to exchange an XML bucket that could contain various data. For that, I first designed some sample XML values, then inferred the associated XML Schema used to represent them using the excellent [trang](http://www.thaiopensource.com/relaxng/trang.html), before to generate the Java classes using [XJC](http://marxsoftware.blogspot.fr/2011/04/jaxbxjc-java-generation-with-dtd.html) and a [maven plugin](http://maven-plugins.sourceforge.net/maven-jaxb-plugin/).

That seemed neat.

And it also seemed to me that impelenting agorava-stackoverflow could benefit from such a model generation mechanism.

**But** StackExchange sends JSON instead of XML. **And**, furthermore, it sends schema-less JSON.

So it seemed to me that my attempt was doomed.

# Enter jsonschema2pojo #

Fortunatly, I was not the only one agoraver to have such wills, and, during one of our scheduled IRC meetings (let me tell you IRC is a complete *back to the future* discovery to me), one told me there was that jsonschema2pojo thingie that *could* be used (or at elast tested) to generated our model classes. I immediatly (or quite) volunteered for such a test.

## [There ain't no such thing as a free lunch](https://en.wikipedia.org/wiki/There_ain't_no_such_thing_as_a_free_lunch) ##

You know that Heinlein sentence do you ?

Well, like anything, jsonschema2pojo has its own drawbacks, the worst of them being it can't use multiple input JSON files which schemas should be merged to effectively merge them. In other words, if I get the response from the `answers` query containing `comment` object, the generated `Comment` class won't get updated if, later, I get the result of a `comments` query with more fields set in the [StackExchange filter](http://api.stackexchange.com/docs/filters). Admit it, it's **not** good news.

So, how could I separate things ?

The solution was quite obvious : for each JSON query, generate associated classes in their specific packages.

At first, I put in that very module one execution of the jsonschema2pojo for each query. It was ugly, and the repeat of elements made sure it would last long before one or two typos ruin the execution of the whole thing and made sure it won't execute well.

# [Use a bigger hammer](http://www.urbandictionary.com/define.php?term=UABH&defid=4104789) #

I first heard that sentence in the excellent [Monster Garage](https://en.wikipedia.org/wiki/Monster_Garage) redneck-y show :

> You have a problem ? Take a bigger hammer
>
> You have a problem ? Take a bigger hammer

(the repetition has this recursive fun programmers understand the best)

So, what do you do when a maven pom becomes messy ? Yup, you create modules.

So I created one module for each query. In these very simple modules, thanks to the job being done in parent POM, i only have to define a few things

 * As the artifact id is used as both download path (through `<jsonschema2pojo.directory>${project.basedir}/../../agorava-stackoverflow-api/src/generated</jsonschema2pojo.directory>`) and generated package (through `<jsonschema2pojo.package>org.agorava.stackexchange.model.${element.to.generate}</jsonschema2pojo.package>`), I don't have to define them
 * The `query.to.use` has however to be defined there, but it's the only really required element.
 * And of course, there are those magical class rename operations (I will detail them later)

As a consequence, to perform a query to get some sample answers and let jsonschema2pojo generate them, I only have to write that simple pom :

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.agorava</groupId>
		<artifactId>agorava-stackoverflow-api-generator</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</parent>
	<artifactId>answers</artifactId>
	<packaging>pom</packaging>
	<properties>
		<query.to.use>/2.1/answers?order=desc&amp;sort=activity&amp;site=stackoverflow&amp;filter=!nQVDObG3Lx</query.to.use>
	</properties>
</project>
```

Which will download answers from `query.to.use`, then generate classes in package `org.agorava.stackexchange.model.answers`. *Et voila* ! classes will be ready to be merged in model (which, from my own estimate, is around half an hour.

## Usual suspects ... ##

I must confess the longest part in this integration is renaming classes. indeed, each data downloaded is named `Data` by jsonschema2pojo and contained items are named `Item`. As I would prefer, in that class, wrapper to be named `AnswersWrapper` and data to be named `Answer`, I now only have to renmae those classes, which is possible thanks to integration of [jrefactory command-line](http://jrefactory.sourceforge.net/csr-commandline.html) in the parent pom ... which is an other story.