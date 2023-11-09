
@tag
Feature: Accordian function
  I want to use this template for my feature file
  Background:
 Given I want navigate to url
    And Click on widgets
    When I click on Accordian

  @tag1
  Scenario: Verify user click on accordian
    Then accordian page is display or not
   
   @tag2
   Scenario: Verify user click on Quesion link
   When user click one question
   Then Answer page will be open
   
   @tag3
   Scenario: verify user click accordian two times
   When accordian link click two times
   Then accordian will not be close.
   
   @tag4
   Scenario: verify user one question link two times at a time
    When question link click two times
   Then question will not be close.
   
   @tag5
   Scenario: verify user click on ather question link when other question is open
    When question link click 
    And click on whyde we use it
   
