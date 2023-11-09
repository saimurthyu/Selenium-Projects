
@tag
Feature: slider function
  I want to use this template for my feature file
  
  Background:
 Given navigate to testtoolqa
    And Click on widgets
    When click on slider link

  @tag1
  Scenario: verify the slider link 
    Then Verify slider page is open
   
   @tag2
   Scenario: verify the slider point Move to right side
When slider point move to rightside
Then verify slider position is visable

@tag3
Scenario: Verify  slider how much moved
When slider point move to rightside
Then verify slider position is visable

@tag4
Scenario: Verify slider move to left side
When slider point move to left side


@tag5
Scenario: Verify slider move right and left side
When slider point move to rightside and left
Then slider move to left and right

