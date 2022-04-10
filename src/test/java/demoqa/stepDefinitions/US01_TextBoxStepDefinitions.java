package demoqa.stepDefinitions;

import demoqa.pages.US01_TextBoxPage;
import demoqa.utilities.ConfigReader;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class US01_TextBoxStepDefinitions // extends US01_TextBoxPage
{
    US01_TextBoxPage textBoxPage = new US01_TextBoxPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Go to demoqa home page")
    public void go_to_demoqa_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("demoqa_url"));
    ReusableMethods.waitFor(3);}

//    @Given("Go to demoqa\\/textBox page")
//    public void go_to_demoqa_text_box_page() {
//            Driver.getDriver().get("https://demoqa.com/text-box");}



        @And("Click on Elements button")
        public void click_on_elements_button() {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(3);
            textBoxPage.elementCard.click();
            ReusableMethods.waitFor(3);
        }

        @Given("click on textbox button")
        public void click_on_textbox_button() {
            textBoxPage.textBoxMenuLink.click();
            ReusableMethods.waitFor(3);
        }

        @Given("enter a fullName")
        public void enter_a_full_name() {
           textBoxPage.fullNameTextBox.sendKeys(ConfigReader.getProperty("fullname"));
        }

        @Given("enter a email")
        public void enter_a_email() {
            textBoxPage.emailTextBox.sendKeys(ConfigReader.getProperty("email"));
        }

        @Given("enter your current address")
        public void enter_your_current_address() {
            textBoxPage.currentAddressTextBox.sendKeys(ConfigReader.getProperty("currentAddress"));
        }

        @Given("enter your permanent addres")
        public void enter_your_permanent_addres() {
            textBoxPage.permanentAddressTextBox.sendKeys(ConfigReader.getProperty("permanentAddress"));
            ReusableMethods.waitFor(2);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
    }


        @Given("click on submit button")
        public void click_on_submit_button() {
            ReusableMethods.waitFor(3);
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            textBoxPage.submitButton.click();
            ReusableMethods.waitFor(3);
        }

        @Then("verify that the login process is completed")
        public void verify_that_the_login_process_is_completed() {
            textBoxPage.registrationInfo.isDisplayed();
            Assert.assertTrue(textBoxPage.registrationInfo.isDisplayed());
//            Assert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.fullNameTextBox.getText()));
//            Assert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.emailTextBox.getText()));
//            Assert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.currentAddressTextBox.getText()));
//            Assert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.permanentAddressTextBox.getText()));

            SoftAssert softAssert=new SoftAssert();
            softAssert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.fullNameTextBox.getText()));
            softAssert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.emailTextBox.getText()));
            softAssert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.currentAddressTextBox.getText()));
            softAssert.assertTrue(textBoxPage.registrationInfo.getText().contains(textBoxPage.permanentAddressTextBox.getText()));

            softAssert.assertAll();

//
//            List<WebElement> list=textBoxPage.registrationInfo.getText();
//            for (int i=0; i<list.size(); i++){
//                System.out.println(list);
//
            }


        }


