package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EGlobalTraderSellerCompanyJoinPage {

    public EGlobalTraderSellerCompanyJoinPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement companySellerRadioButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement companyNameTextBox;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement companyMobileTextBox;

    @FindBy(id = "company_address")
    public WebElement companyAddressTextBox;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement nameTextBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement subDomainTextBox;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement mobileNumberTextBox;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryDropDown;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement stateTextBox;

    @FindBy(xpath = "(//input[@type='text'])[8]")
    public WebElement cityTextBox;

    @FindBy(xpath = "(//textarea)[2]")
    public WebElement addressTextBox;

    @FindBy(xpath = "(//input[@type='text'])[9]")
    public WebElement postalCodeTextBox;

    @FindBy(xpath = "(//select)[3]")
    public WebElement categoriesDropDown;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registrationButton;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement confirmMessage;
}
