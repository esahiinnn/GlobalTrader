package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HSGlobalTraderPage {

    public HSGlobalTraderPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(linkText = "Sign In")
    public WebElement signInLink;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(name = "submit")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Login Details Wrong Please Enter Correct Login Details.']")
    public WebElement invalidMessage;

}
