Feature: Verify Parabank page

  Scenario: Verify field validation in registration form
    Given user opens Parabank page
    When user clicks register account button
    And user click register button
    Then validation error 'First name is required.' for 'First Name' field is displayed
    And validation error 'Last name is required.' for 'Last Name' field is displayed
    And validation error 'Address is required.' for 'Address' field is displayed
    And validation error 'City is required.' for 'City' field is displayed
    And validation error 'State is required.' for 'State' field is displayed
    And validation error 'Zip Code is required.' for 'Zip Code' field is displayed
    And validation error 'Social Security Number is required.' for 'SSN' field is displayed
    And validation error 'Username is required.' for 'Username' field is displayed
    And validation error 'Password is required.' for 'Password' field is displayed
    And validation error 'Password confirmation is required.' for 'Confirm' field is displayed


  Scenario: Verify if Parabank main site is displayed
    Given user opens Parabank page
    When user clicks register account button
    And user provide following data
      | First Name | test_user         |
      | Last Name  | test_lastname     |
      | Address    | some_street 20/12 |
      | City       | Warsaw            |
      | State      | Mazowieckie       |
      | Zip Code   | 38-222            |
      | Phone      | 0002232233        |
      | SSN        | 54434             |
      | Username   | test_user    |
      | Password   | [from config]     |
      | Confirm    | [from config]     |
    And user click register button
    Then greetings 'Welcome test_user test_lastname' are displayed in left panel
