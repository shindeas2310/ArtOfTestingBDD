Feature: Alert Popup Handling
  Scenario: Handle the alert popup
    When I click the button to trigger an alert
    And I accept the alert
    Then The alert should be handled successfully