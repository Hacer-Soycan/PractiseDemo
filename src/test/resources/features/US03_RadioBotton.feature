@radioButton
  Feature:US03_RadioButton
    Background:
      Given Go to demoqa home page
      And Click on Elements button
      And click on RadioButton button

  Scenario: TC01
    And click on Yes button
    Then verify the yes button is clicked

  Scenario: TC02
     And click on impresive button
     Then verify that the yes button not clicked

  Scenario: TC03
 # And click on No button
  And  Verify that is no button clickable
  Then verify all buttons are clickable
#  And verify all successText


