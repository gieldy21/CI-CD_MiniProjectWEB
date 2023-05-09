Feature: Order
  As a user
  I want to cart
  So that I can access my cart

  @AddQuantity
  Scenario: Add one product in cart click + button
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I go to the order page
    Then I click add quantity button

  @ReducesQuantity
  Scenario: reduce one product in cart click - button
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I go to the order page
    Then I click reduce quantity button

  @BuyProduct
  Scenario: buy one product in cart click pay button
    Given I am on the home page
    When I choose the product
    And I click buy button
    And I go to the order page
    Then I click pay button