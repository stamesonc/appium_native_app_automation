Feature: API Demos Preferences

  Scenario: Validate
    Given user is on "API Demos" application
    When user taps on "Preferences"
    And user taps on "3. Preference dependencies"
    And user selects WIFI
    And WIFI settings should be enabled

