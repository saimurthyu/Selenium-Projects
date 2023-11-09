@demoQA
Feature: Validate Progress functanility in widgets

Scenario:
Given Launch demoQA site and click on widgets
 

    When click on Progress bar
    Then user at progress bar page
    When click on Progress bar
    And user click on start button
    Then user view the progress of start
    When click on Progress bar
    And user click on start button
    And user click on stop button
    Then user view the progree to stop
    When click on Progress bar
     And user click on start button
    Then validate progress reached it fully
     When click on Progress bar
     And user click on start button
    And user click on reset button
    Then validate the Reset is enabeld
  
    When click on Progress bar
     And user click on start button
     And user click on stop button
    Then validate the start and stop fun works perfect