Feature: RegisterNewAddressFeature
  This feature deals with the register of a new address in the Ninja Store

  Scenario: Register a new Address with a created user
    Given I am logged in the Ninja Store page with "usertest@test.com" and "usertest"
    When I add a new book address
    Then I see that the new address was successfully added

  Scenario: Register a new User correct|incorrect
    Given I dont have a user in the Ninja Store page
    When I create a new user
    Then I see that the new user was successfully created