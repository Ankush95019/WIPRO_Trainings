Feature: User Registration
  As a new user
  I want to register on the nopCommerce site
  So that I can log in later

  Scenario Outline: Successful Registration
    Given I am on the registration page
    When I register with "<firstname>", "<lastname>", "<email>", "<password>", "<confirmPassword>"
    Then I should see a registration success message

    Examples:
      | firstname | lastname | email                     | password     | confirmPassword |
      | John      | Doe      | johndoe123@test.com       | Test@123     | Test@123        |

  Scenario: Registration with already existing email
    Given I am on the registration page
    When I register with "Test" "User" "capstoneproject4510@gmail.com" "Capstone@123" "Capstone@123"
    Then I should see an email already exists error
