$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber1/exercise5.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Nisha"
    }
  ]
});
formatter.step({
  "name": "user launching login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass3.user_launching_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter with credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "saranya",
        "password1"
      ]
    },
    {
      "cells": [
        "mercury",
        "password1"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass3.user_enter_with_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify login status",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass3.verify_login_status()"
});
formatter.result({
  "status": "passed"
});
});