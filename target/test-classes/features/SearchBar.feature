
Feature: Search Bar

  Scenario Outline: Test Search Bar for: <item>
    Given I open the home page "https://www.liverpool.com.mx/tienda/home"
    When I search for the item <item>
   	When I validate result items
   	Then I close the browser

    Examples: 
      | item       | 
      | television | 
      | nintendo   | 
      | mascotas   | 
