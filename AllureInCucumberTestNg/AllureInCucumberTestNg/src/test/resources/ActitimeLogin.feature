@tag
Feature: Validating Login senario
  
 Background:
Given I want to Navigate to actitime website

  @tag1
  Scenario: Verify the username text box accept data
    Then Verify the data accepted in username taxt box
     @tag3
  Scenario: Verify the password text box accept data
    Then Verify the data accepted in password taxt box
     @tag4
  Scenario: Verify the user able to login with valid data
    When user enter valid username and password click on Login btn
    Then Verify the home page is open or not
     @tag5
  Scenario: Verify the user able to login with valid data
    When user enter valid username and password and press Enter
    Then Verify the home page is open or not
      @tag6
  Scenario: Verify the user able to select check box of keep me logged
    When user able to select check box
    Then Verify the check box is selected or not
   @tag7
  Scenario: Verify the login logout more then 4times at a time
    Then Verify the account is login or not
    @tag8
  Scenario: Verify the login logout when select keep me logged checkbox
    Then Verify the account loged automatically
     @tag9
  Scenario: Verify the balnk username
    Then Verify the user should not login
      @tag10
  Scenario: Verify the balnk password
    Then Verify the user should not login
  @tag2
  Scenario Outline: Verify the invalid username
    When Check invaliddata <name> in username field
    Then Verify user should not login

    Examples: 
      | name  | 
      | "name1" |  
      |"name2" |   
      |"12456789"|
      |"!@#$%^&*"|
       @tag2
  Scenario Outline: Verify the invalid password
    When Check invaliddata <name> in password field
    Then Verify user should not login

    Examples: 
      | name  | 
      | "name1" |  
      |"name2" |   
      |"12456789"|
      |"!@#$%^&*"|