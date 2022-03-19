$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("datatable.feature");
formatter.feature({
  "line": 1,
  "name": "data table entries",
  "description": "",
  "id": "data-table-entries",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User login with valid login details",
  "description": "",
  "id": "data-table-entries;user-login-with-valid-login-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User present on web-shop login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User sign in with email and password",
  "rows": [
    {
      "cells": [
        "rahulhcl@gmail.com",
        "rahul123"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should see logout",
  "keyword": "Then "
});
formatter.match({
  "location": "Verify_Logindatatable.user_present_on_web_shop_login_page()"
});
formatter.result({
  "duration": 4826046100,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Logindatatable.user_sign_in_with_email_and_password(DataTable)"
});
formatter.result({
  "duration": 2967616200,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Logindatatable.user_should_see_logout()"
});
formatter.result({
  "duration": 1277173900,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login with valid credentials",
  "description": "",
  "id": "user-login;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User entered valid email and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see a message \"Login Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "VerifyLogin.user_is_on_login_page()"
});
formatter.result({
  "duration": 4774769100,
  "status": "passed"
});
formatter.match({
  "location": "VerifyLogin.user_entered_valid_email_and_password()"
});
formatter.result({
  "duration": 2261649700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login Successful",
      "offset": 27
    }
  ],
  "location": "VerifyLogin.user_should_see_a_message(String)"
});
formatter.result({
  "duration": 1574357500,
  "status": "passed"
});
});