#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: i want to verify login1
  I want to use this template for my feature file1

  @tag1
  Scenario: login with valid credentiall
    Given I want to navigate to url
    When I complete the excecution
    Then I validate the login
    
  @tag2
  Scenario Outline: Title of your scenario outline1
    Given I want to write a step with2<name>
    When I check for the <value> in step4
    Then I verify the <status> in step6

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
