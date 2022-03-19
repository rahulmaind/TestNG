Feature: User Login

@valid
Scenario: Login with valid credentials
Given User is on login page
When User entered valid email and password
Then User should see a message "Login Successful"

@invalid
Scenario: Unsuccessful login with invalid credentials
Given I have opened demowebshop loginpage
When I enterd invalid credentials
Then I should view error message

