@Smoke @Regression @brokenLinks
  Feature: Broken Links;
    Background:
      Given Go to demoqa home page
      And Click on Elements button
      And click on Broken Links-Images button
  Scenario:TC01
    Given Verify valid image is displayed
    Then  Verify the image is broken
    And   Click on the valid Link button
    Then verify the expected page is opened
    And  click on the broken link button
    Then  Verify the link is broken