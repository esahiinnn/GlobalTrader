package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EGlobalTraderHomePage {

    public EGlobalTraderHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()=' Seller Join Now']")
    public WebElement sellerJoinNowButton;

}
