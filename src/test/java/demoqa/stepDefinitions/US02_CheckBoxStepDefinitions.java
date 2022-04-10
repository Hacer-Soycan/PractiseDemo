package demoqa.stepDefinitions;

import demoqa.pages.US01_TextBoxPage;
import demoqa.pages.US02_CheckBoxPage;
import demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.groovy.parser.antlr4.GroovyParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US02_CheckBoxStepDefinitions {
    US02_CheckBoxPage checkBoxPage=new US02_CheckBoxPage();
    Driver driver;

    @Given("click on CheckBox button")
    public void click_on_check_box_button() {
       checkBoxPage.checkBox.click();
    }

    @Given("click on plus sign")
    public void click_on_plus_sign() {
        checkBoxPage.plusSign.click();
    }

    @Then("Verify that the whole menu opens")
    public void verify_that_the_whole_menu_opens() {

//ReusableMethods.waitFor(3);
        String menu = checkBoxPage.plusSignClick.getText();
        //System.out.println(menu);

//        // split string by no space
        String[] strSplit = menu.split(" ");

        System.out.println(Arrays.toString(strSplit));
        //System.out.println(strSplit[2]);

        // Now convert string into ArrayList
       // List<String> strList = new ArrayList<>(Arrays.asList(strSplit));

        // Now print the ArrayList
//        for (String s : strList){
//            strList.add(s);
//        }
//        System.out.println(strList.size());

    }


    @Then("click on minus sign")
    public void click_on_minus_sign() {
        checkBoxPage.minusSign.click();
    }

    @Then("Verify that the menu is closed")
    public void verify_that_the_menu_is_closed() {
        Assert.assertTrue(checkBoxPage.closedHomeMenuVerification.isDisplayed());
    }
        @Then("click on plus sign button")
        public void click_on_plus_sign_button() {
           checkBoxPage.plusSign.click();
        }


//    @Then("Click on Desktop drodown")
//    public void click_on_desktop_drodown() {
//        checkBoxPage.DesktopDropdown.click();
//


    @Then("Click on Notes button")
    public void click_on_notes_button() {
        checkBoxPage.NotesMenu.click();

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");


    }

//    @Then("click on Downloads button")
//    public void click_on_downloads_button() {
//       checkBoxPage.desktopButtonDropdownSign.click();
//    }

//    @Then("click on Wordfile button")
//    public void click_on_wordfile_button() {
//
//        checkBoxPage.WordFileMenu.click();
//    }

    @Then("verify chosen dropdowns")
    public void verify_chosen_dropdowns() {
      String list=checkBoxPage.chosenList.getText();

      String[] splitList=list.split(" ");
        System.out.println(Arrays.toString(splitList));


    }




}
