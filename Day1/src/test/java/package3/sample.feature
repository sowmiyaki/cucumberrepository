

Feature: create account
 

  Scenario: creation of new account
    
    Given I want to create an account
    When I enter my data
      |username|password | status  |
      | anu    |pass@123 | success |
      | uma    |fail@456 | Fail    |
      Then I verify the account