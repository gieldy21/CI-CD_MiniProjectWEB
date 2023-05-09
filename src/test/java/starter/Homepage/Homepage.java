package starter.Homepage;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Homepage extends PageObject {
    private By ProdukGiel(){
        return By.id("13684");
    }
    private By ProdukGiel2(){
        return By.id("13685");
    }
    private By ProdukGiel3(){
        return By.id("13686");
    }
    private By BeliProduk1(){
        return By.xpath("//*[@id=\"13684\"]/div/div[3]/div[2]/button[2]");
    }
    private By BeliProduk2(){
        return By.xpath("//*[@id=\"13685\"]/div/div[3]/div[2]/button[2]");
    }
    private By BeliProduk3(){
        return By.xpath("//*[@id=\"13686\"]/div/div[3]/div[2]/button[2]");
    }
    private By DetailProduk1(){
        return By.xpath("//*[@id=\"13684\"]/div/div[3]/div[2]/button[1]");
    }
    private By DetailProduk2(){
        return By.xpath("//*[@id=\"13685\"]/div/div[3]/div[2]/button[1]");
    }
    private By DetailProduk3(){
        return By.xpath("//*[@id=\"13686\"]/div/div[3]/div[2]/button[1]");
    }
    private By productdetail(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div");
    }

    private By popUp(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[1]/span/span/span/span");
    }

    @Step
    public static OpenUrl url(String targeturlhome){
        return new OpenUrl(targeturlhome);
    }
    @Step
    public void chooseProduct(){
        $(ProdukGiel()).isDisplayed();
    }
    @Step
    public void clickBeliProduk1(){
        $(BeliProduk1()).click();
    }
    @Step
    public void clickBeliProduk2(){
        $(BeliProduk2()).click();
    }
    @Step
    public void clickBeliProduk3(){
        $(BeliProduk3()).click();
    }
    @Step
    public void chooseProduct2(){
        $(ProdukGiel2()).click();
    }
    @Step
    public void chooseProduct3(){
        $(ProdukGiel3()).click();
    }
    @Step
    public void clickDetailProduk1(){
        $(DetailProduk1()).click();
    }
    @Step
    public void clickDetailProduk2(){
        $(DetailProduk2()).click();
    }
    @Step
    public void clickDetailProduk3(){
        $(DetailProduk3()).click();
    }
    @Step
    public void validatePopUp(){
        $(popUp()).isDisplayed();
    }
    @Step
    public void detailInformation(){
        $(productdetail()).isDisplayed();
    }
}
