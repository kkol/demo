Feature: Verify Parabank page

  Scenario: Verify if Parabank main site is displayed
    Given user opens Parabank page
    When user clicks register account button
    And user provide following data
      | First Name | test_user         |
      | Last Name  | test_password     |
      | Address    | some_street 20/12 |
      | City       | Warsaw            |
      | State      | Mazowieckie       |
      | Zip Code   | 38-222            |
      | Phone      | 0002232233        |
      | SSN        | 54434             |
      | Username   | test-u            |
      | Password   | [from config]     |
      | Confirm    | [from config]     |
    And user click register button
