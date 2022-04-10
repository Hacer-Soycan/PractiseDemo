package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_CheckBoxPage {
    public US02_CheckBoxPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//span[contains(text(),'Check Box')]")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@class='rct-icon rct-icon-expand-all']")
    public WebElement plusSign;

    @FindBy(xpath = "//*[@class='rct-option rct-option-collapse-all']")
    public WebElement minusSign;

    @FindBy(xpath = "//div[@class='check-box-tree-wrapper']")
    public WebElement plusSignClick;

    @FindBy(xpath = "//button[@title='Toggle']//*[name()='svg']")
    public WebElement homeButtonDropdownSign;

//    @FindBy(xpath = "//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//button[@title='Toggle']//*[name()='svg']")
//    public WebElement desktopButtonDropdownSign;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button//*[name()='svg']")
    public WebElement desktopButtonDropdownSign;


    @FindBy(xpath = "(//span[@class=\"rct-checkbox\"])[3]")
    public WebElement notesButton;

    @FindBy(xpath = "//*[@class='rct-icon rct-icon-parent-close']")
    public WebElement closedHomeMenuVerification;

    @FindBy(xpath = "//*[@class='rct-icon rct-icon-expand-close']")
    public WebElement DesktopDropdown;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[3]")
    public WebElement NotesMenu;

    @FindBy(xpath = "(//span[@class='rct-checkbox'])[16]/..")
    public WebElement WordFileMenu;

//    @FindBy(css = "div#result.display-result.mt-4")
//    public WebElement chosenList;
    @FindBy(id="result")
    public WebElement chosenList;



}
