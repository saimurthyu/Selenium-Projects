
@tag
Feature: Tool Tips function
  I want to use this template for my feature file
  Background:
 Given navigate to tooltestqa
    And click on widgets
    When click on tooltip link

  @tag1
  Scenario: Verify tool tips is clicking
    Then verify tool tips page is open
   
   @tag2
   Scenario: Verify  click on Hover me to see button
   When click on Hover me to see
   Then Tool tip will be open
   @tag3
   Scenario: verify click on hover me to see text box
   When click on hover me to see text box
   Then Tool tip will be open
   @tag4
   Scenario: Verify click on contrary
   When Click on contrary
   Then Tool tip will be open