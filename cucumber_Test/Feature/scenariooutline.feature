Feature: check login with multiple data

Scenario Outline: Successful Login
Given User navigates to the website demowebshoptricentrics
When User logs in with <email> and <password>
Then User should view logout link

Examples:
|email             |password|
|rahulhcl@gmail.com|rahul123|
|rekhabr1@gmail.com|rekhab   |