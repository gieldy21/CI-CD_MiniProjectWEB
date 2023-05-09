package starter.order;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Order extends PageObject {

    private By orderPage(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]");
    }
    private By addQuantity(){
        return By.xpath("//*[@id=\"order-13684\"]/div[2]/button[2]");
    }
    private By reduceQuantity(){
        return By.xpath("//*[@id=\"order-13684\"]/div[2]/button[1]");
    }
    private By payButton(){
        return By.xpath("//*[@id=\"button-bayar\"]");
    }
    @Step
    public void validateGoToOrderPage(){
        $(orderPage()).click();
    }
    @Step
    public void clickAddQuantity(){
        $(addQuantity()).click();
    }
    @Step
    public void clickReduceQuantity(){
        $(reduceQuantity()).click();
    }
    @Step
    public void clickPayButton(){
        $(payButton()).click();
    }
}
