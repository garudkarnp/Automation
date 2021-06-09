$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumber1/exercise1.feature");
formatter.feature({
  "name": "Login or Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch Testme App portal",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_launch_Testme_App_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username And password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.enter_username_And_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click OK",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.click_OK()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate login success",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.validate_login_success()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/cucumber1/exercise2.feature");
formatter.feature({
  "name": "Login TestmeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters with \"\u003cusername\u003e\" And enters \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user validates login status \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ]
    },
    {
      "cells": [
        "nisha",
        "password1",
        "valid credentials"
      ]
    },
    {
      "cells": [
        "abcd",
        "password2",
        "invalid credentials"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_launching_TestmeApp_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_clicks_on_SignIn_button_on_the_page_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with \"nisha\" And enters \"password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_enters_with_And_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates login status \"valid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.user_validates_login_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_launching_TestmeApp_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_clicks_on_SignIn_button_on_the_page_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with \"abcd\" And enters \"password2\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_enters_with_And_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates login status \"invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.user_validates_login_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/cucumber1/exercise3.feature");
formatter.feature({
  "name": "Login TestmeApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters with \"\u003cusername\u003e\" And enters \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user validates login status \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "status"
      ]
    },
    {
      "cells": [
        "nisha",
        "password1",
        "valid credentials"
      ]
    },
    {
      "cells": [
        "abcd",
        "password2",
        "invalid credentials"
      ]
    },
    {
      "cells": [
        "xyz",
        "password3",
        "invalid credentials"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_launching_TestmeApp_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_clicks_on_SignIn_button_on_the_page_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with \"nisha\" And enters \"password1\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_enters_with_And_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates login status \"valid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.user_validates_login_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_launching_TestmeApp_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_clicks_on_SignIn_button_on_the_page_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with \"abcd\" And enters \"password2\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_enters_with_And_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates login status \"invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.user_validates_login_status(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launching TestmeApp portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_launching_TestmeApp_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on SignIn button on the page opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefclass.user_clicks_on_SignIn_button_on_the_page_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with \"xyz\" And enters \"password3\"",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefclass.user_enters_with_And_enters(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefclass.clicks_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validates login status \"invalid credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefclass.user_validates_login_status(String)"
});
formatter.result({
  "status": "passed"
});
});