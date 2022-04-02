Feature: Google search box in google home page

  Background: Opening the google homepage url
    Given user is on google homepage

  Scenario: Check whether search box is displayed
    Then search box is displayed

  Scenario: Check whether seach box is enabled
    Then search box is enabled