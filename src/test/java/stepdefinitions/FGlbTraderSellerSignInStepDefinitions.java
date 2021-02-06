package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FGlobalTraderSellerSignInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class FGlbTraderSellerSignInStepDefinitions {
    FGlobalTraderSellerSignInPage fGlobalTraderSellerSignInPage=new FGlobalTraderSellerSignInPage();

    @Given("Kullanici GlobalTrader anasayfasina gider")
    public void kullanici_global_trader_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("global_trader_url"));
    }

    @Given("Kullanici Seller sign in butonuna click yapar")
    public void kullanici_seller_sign_in_butonuna_click_yapar() {
      fGlobalTraderSellerSignInPage.signInButtonu.click();
    }

    @Then("Kulanici Seller sign in sayfasinda email textbox kutusunun goruldugunu dogrular")
    public void kulanici_seller_sign_in_sayfasinda_email_textbox_kutusunun_goruldugunu_dogrular() {
        Assert.assertTrue(fGlobalTraderSellerSignInPage.emailTextboxKutusu.isDisplayed());
    }

    @Then("Kulanici Seller sign in sayfasinda password textbox kutusunun goruldugunu dogrular")
    public void kulanici_seller_sign_in_sayfasinda_password_textbox_kutusunun_goruldugunu_dogrular() {
       Assert.assertTrue(fGlobalTraderSellerSignInPage.passwordKutusu.isDisplayed());
    }

    @Then("Kulanici Seller sign in sayfasinda login butonunun goruldugunu dogrular")
    public void kulanici_seller_sign_in_sayfasinda_login_butonunun_goruldugunu_dogrular() {
      Assert.assertTrue( fGlobalTraderSellerSignInPage.loginButonu.isDisplayed());
    }

}
