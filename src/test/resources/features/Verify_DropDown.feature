Feature: Dropdown Menu Functionality
  Scenario: Select and verify options from the dropdown
    When I select "Manual Testing" from the dropdown
    Then The selected option should be "Manual Testing"
