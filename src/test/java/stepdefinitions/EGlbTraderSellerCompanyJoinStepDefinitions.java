package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.EGlobalTraderHomePage;
import pages.EGlobalTraderSellerCompanyJoinPage;
import utilities.ConfigReader;
import utilities.Driver;

public class  EGlbTraderSellerCompanyJoinStepDefinitions {

    EGlobalTraderHomePage eHomePage = new EGlobalTraderHomePage();
    EGlobalTraderSellerCompanyJoinPage eJoinPage = new EGlobalTraderSellerCompanyJoinPage();

    @Given("Kullanici GlobalTrader home page e gider")
    public void kullaniciGlobalTraderHomePageEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("global_trader_url"));
    }

    @When("Kullanici Seller Join Now butonuna basar")
    public void kullaniciSellerJoinNowButonunaBasar() {
        eHomePage.sellerJoinNowButton.click();
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
    public void kullaniciCompanyMobileTextboxInaValidBirDataGirer(String cmobile) {
        eJoinPage.companyMobileTextBox.sendKeys(ConfigReader.getProperty(cmobile));
    }

    @And("Kullanici Company Address textbox'ina {string} valid bir data girer")
    public void kullaniciCompanyAddressTextboxInaValidBirDataGirer(String caddress) {
        eJoinPage.companyAddressTextBox.sendKeys(ConfigReader.getProperty(caddress));
    }

    @And("Kullanici Name textbox'ina {string} valid bir data girer")
    public void kullaniciNameTextboxInaValidBirDataGirer(String name) {
        eJoinPage.nameTextBox.sendKeys(ConfigReader.getProperty(name));
    }

    @And("Kullanici Email textbox'ina {string} valid bir data girer")
    public void kullaniciEmailTextboxInaValidBirDataGirer(String email) {
        eJoinPage.emailTextBox.sendKeys(ConfigReader.getProperty(email));
    }

    @And("Kullanici Sub Domain textbox'ina {string} valid ve unique bir data girer")
    public void kullaniciSubDomainTextboxInaValidVeUniqueBirDataGirer(String subDomain) {
        eJoinPage.subDomainTextBox.sendKeys(ConfigReader.getProperty(subDomain));
    }

    @And("Kullanici Mobile Number textbox'ina {string} valid bir data girer")
    public void kullaniciMobileNumberTextboxInaValidBirDataGirer(String mobile) {
        eJoinPage.mobileNumberTextBox.sendKeys(ConfigReader.getProperty(mobile));
    }

    @And("Kullanici Country dropdown'undan {string} valid bir country secer")
    public void kullaniciCountryDropdownUndanValidBirCountrySecer(String country) {
        Select select = new Select(eJoinPage.countryDropDown);
        select.selectByVisibleText(ConfigReader.getProperty(country));

    }

    @And("Kullanici State textbox'ina {string} valid bir state girer")
    public void kullaniciStateTextboxInaValidBirStateGirer(String state) {
        eJoinPage.stateTextBox.sendKeys(ConfigReader.getProperty(state));
    }

    @And("Kullanici City textbox'ina {string} valid bir city girer")
    public void kullaniciCityTextboxInaValidBirCityGirer(String city) throws InterruptedException {
        eJoinPage.cityTextBox.sendKeys(ConfigReader.getProperty(city));
        Thread.sleep(1000);
    }

    @And("Kullanici Address textbox'ina {string} valid bir address girer")
    public void kullaniciAddressTextboxInaValidBirAddressGirer(String address) {
        eJoinPage.addressTextBox.sendKeys(ConfigReader.getProperty(address));
    }

    @And("Kullanici Enter Postal Code textbox'ina {string} valid bir data girer")
    public void kullaniciEnterPostalCodeTextboxInaValidBirDataGirer(String postalCode) {
        eJoinPage.postalCodeTextBox.sendKeys(ConfigReader.getProperty(postalCode));
    }

    @And("Kullanici Categories dropdown'undan {string} valid bir category secer")
    public void kullaniciCategoriesDropdownUndanValidBirCategorySecer(String categories) {
        Select select = new Select(eJoinPage.categoriesDropDown);
        select.selectByVisibleText(ConfigReader.getProperty(categories));
    }

    @And("Kullanici Password textbox'ina {string} valid bir data girer")
    public void kullaniciPasswordTextboxInaValidBirDataGirer(String password) {
        eJoinPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));
    }

    @And("Kullanici Registration butonuna basar")
    public void kullaniciRegistrationButonunaBasar() {
        eJoinPage.registrationButton.click();
    }

    @Then("Kullanici Registration butonuna bastiktan sonra site Basarili bir sekilde kayit oldunuz gibi bir mesaj vermeli")
    public void kullaniciRegistrationButonunaBastiktanSonraSiteBasariliBirSekildeKayitOldunuzGibiBirMesajVermeli() {
        Assert.assertEquals(ConfigReader.getProperty("e_confirm_message"), eJoinPage.confirmMessage.getText());
    }


}
