Feature: Text Input Field Validation
  Scenario: Enter and verify text in the input field
    When I enter "John Doe" in the text input field
    Then The text input field should display "John Doe"
