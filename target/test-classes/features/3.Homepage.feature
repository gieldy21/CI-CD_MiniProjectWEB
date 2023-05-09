Feature: HomePage
  As a user
  I want to choose product
  So that I can buy the product

  @AddProduct(+)
  Scenario: Add one product in cart
    Given I am on the home page
    When I choose the product
    And I click buy button
    Then I see the pop up product add to cart

  Scenario: Add two identical in cart
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I click buy button again
    Then I see the pop up product add to cart

  Scenario: Add two different in cart
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I click buy button on product 2
    Then I see the pop up product add to cart

  Scenario: Add three identical in cart
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I click buy button again
    And I click buy button 3 times
    Then I see the pop up product add to cart

  Scenario: Add three different in cart
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I click buy button on product 2
    And I click buy button on product 3
    Then I see the pop up product add to cart

  @SeeDetail(+)
  Scenario: See detail product 1
    Given I am on the home page
    When I choose the product
    And I click detail button product 1
    Then I go to the detail information product

  Scenario: See detail product 2
    Given I am on the home page
    When I choose the product 2
    And I click detail button product 2
    Then I go to the detail information product

  Scenario: See detail product 3
    Given I am on the home page
    When I choose the product 3
    And I click detail button product 3
    Then I go to the detail information product