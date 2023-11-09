
@tag
Feature: Widgets
  I want to use this template for my feature file
  
  Background:
 Given I want to navigate to the testqatool

  @tag1
  Scenario: Verify the user is able to click on widgets
    When Click on the Widgets link.
    Then Sublinks will be open.
  
  @tag2
  Scenario: Verify user clic on widgets link when widget sublinks open.
   When Click on the Widgets linktwotimes.
   Then sublinks will be close.
   
   @tag3
   Scenario: Verify the user's click on widgets link after clicking on the sublink.
    When Click on the Widgets link.
    And Open one sub link
    Then Sublinks will be open.
    
    @tag4
    Scenario: Verify when the user clicks on widgets and another same-level link of widgets
    When Click on the Widgets link.
    And Click on the interactions
    Then sublinks will be close
    
    @tag5
    Scenario: Verify when the user opens sublink of widgets and click on the intractions link.
    When Click on the Widgets link.
    And Open one sub link
    And Click on the interactions
    Then sublinks will be close.
    
   
    
  
