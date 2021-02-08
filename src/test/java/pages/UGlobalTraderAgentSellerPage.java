package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UGlobalTraderAgentSellerPage {

    public UGlobalTraderAgentSellerPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[text()=' Seller Join Now']")
    public WebElement sellerJoinNowButton;

    @FindBy(id = "id=vender_type")
    public WebElement agentSellerRadioButton;

    @FindBy(id="vender_name")
    public WebElement nameBox;

    @FindBy(id= "email")
    public WebElement emailBox;

    @FindBy(id="sub_domain")
    public WebElement subDomainBox;

    @FindBy(id = "vender_mobile")
    public WebElement mobileNumberBox;

    @FindBy(name = "country")
    public WebElement countryDropDown;

    @FindBy(id = "select_state")
    public WebElement stateBox;

    @FindBy(id ="select_city")
    public WebElement cityBox;

    @FindBy(id = "vender_address")
    public WebElement addressBox;

    @FindBy(id = "zip_code_input")
    public WebElement enterPostalCodeBox;

    @FindBy(name = "category")
    public WebElement categoriesDropDown;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(className = "btn btn-lg btn-warning")
    public WebElement registrationBox;





}
