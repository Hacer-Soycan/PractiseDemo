package demoqa.stepDefinitions;

import demoqa.pages.US06_LinksPage;
import demoqa.utilities.Driver;
import demoqa.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class US06_LinksStepDefinitions {

   US06_LinksPage linksPage=new US06_LinksPage();
   Actions actions=new Actions(Driver.getDriver());
    List<WebElement> list=Driver.getDriver().findElements(By.tagName("a"));

    @Given("click on Links button")
    public void click_on_links_button() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        linksPage.LinksButton.click();
 }


    @Given("Find the size of links")
    public void find_the_size_of_links() {

        System.out.println("size of Links "+list.size());
        for(WebElement  link:list){
            System.out.println(link.getText());
        }
    }

    @Given("Write all link text")
    public void write_all_link_text() {


    }

    @Then("verify the link text messages")
    public void verify_the_link_text_messages() {
    for(WebElement msg:list){
        msg.click();
        System.out.println( linksPage.linkResponse);
    }
    }



}
