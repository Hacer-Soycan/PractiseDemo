package demoqa.pages;

import demoqa.utilities.Driver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US03_RadioButtonPage {
    public US03_RadioButtonPage(){ PageFactory.initElements(Driver.getDriver(),this);}

//    @FindBy(xpath = "//span[.='Radio Button']")
//    public WebElement radioButtonText;

    @FindBy(xpath = "//span[contains(text(),'Radio Button')]")
    public WebElement radioButtonText;

    @FindBy(css = "label.custom-control-label")
    public WebElement yesButton;

    @FindBy(xpath = "(//label[@class='custom-control-label'])[2]")
    public WebElement impressive;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label")
    public WebElement noButton;

//    public List<WebElement>AllRadioButton(){
//        List<WebElement>allRadioButton=new ArrayList<>();
//        allRadioButton.add(yesButton);
//        allRadioButton.add(impressive);
//        //allRadioButton.add(noButton);
//        return AllRadioButton();
//    }

    @FindBy(xpath = "//span[@class='text-success']")
    public WebElement succesText;


}
