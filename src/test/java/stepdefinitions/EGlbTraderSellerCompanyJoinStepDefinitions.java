package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EGlobalTraderHomePage;
import pages.EGlobalTraderSellerCompanyJoinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class EGlbTraderSellerCompanyJoinStepDefinitions {

    EGlobalTraderSellerCompanyJoinPage eJoinPage = new EGlobalTraderSellerCompanyJoinPage();

    @Given("Kullanici GlobalTrader home page e gider")
    public void kullaniciGlobalTraderHomePageEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("global_trader_url"));
    }

    @When("Kullanici Seller Join Now butonuna basar")
    public void kullaniciSellerJoinNowButonunaBasar() {
        EGlobalTraderHomePage.sellerJoinNowButton.click();
    }

    @Then("Kullanici Company Seller radio butonunun secer")
    public void kullaniciCompanySellerRadioButonununSecer() {
        eJoinPage.companySellerRadioButton.click();
    }

    @And("Kullanici Company Name textbox'ina {string} valid bir data girer")
    public void kullaniciCompanyNameTextboxInaValidBirDataGirer(String name) {
        eJoinPage.companyNameTextBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("Kullanici Company Mobile textbox'ina {string} valid bir data girer")
    public void kullaniciCompanyMobileTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Company Address textbox'ina {string} valid bir data girer")
    public void kullaniciCompanyAddressTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Name textbox'ina {string} valid bir data girer")
    public void kullaniciNameTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Email textbox'ina {string} valid bir data girer")
    public void kullaniciEmailTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Sub Domain textbox'ina {string} valid ve unique bir data girer")
    public void kullaniciSubDomainTextboxInaValidVeUniqueBirDataGirer(String arg0) {
    }

    @And("Kullanici Mobile Number textbox'ina {string} valid bir data girer")
    public void kullaniciMobileNumberTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Country dropdown'undan {string} valid bir country secer")
    public void kullaniciCountryDropdownUndanValidBirCountrySecer(String arg0) {
    }

    @And("Kullanici State textbox'ina {string} valid bir state girer")
    public void kullaniciStateTextboxInaValidBirStateGirer(String arg0) {
    }

    @And("Kullanici City textbox'ina {string} valid bir city girer")
    public void kullaniciCityTextboxInaValidBirCityGirer(String arg0) {
    }

    @And("Kullanici Address textbox'ina {string} valid bir address girer")
    public void kullaniciAddressTextboxInaValidBirAddressGirer(String arg0) {
    }

    @And("Kullanici Enter Postal Code textbox'ina {string} valid bir data girer")
    public void kullaniciEnterPostalCodeTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Categories dropdown'undan {string} valid bir category secer")
    public void kullaniciCategoriesDropdownUndanValidBirCategorySecer(String arg0) {
    }

    @And("Kullanici Password textbox'ina {string} valid bir data girer")
    public void kullaniciPasswordTextboxInaValidBirDataGirer(String arg0) {
    }

    @And("Kullanici Registration butonuna basar")
    public void kullaniciRegistrationButonunaBasar() {
    }

    @Then("Kullanici Registration butonuna bastiktan sonra site Basarili bir sekilde kayit oldunuz gibi bir mesaj vermeli")
    public void kullaniciRegistrationButonunaBastiktanSonraSiteBasariliBirSekildeKayitOldunuzGibiBirMesajVermeli() {
    }


}
