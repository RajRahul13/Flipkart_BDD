Feature: Buying a mobile phone using flipkart
 
  Scenario: Get final price of Iphone 13 using flipkart
    Given I visit flipkart E-commerce site
    And I go to mobile section of site
    And I hover to electronics section
    And I click on one of the available mobile brand 
    And I search for Iphone 13
    When I click on product and new window pops up
    And I hover over video icon of mobile
    And I enter pincode in delivery text
    And I click on “View Details”link under the Delivery pincode  Close the Modal
    And I verify that the modal pop up is opened or not if yes close the Modal
    And I add item to the cart
    Then I verify final price of the item.
   
   


