
Feature: Newlogin

  @Tag1 @Tag2
  
  Scenario: success
  
  
    Given  User enter"sowmiya"
    When    User give "123@456"
    
    @Tag2 
    Scenario: Failure
    And     user click on login 
    Then     user is on home page
    
      
       


     
     
     