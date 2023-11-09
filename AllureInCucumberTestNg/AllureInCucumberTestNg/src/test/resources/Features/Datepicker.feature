
@tag
Feature: Date picker
  I want to use this template for my feature file
  
  Background:
 Given I want to navigate to testtool
    And Click on widgets
    When Click on Date picker

  @tag1
  Scenario: Varify date picker function
   
    
    Then Verify Date picker page is open
    
    @tag2
    Scenario: Verify Select Date text box
    When Click on Select Date
    Then Calaender will be open
    
    @tag3
    Scenario: Verify Select Month
     When Click on Select Date
      And Select month from dropdown box.
    Then Month will be select
    
    @tag4
    Scenario: Verify Select Year
    When Click on Select Date
    And Slelct year from dropdown
    Then year will be select
    
    @tag5
    Scenario: Verify select date
    When Click on Select Date
    And select date 
    Then date will be select
    
    @tag6
    Scenario: Verify Select date and time
    When Click on select date and time
    Then calender open
    
    @tag7
    
    Scenario: verify click on month in select date and time text box
    When Click on select date and time
    And click on monthbox
    Then list of month is display
    
    @tag8
    
    Scenario: Verify click on perticular month
     When Click on select date and time
     And select perticular month
     Then Selected month will be display
     
     @tag9
     Scenario: Verify click on year
     When  Click on select date and time
     And click on yearbox
     Then Display year box
     @tag10
     Scenario: Verify select year
     When Click on select date and time
     And click on year box
     Then year will be display
     
     @tag11
     Scenario: verify select date
     When Click on select date and time
     And click on date
     Then selected date will be display
     
     @tag12
     Scenario: Verify select time
     
     When Click on select date and time
     And Click on time
     Then selected time will be display