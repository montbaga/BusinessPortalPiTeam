$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/test.feature");
formatter.feature({
  "name": "my test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "my scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "client enters given",
  "keyword": "Given "
});
formatter.step({
  "name": "client enters \u003cuser\u003e and \u003cpassword\u003e when",
  "keyword": "When "
});
formatter.step({
  "name": "client enters and",
  "keyword": "And "
});
formatter.step({
  "name": "client enters then",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "password"
      ]
    },
    {
      "cells": [
        "karthik.murugan@t-mobile.nl",
        "Abcd1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "my scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "client enters given",
  "keyword": "Given "
});
formatter.match({
  "location": "test.givenblock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client enters karthik.murugan@t-mobile.nl and Abcd1234 when",
  "keyword": "When "
});
formatter.match({
  "location": "test.whenblock(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client enters and",
  "keyword": "And "
});
formatter.match({
  "location": "test.andblock()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "client enters then",
  "keyword": "Then "
});
formatter.match({
  "location": "test.thenblock()"
});
formatter.result({
  "status": "passed"
});
});