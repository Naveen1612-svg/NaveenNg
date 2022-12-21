Feature: To validate the tools qa application
Scenario: user should buy a cloth from tools qa
Given launch url and user should click the poduct
When user should select size and colour
And  user should click add to cart icon

Scenario: proceed to check
When  The user should click the proceed to check out
And The user should fill personal details
And user should agree terms and condition 
Then the user should Place order

