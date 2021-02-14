package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SubDomainAgenstsellerPage {

    public SubDomainAgenstsellerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()=' Seller Join Now']")
    public WebElement sellerJoinNowButton ;

    @FindBy(xpath = "//input[@value='A']")
    public WebElement agentSellerButton ;

    @FindBy(id = "vender_name")
    public WebElement nameTextBox ;

    @FindBy(id= "email")
    public WebElement emailTextBox ;

    @FindBy(id="sub_domain")
    public WebElement subdomainTextBox ;

    @FindBy(id = "vender_mobile")
    public WebElement mobileNumberTextBox ;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryDropdown ;

    @FindBy(id = "select_state")
    public WebElement stateTextBox ;

    @FindBy(id = "select_city")
    public WebElement cityTextBox ;

    @FindBy(id = "vender_address")
    public WebElement addressTextBox;

    @FindBy(id = "zip_code_input")
    public WebElement postalCodeTextBox;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement categoriesDropdown;

    @FindBy(id = "password")
    public  WebElement passwordTextBox;

    @FindBy(xpath = "//button[@value='Login']")
    public  WebElement registrationButton;


    @FindBy(xpath = "//*[text()='Thank you to join our team. You are Registered Successfully.'")
    public  WebElement successfullyMessage;

}



