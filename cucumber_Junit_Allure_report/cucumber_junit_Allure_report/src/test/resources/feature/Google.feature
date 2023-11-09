@tag
Feature:i want to test the google
 @ValidCredentials
   Scenario: Scenario - Login with valid credentials 
      
    Given User is on Home page1
    When User enters username as "Admin"1
    And User enters password as "admin123"12
    Then User should be able to login sucessfully34