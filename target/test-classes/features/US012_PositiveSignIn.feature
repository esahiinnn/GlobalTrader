
Feature: US012_Positive_SignIn

  Scenario: Gecerli Email ve gecerli password ile login olunmali
  Given Kullanici "global_trader_url" anasayfasina gider
  And kullanici Sing In linkine tiklar
  And kullanici emailTextBox'a gecerli bir "h_valid_email" adresi girer
  And kullanici passwordTextBox'a gecerli bir "h_valid_password" girer
  And kullanici Login butonuna tiklar
  Then kullanici "h_expected_url" sayfasinin görüntülendigini dogrular