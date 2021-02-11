
Feature: US_003_Bir_Agent_Seller_olarak_Email_textbox'ina_gecerli_bir_email_girerek_kayit_olunabilmeli.
@valid
  Scenario: TC001_Iceriginde_en_az_bir_karakterden_olusan_kullanici_ismi,@_sembolu,
  domain_name,_top_level_domain_name_olan_bir_email_Email_textbox'a_girildiginde_kayit_basarili_bir-sekilde_gerceklesmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_valid_email" girer.

    And Sub Domain textbox'ina "u_sub_domain" girer.

    And Mobile textbox'ina "u_mobile_number" girer.

    And Country drop down'a tiklar ve "u_country" secer.

    And State textbox'ina "u_state" girer.

    And City textbox'ina "u_city" girer.

    And Address textbox'ina "u_address" girer.

    And Enter Postal Code textbox'ina "u_postal_code" girer.

    And Categories drop down'a tiklar ve "u_categories" secer.

    And Password textbox'ina "u_password" girer.

    And Registration butonuna tiklar .

    And "Thank you to join our team. You are Registered Successfully." mesajini alir.