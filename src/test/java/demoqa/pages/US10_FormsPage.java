package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US10_FormsPage {
    public US10_FormsPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//h5[contains(text(),'Forms')]")
    public WebElement formsButton;

    @FindBy(linkText = "Practice Form")
    public WebElement practiseForm;

}
