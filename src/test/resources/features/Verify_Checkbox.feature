Feature: Checkbox Functionality
  Scenario: Validate checkbox selection
    When I select the "Automation" and "Performance" checkboxes
    Then Both checkboxes should be selected
