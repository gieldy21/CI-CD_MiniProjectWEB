package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Homepage.Homepage;

public class HomepageSteps {
    @Steps
    Homepage homepage;

    @Given("I am on the home page")
    public void onTheHomePage(){
        homepage.openUrl("https://alta-shop.vercel.app");
    }
    @When("I choose the product")
    public void chooseTheProduct(){
        homepage.chooseProduct();
    }
    @And("I click buy button")
    public void clickBuyButton(){
        homepage.clickBeliProduk1();
    }
    @Then("I see the pop up product add to cart")
    public void seeProductToCart(){
        homepage.validatePopUp();
    }
    @And("I click buy button again")
    public void clickBuyButtonAgain(){
        homepage.clickBeliProduk1();
    }
    @And("I click buy button on product 2")
    public void clickBuyButton2(){
        homepage.clickBeliProduk2();
    }
    @And("I click buy button 3 times")
    public void clickBuyButton3Times(){
        homepage.clickBeliProduk1();
    }
    @And("I click buy button on product 3")
    public void clickBuyButton3(){
        homepage.clickBeliProduk3();
    }
    @And("I click detail button product 1")
    public void clickDetailButton1(){
        homepage.clickDetailProduk1();
    }
    @Then("I go to the detail information product")
    public void goToDetailInformation(){
        homepage.detailInformation();
    }
    @When("I choose the product 2")
    public void chooseTheProduct2(){
        homepage.chooseProduct2();
    }
    @And("I click detail button product 2")
    public void clickDetailButton2(){
        homepage.clickDetailProduk2();
    }
    @And("I choose the product 3")
    public void chooseTheProduct3(){
        homepage.chooseProduct3();
    }
    @And("I click detail button product 3")
    public void clickDetailButton3(){
        homepage.clickDetailProduk3();
    }

}
