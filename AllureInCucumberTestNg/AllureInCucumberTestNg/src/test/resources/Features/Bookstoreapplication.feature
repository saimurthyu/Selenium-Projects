
@tag
Feature: BookstoreApplication
  I want to use this template for my feature file
  
  Background:
 Given I want to navigate to the testqatool

  @tag1
  Scenario: Verify the user is able to click on BookstoreApplication
    When Click on the BookstoreApplication link.
    Then Sublinks will be open.
  
  @tag2
  Scenario: Verify user clic on BookstoreApplication link when widget sublinks open.
   When Click on the BookstoreApplication linktwotimes.
   Then sublinks will be close.
   
   @tag3
   Scenario: Verify the user's click on BookstoreApplication link after clicking on the sublink.
    When Click on the BookstoreApplication link.
    And Open one sub link
    Then Sublinks will be open.
    
    @tag4
    Scenario: Verify when the user clicks on BookstoreApplication and another same-level link of BookstoreApplication
    When Click on the BookstoreApplication link.
    And Click on the interactions
    Then sublinks will be close
    
    @tag5
    Scenario: Verify when the user opens sublink of BookstoreApplication and click on the intractions link.
    When Click on the BookstoreApplication link.
    And Open one sub link
    And Click on the interactions
    Then sublinks will be close.
    
   
    
  
