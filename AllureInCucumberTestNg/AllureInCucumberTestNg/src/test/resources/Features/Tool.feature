
@tag
Feature: Tools function
  I want to use this template for my feature file
  Background:
 Given I want to navigate to testtoolqa
    And I want click on widgets
    When Click on tabs link
  @tag1
  Scenario: Verify user able to click on tabs link
    Then verify tabs page is open
   @tag2
   Scenario: Verify user click on whats tab
   When click on whats 
   Then verify whats tabs page is open
   @tag3
   Scenario: Verify user click on Origin
   When click on Origin
   Then Verify origin page tab is open
   @tag4
   Scenario: Verify user click on use
   When click on use
   Then Verify use page will be open
   @tag5
   Scenario: Verify user click on more 
   When click on more
   @tag6
   Scenario: Verify user click on origin and use
   When click on Origin
   And click on use
   Then Origin page will be close