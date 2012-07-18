So you want to try your own Agorava service hub ? This document details the various steps required to do so.


## Prelimnary steps ##

 1. First of all you must be sure to know which web service you want to address. So, to state it clearly, where do you want to connect to ? *Any site of the StackOverflow galaxy*
 2. Then you must be sure that site(s) allow one of agorava supported authentication method (for now, this consists simply of OAuth). So, can you affirm it is possible on your site ? (at best, by proiding their documentation on OAuth) *General [documentation][1] of StackOverflow allow read-only access, with optionnal [authentication][2] for write acces.*
 3. Now you know which site to connect to, and how to connect to, make sure there is no existing service hub being developped elsewhere (check on [#agorava][3]), and go forward !

## Starting a project ##

A ServiceHub project is usually made of at least two components : an API and an implementation. We tend to have these two components grouped in a multi-module maven project, which allow easy declaration of common dependencies, with each project having also its very own set of dependencies.

  [1]: https://api.stackexchange.com/docs/authentication
  [2]: https://api.stackexchange.com/docs/authentication
  [3]: irc://irc.freenode.org/agorava