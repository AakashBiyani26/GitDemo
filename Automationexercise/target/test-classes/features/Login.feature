Feature: Application login

Background:
Given validate browser
When Browser is triggered
Then check if browser is started



@RegressionTest
Scenario: Home page default login

Given User is on landing page
When User login into application with "jin" and password "124"
Then Home page is populated
And cards displayed are "true"

@RegressionTest
Scenario: Home page default login

Given User is on landing page
When User login into application with "john" and password "125"
Then Home page is populated
And cards displayed are "false"

@SanityTest
Scenario Outline: Home page default login
Given User is on landing page
When User login to application with <Username> and password <password>
Then Home page is populated
And cards displayed are "true"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |
|user4    |pass4   |

