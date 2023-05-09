package starter.register;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {
    private By FullNameField() {
        return By.id("input-18");
    }
    private By EmailField(){
        return By.id("input-21");
    }
    private By PasswordField(){
        return By.id("input-24");
    }
    private By registerButton(){
        return By.xpath("//button[@class= 'v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--default primary']");
    }
    private By errorMessage(){
        return By.xpath("//div[@class= 'v-alert__content']");
    }
    @Step
    public boolean validateErrorMessage(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl(targeturl);
    }
    @Step
    public void inputFullName(String fullname){
        $(FullNameField()).type(fullname);
    }
    @Step
    public void inputEmail(String email){
        $(EmailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(PasswordField()).type(password);
    }
    @Step
    public void clickRegButton(){
        $(registerButton()).click();
    }
    @Step
    public void inputInvalidEmail(String invalidemail){
        $(EmailField()).type(invalidemail);
    }
    @Step
    public void inputUsedEmail(String usedemail){
        $(EmailField()).type(usedemail);
    }
    @Step
    public void inputDoesNotExistEmail(String notexistemail){
        $(EmailField()).type(notexistemail);
    }

    @Step
    public void notInputFullName(String notfillfullname){
        $(FullNameField()).type(notfillfullname);
    }
    @Step
    public void notInputEmail(String notfillemail){
        $(EmailField()).type(notfillemail);
    }
    @Step
    public void notInputPassword(String notfillpassword){
        $(PasswordField()).type(notfillpassword);
    }
}
