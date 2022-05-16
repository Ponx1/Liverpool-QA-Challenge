
Feature: Buying a Smart TV

  Scenario: Buying a Smart TV
    Given I open the home page "https://www.liverpool.com.mx/tienda/home"
    When I search for the item Smart TV
    When I buy a smart TV
    Then I close the browser

