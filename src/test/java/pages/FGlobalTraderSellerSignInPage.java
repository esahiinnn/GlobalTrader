package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FGlobalTraderSellerSignInPage {
    public FGlobalTraderSellerSignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-users']")
    public WebElement signInButtonu;
    @FindBy(xpath = "//input[@name='loginname']")
    public WebElement emailTextboxKutusu;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordKutusu;
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButonu;
}
