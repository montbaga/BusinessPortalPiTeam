
Feature: Login feature

  Scenario Outline: Test Login feature
    Given user opens the browser
    When user enter <userid> and <pass>
    And user clicks on login button
    Then user is inside the portal

    Examples: 
      | userid                      | pass     |
      | karthik.murugan@t-mobile.nl | Abcd1234 |
