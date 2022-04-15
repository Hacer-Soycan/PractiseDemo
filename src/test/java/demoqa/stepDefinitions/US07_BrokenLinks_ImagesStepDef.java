package demoqa.stepDefinitions;

import demoqa.pages.US07_BrokenLinksPage;
import demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US07_BrokenLinks_ImagesStepDef {
    US07_BrokenLinksPage brokenLinksPage=new US07_BrokenLinksPage();
    Actions actions=new Actions(Driver.getDriver());
    Driver driver;
    @Given("click on Broken Links-Images button")
    public void click_on_broken_links_images_button() {
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    brokenLinksPage.brokenLinksButton.click();

    }

    @Given("Verify valid image is displayed")
    public void verify_valid_image_is_displayed() {
        Assert.assertTrue(brokenLinksPage.validImage.isDisplayed());
    }

    @Then("Verify the image is broken")
    public void verify_the_image_is_broken() {

                                                                //By.tagName("img")))
        for (WebElement image : Driver.getDriver().findElements(By.cssSelector("img"))) {
            if (image.getAttribute("naturalWidth").equals("0")) {
                System.out.println(image.getAttribute("outerHTML") + " is broken.");
            }
        }
    }

    @Then("Click on the valid Link button")
    public void click_on_the_valid_link_button() {
        brokenLinksPage.validLink.click();

    }

    @Then("verify the expected page is opened")
    public void verify_the_expected_page_is_opened() {
     String expectedUrl="https://demoqa.com/";
     String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
     Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("click on the broken link button")
    public void click_on_the_broken_link_button() {
    brokenLinksPage.brokenLink.click();
    }

    @Then("Verify the link is broken")
    public void verify_the_link_is_broken() {
    String expectedUrl="http://the-internet.herokuapp.com/status_codes/500";
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertEquals(actualUrl,expectedUrl);
        System.out.println(actualUrl);
    }
}
