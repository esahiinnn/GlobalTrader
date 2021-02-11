Feature: US_014_Bir_Agent_Seller_olarak_Email_textbox'ina_invalid_bir_email_girildiginde_veya_Email_
         textbox'i_bos_birakildiginda_kayit_gerceklesmemeli.

  @birinci
  Scenario:TC001_Email_textbox_bos_birakildiginda_kayit_gerceklesmemeli_ve_Email_textbox_uyari_vermeli._
  ve-"Thank_you_to_join_our_team.You_are_Registered_Successfully."_mesaji_alinmamali.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina data girmez.

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

    And Email textbox uyari verir ve "Thank you to join our team. You are Registered Successfully." mesaji alinmaz.

  @ikinci
  Scenario: TC002_Email_textbox'ina_girilen_email_en_az_1_karakterden_olusan_kullanici_ismi_icermiyorsa_
  kayit-gerceklesmemeli_ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email1" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.
@ucuncu
  Scenario: TC003_Email_textbox'ina_girilen_email_@_sembolu_icermiyorsa_kayit_gerceklesmemeli_
            ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email2" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.
@dorduncu
  Scenario: TC004_Email_textbox'ina_girilen_email_@_sembolunden_once_veya_sonra_bosluk_iceriyorsa_
            kayit_gerceklesmemeli_ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email3" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.
  @besinci
  Scenario: TC004_Email_textbox'ina_girilen_email_domain_name_icermiyorsa_kayit_gerceklesmemeli_
             ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email4" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.
   @altinci
  Scenario: TC004_Email_textbox'ina_girilen_email_top_level_domain_icermiyorsa_kayit_gerceklesmemeli_
  ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email5" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.
  @yedinci
  Scenario: TC004_Email_textbox'ina_girilen_email_domain_name_ve_top_level_domain_arasinda_"."_icermiyorsa_kayit_gerceklesmemeli_
  ve_"Please_Enter_Valid_Email_Address"_mesaji_gorunmeli.

    When kullanici "global_trader_url" adresine gider.

    Then Seller Join Now butonuna tiklar.

    And Agent Seller butonuna tiklar.

    And Name textbox'ina "u_name" girer.

    And Email textbox'ina "u_invalid_email6" girer.

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

    And Kayit gerceklesmez ve "Please Enter Valid Email Address" mesaji gorunur.







