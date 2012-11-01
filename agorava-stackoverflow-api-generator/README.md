agorava-stackoverflow-api-generator
===================================

That project is the base camp of the whole generation part of agorava-stackoverflow. To have you better understanding the whys and hows, let met tell you a story of a ten-headed-hydra !

# how can I trang a JSON file ?	#

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

Well, like anything, jsonschema2pojo has its own drawbacks, the worst of them being it can't use multiple input JSON files which schemas should be merged to effectively merge them. In other words, if I get the response from the `answers` query containing `comment` object, the generated `Comment` class won't get updated if, later, I get the result of a `comments` query with more fields set in the [StackExchange filter](http://api.stackexchange.com/docs/filters). Admit it, it's not good news.
