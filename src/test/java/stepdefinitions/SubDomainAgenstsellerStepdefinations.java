package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.SubDomainAgenstsellerPage;
import utilities.ConfigReader;
import utilities.Driver;


public class SubDomainAgenstsellerStepdefinations {

    SubDomainAgenstsellerPage subDomainAgenstsellerPage=new SubDomainAgenstsellerPage();

    @When("kullanici glbtrader anasayfasina gider")
    public void kullaniciGlbtraderAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("sd_url"));
    }

    @Then("Yukarda bulunan Seller Join Now butonuna basar")
    public void yukarda_bulunan_seller_join_now_butonuna_basar() {
        subDomainAgenstsellerPage.sellerJoinNowButton.click();
    }

    @Then("Agent Seller butonunu secer")
    public void agent_seller_butonunu_secer() {
        subDomainAgenstsellerPage.agentSellerButton.click();
    }

    @And("Name textboxina {string}  girer")
    public void nameTextboxinaGirer(String name) {
        subDomainAgenstsellerPage.nameTextBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("Email textboxina {string} girer")
    public void emailTextboxinaGirer(String email) {
        subDomainAgenstsellerPage.emailTextBox.sendKeys(ConfigReader.getProperty(email));
    }

    @And("Sub Domain textboxina {string} girer")
    public void sub_domain_textboxina_girer(String subdomain) {
        subDomainAgenstsellerPage.subdomainTextBox.sendKeys(ConfigReader.getProperty(subdomain));

    }

    @And("Mobile Number textboxina {string} girer")
    public void mobile_number_textboxina_girer(String number) {
        subDomainAgenstsellerPage.mobileNumberTextBox.sendKeys(ConfigReader.getProperty(number));
    }

    @And("Country dropdownundan {string} secer")
    public void country_dropdownundan_secer(String country) {

        Select select=new Select(subDomainAgenstsellerPage.countryDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(country));

    }

    @And("State textboxina {string} girer")
    public void state_textboxina_girer(String state) {
        subDomainAgenstsellerPage.stateTextBox.sendKeys(ConfigReader.getProperty(state));
    }

    @And("City textboxina {string} girer")
    public void city_textboxina_girer(String city) {
        subDomainAgenstsellerPage.cityTextBox.sendKeys(ConfigReader.getProperty(city));

    }

    @And("Address textboxina {string} girer")
    public void address_textboxina_girer(String address) {
        subDomainAgenstsellerPage.addressTextBox.sendKeys(ConfigReader.getProperty(address));

    }

    @And("EnterPostalCode textboxina {string} girer")
    public void enter_postal_code_textboxina_girer(String postalcode) {
        subDomainAgenstsellerPage.postalCodeTextBox.sendKeys(ConfigReader.getProperty(postalcode));

    }

    @And("Categories dropdownundan {string} secer")
    public void categories_dropdownundan_secer(String category) {

        Select select = new Select(subDomainAgenstsellerPage.categoriesDropdown);
        select.selectByVisibleText(ConfigReader.getProperty(category));

    }

    @And("Password textboxina {string} girer")
    public void password_textboxina_girer(String password) {
        subDomainAgenstsellerPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));

    }



    @And("Registration butonuna basar")
    public void registration_butonuna_basar() {
        subDomainAgenstsellerPage.registrationButton.click();
    }

    @Then("Successfully mesaji gorunur.")
    public void successfullyMesajiGorunur() {
        Assert.assertTrue(subDomainAgenstsellerPage.successfullyMessage.getText().contains(ConfigReader.getProperty("sd_successfully")));
    }


    @Then("Successfully mesaji gorunmez.")
    public void successfullyMesajiGorunmez() {
        Assert.assertFalse(subDomainAgenstsellerPage.successfullyMessage.getText().contains(ConfigReader.getProperty("sd_successfully")));
    }


}
