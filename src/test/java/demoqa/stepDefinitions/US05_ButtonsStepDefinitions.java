package demoqa.stepDefinitions;

import demoqa.pages.US05_ButtonsPage;
import demoqa.utilities.Driver;
import demoqa.utilities.JSUtils;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class US05_ButtonsStepDefinitions {
    Actions actions=new Actions(Driver.getDriver());
    US05_ButtonsPage buttonsPage=new US05_ButtonsPage();
    JavascriptExecutor jsexecutor;
    Driver driver;

    @Given("click on Buttons button")
    public void click_on_buttons_button() {
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(3);
        //buttonsPage.button.click();
        JSUtils.clickElementByJS(buttonsPage.button);
    }

    @Given("Verify that the buttons page opened")
    public void verify_that_the_buttons_page_opened() {
    Assert.assertTrue(buttonsPage.ButtonsPage.isDisplayed());
    }

    @Given("Click on the Double Click Me button")
    public void click_on_the_double_click_me_button() {
    actions.doubleClick(buttonsPage.doubleClickMe).perform();
    //JSUtils.doubleClickByJS(buttonsPage.doubleClickMe);
       // ((JavascriptExecutor)driver).executeScript("arguments[0].doubleClick();", buttonsPage.doubleClickMe);
    }

    @Then("verify double click message")
    public void verify_double_click_message() {
     Assert.assertTrue(buttonsPage.doubleClickMessage.getText().equals("You have done a double click"));
    }

    @Given("Click on the Right Click Me button")
    public void click_on_the_right_click_me_button() {
    actions.contextClick(buttonsPage.rightClickMe).perform();
    }

    @Then("verify right click me message")
    public void verify_right_click_me_message() {
    Assert.assertTrue(buttonsPage.rightClickMessage.getText().contains("You have done a right click"));
    }

    @Given("Click on the Click Me button")
    public void click_on_the_click_me_button() {
    actions.click(buttonsPage.clickMe).perform();
    }

    @Then("verify click me message")
    public void verify_click_me_message() {
    Assert.assertTrue(buttonsPage.dynamicClickMessage.isDisplayed());
    }

}
