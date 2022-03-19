Feature: check the title

Background: driver installed
Given I am the on demo web shop tricentis loginpage.

Scenario: verify title of demowebshop page

Then I should able to see title contains shop.

Scenario: check the source of demowebshop page
Then I should able to see source conatains shop.