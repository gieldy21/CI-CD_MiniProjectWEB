package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidateHomepage extends PageObject {
    private By productsTitle(){
        return By.xpath("//button[@class='v-btn v-btn--icon v-btn--round theme--dark v-size--default']");
    }

    @Step
    public void validateOnTheHomePage(){
        $(productsTitle()).isDisplayed();
    }
}
