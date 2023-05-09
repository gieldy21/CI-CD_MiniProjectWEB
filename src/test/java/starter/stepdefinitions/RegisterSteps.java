package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import starter.register.Register;
import starter.register.ValidateLogin;

public class RegisterSteps {
    @Steps
    Register register;
    @Steps
    ValidateLogin validatelogin;

    @Given("I am on the register page")
    public void onTheRegisterPage(){
        register.openUrl("https://alta-shop.vercel.app/auth/register");
    }
    @When("I enter full name")
    public void enterFullName(){
        register.inputFullName("Testing Web");
    }
    @And("I enter valid email")
    public void enterValidEmail(){
        register.inputEmail("akuntestinggieldyy@gmail.com");
    }
    @And("I enter valid password")
    public void enterValidPassword(){
        register.inputPassword("test21");
    }
    @And("click register button")
    public void clickRegButton(){
        register.clickRegButton();
    }
    @Then("I go to the login page")
    public void goToTheLoginpage(){
        validatelogin.validateOnTheLoginPage();
    }

    @And("I enter invalid email")
    public void enterInvalidEmail(){
        register.inputInvalidEmail("akuntestinggieldyy");
    }
    @Then("I see the error message")
    public void seeErrorMassage() {
        register.validateErrorMessage();
    }
    @And("I enter already used email")
    public void enterUsedValidEmail(){
        register.inputUsedEmail("akuntestinggieldy@gmail.com");
    }
    @And("I enter does not exist email")
    public void enterDoesNotExistEmail(){
        register.inputDoesNotExistEmail("akuntestinggieldy211@gmail.com");
    }


    @When("I not enter full name")
    public void notEnterFullName(){
        register.notInputFullName("");
    }
    @And("I not enter valid email")
    public void notEnterValidEmail(){
        register.notInputEmail("");
    }
    @And("I not enter valid password")
    public void notEnterValidPassword(){
        register.notInputPassword("");
    }
}
