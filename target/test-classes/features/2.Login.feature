Feature: Login
  As a user
  I want to create account
  So that I can access AltaShop with my account

  @Login(+)
  Scenario: Success login
    Given I am on the login page
    When I enter valid email login
    And I enter valid password login
    And I click login button
    Then I go to the Homepage

  @Login(-)
  Scenario: Failed login with invalid format
    Given I am on the login page
    When I enter invalid format email login
    And I enter valid password login
    And I click login button
    Then I go to the Homepage

  @Login(-)
  Scenario: Failed login with unregistered
    Given I am on the login page
    When I enter unregistered email login
    And I enter valid password login
    And I click login button
    Then I see error message

  @Login(-)
  Scenario: Failed login with invalid password
    Given I am on the login page
    When I enter valid email login
    And I enter invalid password login
    And I click login button
    Then I see error message

  @Login(-)
  Scenario: Failed login with uppercase password
    Given I am on the login page
    When I enter valid email login
    And I enter valid password but uppercase
    And I click login button
    Then I see error message
