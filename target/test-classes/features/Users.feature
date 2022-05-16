

Feature: Users

  @RunThis
  Scenario Outline: I create user <user>
    Given I open the home page "https://www.liverpool.com.mx/tienda/home"
    Then I create a user with <user> , <password>
    Then I close the browser

    Examples: 
      | user                 | password  | 
      | name1@mailinator.com | Test12345 | 
      | name2@mailinator.com | Test12345 | 
