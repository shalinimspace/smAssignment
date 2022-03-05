Feature: Search for a product in home page and verify the result

Scenario: Search for a product in home page and verify the result in results page
Given User is on Amazon website home page
When User searches with "vivo" on search bar
Then User should be able to observe "Shop vivo" on results page

