package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US05_ButtonsPage {
    public  US05_ButtonsPage(){PageFactory.initElements(Driver.getDriver(),this);}

//    @FindBy(xpath = "(//li[@id='item-4'])[1]")
//    public WebElement button;
    @FindBy(xpath = "//span[contains(text(),'Buttons')]")
    public WebElement button;

    @FindBy(xpath = "//div[@class='main-header']")
    public WebElement ButtonsPage;

    @FindBy(id="doubleClickBtn")
    public WebElement doubleClickMe;

    @FindBy(id="rightClickBtn")
    public WebElement rightClickMe;

//    @FindBy(id="ks4Xo")
//    public WebElement clickMe;
//    @FindBy(xpath = "//button[@id='ks4Xo' and contains(.,'Click Me')]")
//    public WebElement clickMe;
@FindBy(xpath= "(//button[@class='btn btn-primary'])[3]")
public WebElement clickMe;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement dynamicClickMessage;
}
