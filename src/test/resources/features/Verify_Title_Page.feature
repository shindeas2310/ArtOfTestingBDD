 Feature: Verify Page Title
  Scenario: Validate the title of the sample site
    When I fetch the title of the page
    Then The title should be "Sample Webpage for Selenium Automation Practice | ArtOfTesting"
