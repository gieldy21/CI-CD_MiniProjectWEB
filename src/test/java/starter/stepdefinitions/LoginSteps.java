package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;
import starter.login.ValidateHomepage;

public class LoginSteps {
    @Steps
    Login login;
    @Steps
    ValidateHomepage validatehomepage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
    }
    @When("I enter valid email login")
    public void enterValidEmailLogin(){
        login.inputEmailLogin("akuntestinggieldy@gmail.com");
    }
    @And("I enter valid password login")
    public void enterValidPasswordLogin(){
        login.inputPasswordLogin("test21");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.clickLogButton();
    }
    @Then("I go to the Homepage")
    public void goToTheHomepage(){
        validatehomepage.validateOnTheHomePage();
    }
    @When("I enter invalid format email login")
    public void enterinvalidFormatEmailLogin(){
        login.inputInvalidFormatEmailLogin("akuntestinggieldyy");
    }
    @When("I enter unregistered email login")
    public void enterUnregistEmailLogin(){
        login.inputUnregistEmailLogin("akuntesting22@gmail.com");
    }
    @Then("I see error message")
    public void seeErrorMessage(){
        login.validateMessageError();
    }
    @And("I enter invalid password login")
    public void enterInvalidPasswordLogin(){
        login.inputInvalidPasswordLogin("test");
    }
    @And("I enter valid password but uppercase")
    public void enterUppercasePassword(){
        login.inputUppercasePasswordLogin("TEST21");
    }
}
