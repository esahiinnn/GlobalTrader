package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HSGlobalTraderPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HSGlobalTraderSignInStepDefinitions {

 HSGlobalTraderPage hsGlobalTraderPage = new HSGlobalTraderPage();

 @Given("Kullanici {string} anasayfasina gider")
 public void kullanici_anasayfasina_gider(String url) {
  Driver.getDriver().get(ConfigReader.getProperty(url));
 }
 @Given("kullanici Sing In linkine tiklar")
 public void kullanici_sing_in_linkine_tiklar() {
  hsGlobalTraderPage.signInLink.click();

 }

 @Given("kullanici emailTextBox'a gecerli bir {string} adresi girer")
 public void kullanici_email_text_box_a_gecerli_bir_adresi_girer(String eMail) {
  hsGlobalTraderPage.emailTextBox.sendKeys(ConfigReader.getProperty(eMail));


 }

 @Given("kullanici passwordTextBox'a gecersiz bir {string} girer")
 public void kullanici_password_text_box_a_gecersiz_bir_girer(String password) {
  hsGlobalTraderPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));

 }

 @Given("kullanici Login butonuna tiklar")
 public void kullanici_login_butonuna_tiklar() {
  hsGlobalTraderPage.loginButton.click();

 }

 @Then("kullanici {string} nin goruntulendigini dogrular")
 public void kullanici_nin_goruntulendigini_dogrular(String string) {
  Assert.assertTrue(hsGlobalTraderPage.invalidMessage.isDisplayed());

 }

 @Given("kullanici emailTextBox'a gecersiz bir {string} girer")
 public void kullanici_email_text_box_a_gecersiz_bir_girer(String eMail) {
  hsGlobalTraderPage.emailTextBox.sendKeys(ConfigReader.getProperty(eMail));

 }

 @Given("kullanici passwordTextBox'a gecerli bir {string} girer")
 public void kullanici_password_text_box_a_gecerli_bir_girer(String password) {
  hsGlobalTraderPage.passwordTextBox.sendKeys(ConfigReader.getProperty(password));

 }

 @Then("kullanici {string} sayfasinin görüntülendigini dogrular")
 public void kullaniciSayfasininGörüntülendiginiDogrular(String url) {
  Assert.assertEquals(ConfigReader.getProperty(url), Driver.getDriver().getCurrentUrl());
 }
}

