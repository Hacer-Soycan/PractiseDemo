
@Smoke @Regression @textbox
  Feature: TextBox

    Background:
      Given Go to demoqa home page
#    Given Go to demoqa/textBox page
      And Click on Elements button
      And click on textbox button

    Scenario:TC01
      And enter a fullName
      And enter a email
      And enter your current address
      And enter your permanent addres
      And click on submit button
      Then verify that the login process is completed

