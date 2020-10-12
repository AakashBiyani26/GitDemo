Feature: Search and Place the order

@SeleniumTestOct
Scenario: Search items and Validate results

Given User is on Greenkart landing page
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTestOct
Scenario: Search items and Validate results
Given User is on Greenkart landing page
When User searched for "Brinjal" vegetable
And Added items to cart
And users proceed to checkout page for purchase
Then verify selected "Brinjal" items are displayed in checkout page

