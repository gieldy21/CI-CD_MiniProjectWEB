package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.order.Order;

public class OrderSteps {
    @Steps
    Order order;

    @And("I go to the order page")
    public void onTheOrderPage(){
        order.validateGoToOrderPage();
    }

    @Then("I click add quantity button")
    public void clickAddQuantityButton(){
        order.clickAddQuantity();
    }
    @Then("I click reduce quantity button")
    public void clickReduceQuantityButton(){
        order.clickReduceQuantity();
    }
    @Then("I click pay button")
    public void iClickPayButton(){
        order.clickPayButton();
    }
}
