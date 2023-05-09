Feature: Register
  As a user
  I want to create account
  So that I can access AltaShop with my account

  @Register(+)
  Scenario: Success register
    Given I am on the register page
    When I enter full name
    And I enter valid email
    And I enter valid password
    And click register button
    Then I go to the login page

  @Register(-)
  Scenario: Failed register with invalid email
    Given I am on the register page
    When I enter full name
    And I enter invalid email
    And I enter valid password
    And click register button
    Then I go to the login page

  @Register(-)
  Scenario: Failed register with already used email
    Given I am on the register page
    When I enter full name
    And I enter already used email
    And I enter valid password
    And click register button
    Then I see the error message

  @Register(-)
  Scenario: Failed register with does not exist email
    Given I am on the register page
    When I enter full name
    And I enter does not exist email
    And I enter valid password
    And click register button
    Then I go to the login page

  @Register(-)
  Scenario: Failed register with not fill all
    Given I am on the register page
    When I not enter full name
    And I not enter valid email
    And I not enter valid password
    And click register button
    Then I see the error message

  @Register(-)
  Scenario: Failed register with not fill full name
    Given I am on the register page
    When I not enter full name
    And I enter valid email
    And I enter valid password
    And click register button
    Then I see the error message

  @Register(-)
  Scenario: Failed register with not fill email
    Given I am on the register page
    When I enter full name
    And I not enter valid email
    And click register button
    Then I see the error message

  @Register(-)
  Scenario: Failed register with not fill password
    Given I am on the register page
    When I enter full name
    And I enter valid email
    And click register button
    Then I see the error message