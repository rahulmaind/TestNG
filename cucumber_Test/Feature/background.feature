Feature: check title

Background: driver installed
Given I am on the demowebshop page


Scenario: Verify title of demowebshop
Then I should see that title contains shop.


Scenario: Check the source of demowebshop
Then I should see that source contains shop.