Feature: data table entries


Scenario: User login with valid login details
Given User present on web-shop login page
When User sign in with email and password
|rahulhcl@gmail.com|rahul123|
Then User should see logout