@wip
Feature: US005_SubDomain_Agenstseller
  Scenario: TC001_AgentSeller_olarak_SubDomain_textboxina_unique_subdomain_girildiginde_basariyla_kayit_olabilmeliyim
    When kullanici glbtrader anasayfasina gider
    Then Yukarda bulunan Seller Join Now butonuna basar
    Then Agent Seller butonunu secer
    And Name textboxina "sd_name1"  girer
    And Email textboxina "sd_mail1" girer
    And Sub Domain textboxina "sd_subdomain" girer
    And Mobile Number textboxina "sd_number1" girer
    And Country dropdownundan "sd_country" secer
    And State textboxina "sd_state" girer
    And City textboxina "sd_city1" girer
    And Address textboxina "sd_address1" girer
    And EnterPostalCode textboxina "sd_postalcode1" girer
    And Categories dropdownundan "sd_categories1" secer
    And Password textboxina "sd_password" girer
    And Registration butonuna basar
    Then Successfully mesaji gorunur.



  Scenario: TC002_AgentSeller_olarak_SubDomain_textboxina_unique_olmayan_subdomain_girildiginde_kayıt_olamamaliyim
    When kullanici glbtrader anasayfasina gider
    Then Yukarda bulunan Seller Join Now butonuna basar
    Then Agent Seller butonunu secer
    And Name textboxina "sd_name2"  girer
    And Email textboxina "sd_mail2" girer
    And Sub Domain textboxina "sd_subdomain" girer
    And Mobile Number textboxina "sd_number2" girer
    And Country dropdownundan "sd_country" secer
    And State textboxina "sd_state" girer
    And City textboxina "sd_city2" girer
    And Address textboxina "sd_address1" girer
    And EnterPostalCode textboxina "sd_postalcode2" girer
    And Categories dropdownundan "sd_categories2" secer
    And Password textboxina "sd_password" girer
    And Registration butonuna basar
    Then Successfully mesaji gorunmez.
