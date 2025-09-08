Feature: User Login
  As a registered user
  I want to log in
  So that I can access my account

  Scenario: Login with empty fields
    Given I am on the login page
    When I try to login without entering credentials
    Then I should see an email required error

  Scenario Outline: Login with valid credentials
    Given I am on the login page
    When I login with "<email>" and "<password>"
    Then I should be logged in successfully

    Examples:
      | email                       | password   |
      | capstoneproject4510@gmail.com | Capstone@123 |

  Scenario Outline: Login with invalid credentials
    Given I am on the login page
    When I login with "<email>" and "<password>"
    Then I should see a login error message

    Examples:
      | email              | password  |
      | invalid@test.com   | Wrong123  |
