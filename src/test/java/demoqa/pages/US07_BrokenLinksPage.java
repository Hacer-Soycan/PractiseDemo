package demoqa.pages;

import demoqa.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_BrokenLinksPage {
    public US07_BrokenLinksPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "(//li[@id='item-6'])[1]")
    public WebElement brokenLinksButton;

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    public WebElement validImage;

    @FindBy(xpath = "//img[@src='/images/Toolsqa_1.jpg']")
    public WebElement brokenImage;

   @FindBy(linkText = "Click Here for Valid Link")
    public WebElement validLink;

   @FindBy(linkText = "Click Here for Broken Link")
    public WebElement brokenLink;

}
