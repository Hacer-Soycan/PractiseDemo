package demoqa.stepDefinitions;

import com.github.javafaker.Faker;
import demoqa.pages.US10_FormsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US10_FormsStepDefinitios {
    US10_FormsPage formsPage=new US10_FormsPage();
    Faker faker=new Faker();


    @Given("Click on the Forms")
    public void click_on_the_forms() {
     formsPage.formsButton.click();
    }

    @Given("Click on the Practise Form")
    public void click_on_the_practise_form() {
        formsPage.practiseForm.click();
    }

    @Then("Validate Student Registration Form")
    public void validate_student_registration_form() {

    }



}
