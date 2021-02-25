
Feature: Login and Logout is successful


  Scenario Outline: Login and Logout with valid credentials
    Given User opens the login page
    When User enters <username> and <password>
    And User clicks on Login button
    Then User signs in successfully

    Examples: 
      | username                    | password                 |
      | karthik.murugan@t-mobile.nl | tE+PEiSUqqgo23gg3D+W7A== |
      
