@tag123
Feature: login of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your 12
    Given I want to write a step with precondition456
    When I complete action78
    And some other action45
    Then I validate the outcomes4556

  @tag2
  Scenario Outline: Title of your scenario outline234
    Given I want to write a step 567with <name>
    When I check for the <value> in step878
    Then I verify the <status> in step98

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
