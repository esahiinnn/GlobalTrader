Feature: US009 Bir Seller olarak Seller Sign In sayfasinda emailtextbox,password textbox ve login butonunu gormeliyim

  Background:
    Given Kullanici GlobalTrader anasayfasina gider
    And Kullanici Seller sign in butonuna click yapar

  Scenario: TC21 Seller Sign in sayfasinda Email Textbox Kutusu gorunur olmali
    Then Kulanici Seller sign in sayfasinda email textbox kutusunun goruldugunu dogrular

  Scenario: TC22 Seller Sign in sayfasinda password Textbox Kutusu gorunur olmali
    Then Kulanici Seller sign in sayfasinda password textbox kutusunun goruldugunu dogrular

  Scenario: TC22 Seller Sign in sayfasinda login butonu gorunur olmali
    Then Kulanici Seller sign in sayfasinda login butonunun goruldugunu dogrular
