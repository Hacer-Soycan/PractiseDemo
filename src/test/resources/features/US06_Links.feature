@links @smoketest @regressiontest
  Feature:US06_Links
    Background:
  Given Go to demoqa home page
  And Click on Elements button
  And click on Links button

  Scenario: TC01_Home
    Given Find the size of links
    And   Write all link text
    Then verify the link text messages
