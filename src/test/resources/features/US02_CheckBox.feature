@smoke @regression @checBox
  Feature: CheckBox

    Scenario: CheckBoxValidation
      Given Go to demoqa home page
      And Click on Elements button
      And click on CheckBox button
      And click on plus sign
      Then Verify that the whole menu opens
      And click on minus sign
      Then Verify that the menu is closed
      And click on plus sign button
      #And Click on Desktop drodown
      And Click on Notes button
      #And click on Downloads button
     # And click on Wordfile button
      Then verify chosen dropdowns
