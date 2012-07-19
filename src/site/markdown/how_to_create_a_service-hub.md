So you want to try your own Agorava service hub ? This document details the various steps required to do so.


## Prelimnary steps ##

 1. First of all you must be sure to know which web service you want to address. So, to state it clearly, where do you want to connect to ? *Any site of the StackOverflow galaxy*
 2. Then you must be sure that site(s) allow one of agorava supported authentication method (for now, this consists simply of OAuth). So, can you affirm it is possible on your site ? (at best, by proiding their documentation on OAuth) *General [documentation][1] of StackOverflow allow read-only access, with optionnal [authentication][2] for write acces.*
 3. Now you know which site to connect to, and how to connect to, make sure there is no existing service hub being developped elsewhere (check on [#agorava][3]), and go forward !
 4. But do you know how Agorava work ? No ? If so, go read [Getting started with Agorava][7].
 5. **Only apply for version of agorava prior switch to JAX-RS 2.0** In versions of agorava prior that migration, OAuth is handled using [scribe java library][5]. This library provide endpoints for a bunch of web services ([full list here][6]). make sure the service you want to connect to is in that list, or else prepare to write your own scribe authentication api for that site. *this is unfortunatly the case for StackOverflow, so agorava-stackoverflow-cdi will include a scribe api endpoint.*.

## Starting a project ##

A ServiceHub project is usually made of at least two components : an API and an implementation. We tend to have these two components grouped in a multi-module maven project, which allow easy declaration of common dependencies, with each project having also its very own set of dependencies.

**note** : In a near future, it could be a great idea for agorava project managers to use maven archetypes to allow one to bootstrap a ServiceHub with ease. But, well, for now, let's do it ourselves.

So, define in your API project one Service corresponding to a feature of the servcie (typically, user management could be handled by a MySiteUserService).

*In our current example, [StackOverflowUserService][7] has been created*.

Now, check operations available on the service you just created in API documentation.

*Typically, StackOverflow provides a bunch of user manipulation methods, all starting with "users/". Let's focus on a few of them. But before all, a subtle info : agorava relies (from what I understand) upon the fact that there is a user information to be sent to the site, which is not the case of general StackOverflow operations. This gives us two possibilities : use shortcut /me/ urls, or send calls to /user/{id} using connected user id. Obviously, we'll prefer the second for read operations, in order for one user to access to informations of any other user.*

*Also notice it's time to work on that scribe lack of a StackOverflow connection API. For that, a StackOverflowAPi class has been created.*


  [1]: https://api.stackexchange.com/docs
  [2]: https://api.stackexchange.com/docs/authentication
  [3]: irc://irc.freenode.org/agorava
  [4]: https://docs.jboss.org/author/display/AGOVA/Getting+started+with+Agorava
  [5]: https://github.com/fernandezpablo85/scribe-java
  [6]: https://github.com/fernandezpablo85/scribe-java/tree/master/src/main/java/org/scribe/builder/api
  [7]: https://github.com/Riduidel/agorava-stackoverflow/blob/master/agorava-stackoverflow-api/src/main/java/org/agorava/stackoverflow/StackOverflowUserService.java