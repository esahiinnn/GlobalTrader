package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.UGlobalTraderAgentSellerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class UGlbTraderAgentSellerJoinEmailStepDefinitions {

    UGlobalTraderAgentSellerPage agentSellerPageagent = new UGlobalTraderAgentSellerPage();


    @When("kullanici {string} adresine gider.")
    public void kullanici_adresine_gider(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("Seller Join Now butonuna tiklar.")
    public void seller_join_now_butonuna_tiklar() {
        agentSellerPageagent.sellerJoinNowButton.click();

    }

    @Then("Agent Seller butonuna tiklar.")
    public void agent_seller_butonuna_tiklar() {
        agentSellerPageagent.agentSellerRadioButton.click();

    }

    @Then("Name textbox'ina {string} girer.")
    public void name_textbox_ina_girer(String name) {
        agentSellerPageagent.nameBox.sendKeys(ConfigReader.getProperty(name));

    }

    @Then("Email textbox'ina {string} girer.")
    public void email_textbox_ina_girer(String email) {
        agentSellerPageagent.emailBox.sendKeys(ConfigReader.getProperty(email));

    }

    @Then("Sub Domain textbox'ina {string} girer.")
    public void sub_domain_textbox_ina_girer(String subdomain) {
        agentSellerPageagent.subDomainBox.sendKeys(ConfigReader.getProperty(subdomain));

    }

    @Then("Mobile textbox'ina {string} girer.")
    public void mobile_textbox_ina_girer(String number) {
        agentSellerPageagent.mobileNumberBox.sendKeys(ConfigReader.getProperty(number));

    }

    @Then("Country drop down'a tiklar ve {string} secer.")
    public void country_drop_down_a_tiklar_ve_secer(String country) {
        Select select = new Select( agentSellerPageagent.countryDropDown);
        select.selectByVisibleText(ConfigReader.getProperty(country));

    }

    @Then("State textbox'ina {string} girer.")
    public void state_textbox_ina_girer(String state) {
        agentSellerPageagent.stateBox.sendKeys(ConfigReader.getProperty(state));

    }

    @Then("City textbox'ina {string} girer.")
    public void city_textbox_ina_girer(String city) {
        agentSellerPageagent.cityBox.sendKeys(ConfigReader.getProperty(city));

    }

    @Then("Address textbox'ina {string} girer.")
    public void address_textbox_ina_girer(String adres) {
        agentSellerPageagent.addressBox.sendKeys(ConfigReader.getProperty(adres));

    }

    @Then("Enter Postal Code textbox'ina {string} girer.")
    public void enter_postal_code_textbox_ina_girer(String postalcode) {
        agentSellerPageagent.enterPostalCodeBox.sendKeys(ConfigReader.getProperty(postalcode));

    }

    @Then("Categories drop down'a tiklar ve {string} secer.")
    public void categories_drop_down_a_tiklar_ve_secer(String categories) {
        Select select = new Select(agentSellerPageagent.categoriesDropDown);
        select.selectByVisibleText(ConfigReader.getProperty(categories));

    }

    @Then("Password textbox'ina {string} girer.")
    public void password_textbox_ina_girer(String password) {
        agentSellerPageagent.passwordBox.sendKeys(ConfigReader.getProperty(password));

    }

    @Then("Registration butonuna tiklar .")
    public void registration_butonuna_tiklar() {
        agentSellerPageagent.registrationButton.click();

    }

    @Then("{string} mesajini alir.")
    public void mesajini_alir(String string) {
        Assert.assertTrue(agentSellerPageagent.successfullyMesaji.isDisplayed());


    }

    @Then("Email textbox'ina data girmez.")
    public void email_textbox_ina_data_girmez() {

    }

    @Then("Email textbox uyari verir ve {string} mesaji alinmaz.")
    public void email_textbox_uyari_verir_ve_mesaji_alinmaz(String string) {

        Assert.assertTrue(agentSellerPageagent.emailBox.isEnabled());

    }


    @And("Kayit gerceklesmez ve {string} mesaji gorunur.")
    public void kayitGerceklesmezVeMesajiGorunur(String arg0) {

        Assert.assertTrue(agentSellerPageagent.pleaseMesaji.isDisplayed());


    }
}
