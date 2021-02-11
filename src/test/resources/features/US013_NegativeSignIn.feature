
Feature: US013_Negative_SignIn

  Background:
    Given Kullanici "global_trader_url" anasayfasina gider
    And kullanici Sing In linkine tiklar

  Scenario: TC_001 Gecerli Email ve gecersiz password ile login olunmamali

    And kullanici emailTextBox'a gecerli bir "h_valid_email" adresi girer
    And kullanici passwordTextBox'a gecersiz bir "h_invalid_password" girer
    And kullanici Login butonuna tiklar
    Then kullanici "h_invalid_message" nin goruntulendigini dogrular

  Scenario: TC_002 Gecersiz Email ve gecerli password ile login olunmamali

    And kullanici emailTextBox'a gecersiz bir "h_invalid_email" girer
    And kullanici passwordTextBox'a gecerli bir "h_valid_password" girer
    And kullanici Login butonuna tiklar
    Then kullanici "h_invalid_message" nin goruntulendigini dogrular

  Scenario: TC_003 Gecersiz Email ve gecersiz password ile login olunmamali

    And kullanici emailTextBox'a gecersiz bir "h_invalid_email" girer
    And kullanici passwordTextBox'a gecersiz bir "h_invalid_password" girer
    And kullanici Login butonuna tiklar
    Then kullanici "h_invalid_message" nin goruntulendigini dogrular