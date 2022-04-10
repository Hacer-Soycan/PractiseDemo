@buttons @smoke @regression
Feature: US05_Buttons
  Background:
    Given Go to demoqa home page
    And Click on Elements button
    And click on Buttons button

  Scenario: TC01-Buttons-Page-Verification
    Given Verify that the buttons page opened

  Scenario: TC02-Double-Click-Me
    Given Click on the Double Click Me button
    Then verify double click message

  Scenario: TC03-Right-Click-Me
    Given Click on the Right Click Me button
    Then verify right click me message

  Scenario: TC03-Click-Me
    Given Click on the Click Me button
    Then verify click me message