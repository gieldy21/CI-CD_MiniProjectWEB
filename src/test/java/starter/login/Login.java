package starter.login;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By EmailFieldLogin(){
        return By.id("input-18");
    }
    private By PasswordFieldLogin(){
        return By.id("input-21");
    }
    private By loginButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By messageError(){
        return By.xpath("//div[@class= 'v-alert__content']");
    }
    @Step
    public static OpenUrl url(String targeturllogin){
        return new OpenUrl(targeturllogin);
    }
    @Step
    public void inputEmailLogin(String emailLogin){
        $(EmailFieldLogin()).type(emailLogin);
    }
    @Step
    public void inputPasswordLogin(String passwordLogin){
        $(PasswordFieldLogin()).type(passwordLogin);
    }
    @Step
    public void clickLogButton(){
        $(loginButton()).click();
    }
    @Step
    public void inputInvalidFormatEmailLogin(String emailInvalidFormat){
        $(EmailFieldLogin()).type(emailInvalidFormat);
    }@Step
    public void inputUnregistEmailLogin(String emailUnregist){
        $(EmailFieldLogin()).type(emailUnregist);
    }
    @Step
    public boolean validateMessageError(){
        return $(messageError()).isDisplayed();
    }
    @Step
    public void inputInvalidPasswordLogin(String passwordInvalidLogin){
        $(PasswordFieldLogin()).type(passwordInvalidLogin);
    }
    @Step
    public void inputUppercasePasswordLogin(String passwordUppercase){
        $(PasswordFieldLogin()).type(passwordUppercase);
    }
}
