package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US01_TextBoxPage {
    public US01_TextBoxPage(){ PageFactory.initElements(Driver.getDriver(),this); }
//    @FindBy(linkText = "Elements")
//    public WebElement elementCard;

//    @FindBy(css = "div.card-up")
//    public WebElement elementCard;

//    @FindBy(xpath = "//h5[contains(text(),'Elements')]")
//    public WebElement elementCard;
    @FindBy(xpath = "//h5[normalize-space()='Elements']")
    public WebElement elementCard;

    @FindBy(xpath = "//span[contains(text(),'Text Box')]")
    public WebElement textBoxMenuLink;


//    @FindBy(css = "span.text")
//    public WebElement textBoxMenuLink;

    @FindBy(xpath = "//input[@id='userName']")
    public WebElement fullNameTextBox;

    @FindBy(xpath = "//input[@id='userEmail']")
    public WebElement emailTextBox;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressTextBox;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressTextBox;

    @FindBy(xpath = "//button[@id='submit'or @class='btn btn-primary']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
    public WebElement registrationInfo;





}
