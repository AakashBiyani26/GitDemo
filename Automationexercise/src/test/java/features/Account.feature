Feature: Application login

@MobileTest
Scenario: Home page default login

Given User is on landing page
When User login into application with "aakash" and password "124"
Then Home page is populated
And cards displayed are "true"

@MobileTest
Scenario: Home page default login

Given User is on landing page
When User login into application with "riya" and password "125"
Then Home page is populated
And cards displayed are "false"

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

