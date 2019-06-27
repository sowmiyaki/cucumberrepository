
Feature: User Login
 

  @outlines
  Scenario Outline: scenario_outline
    Given I want to enter user name "<username>"
    When I want to enter "<password>" 
    Then the page is displayed

    Examples: 
      |username |password| 
      | sowmiya | pass123| 
      | nalini  | pass456| 
