package demoqa.stepDefinitions;

import demoqa.pages.US03_RadioButtonPage;
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

public class US03_RadioButtonStepDefinition {
    US03_RadioButtonPage radioButtonPage=new US03_RadioButtonPage();
     Driver driver;
     Actions actions=new Actions(Driver.getDriver());
    JavascriptExecutor js=(JavascriptExecutor) driver;

    @Given("click on RadioButton button")
    public void click_on_radio_button_button() {

//        actions.sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.waitFor(3);
       // js.executeScript("window.scrollBy(0,1000)");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        radioButtonPage.radioButtonText.click();
        ReusableMethods.waitFor(3);

    }

    @Given("click on Yes button")
    public void click_on_yes_button() {
        if(!radioButtonPage.yesButton.isSelected()){
            radioButtonPage.yesButton.click();
            //succes text verification
            Assert.assertTrue(radioButtonPage.succesText.isDisplayed());
            System.out.println("Yes button succes mesaji "+radioButtonPage.succesText.getText());
    }}

    @Then("verify the yes button is clicked")
    public void verify_the_yes_button_is_clicked() {
       Assert.assertTrue(radioButtonPage.yesButton.isSelected());
        }

    @Given("click on impresive button")
    public void click_on_impresive_button() {
    if(!radioButtonPage.impressive.isSelected()){
        radioButtonPage.impressive.click();
        //succes text verification
        Assert.assertTrue(radioButtonPage.succesText.isDisplayed());
        System.out.println(radioButtonPage.succesText.getText());
    }

    }

    @Then("verify that the yes button not clicked")
    public void verify_that_the_yes_button_not_clicked() {
     Assert.assertFalse(radioButtonPage.yesButton.isSelected());



    }

//    @Given("click on No button")
//    public void click_on_no_button() {
//    radioButtonPage.noButton.click();
//
//    }

    @Given("Verify that is no button clickable")
    public void verify_that_is_no_button_clickable() {
    if(radioButtonPage.noButton.isEnabled()){
        System.out.println("no button is enabled");
    }else{
        System.out.println("No Button is not working There is a bug");
    }
    }

    @Then("verify all buttons are clickable")
    public void verify_all_buttons_are_clickable() {
//        for (WebElement Buttons : radioButtonPage.AllRadioButton()) {
//            Assert.assertTrue(radioButtonPage.radioButtonText.isEnabled());
//        }
        radioButtonPage.noButton.click();
        Assert.assertTrue(radioButtonPage.noButton.isEnabled());

        Assert.assertTrue(radioButtonPage.noButton.isSelected());
      //  Assert.assertFalse(radioButtonPage.noButton.isEnabled());

    }


//
//        @Then("verify all successText")
//        public void verify_all_success_text() {
//            for (WebElement buttons:radioButtonPage.AllRadioButton()){
//                JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
//                js.executeScript("arguments[0].click();",buttons);
//                Assert.assertTrue(radioButtonPage.succesText.isDisplayed());
//                System.out.println(radioButtonPage.succesText.getText());
//            }


        }






