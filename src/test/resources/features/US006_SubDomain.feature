@US006
Feature:Company Seller olarak Sub Domain text box'ina unique bir sub domain girildiginde basariyla kayit olabilmeliyim



  Scenario: Basarili
    Given Kullanici GlobalTrader home page e gider
    When Kullanici Seller Join Now butonuna basar
    Then Kullanici Company Seller radio butonunun secer
    And Kullanici Company Name textbox'ina "e_company_name" valid bir data girer
    And Kullanici Company Mobile textbox'ina "e_company_mobile" valid bir data girer
    And Kullanici Company Address textbox'ina "e_company_address" valid bir data girer
    And Kullanici Name textbox'ina "e_name" valid bir data girer
    And Kullanici Email textbox'ina "e_email" valid bir data girer
    And Kullanici Sub Domain textbox'ina "e_sub_domain" valid ve unique bir data girer
    And Kullanici Mobile Number textbox'ina "e_mobile" valid bir data girer
    And Kullanici Country dropdown'undan "e_country" valid bir country secer
    And Kullanici State textbox'ina "e_state" valid bir state girer
    And Kullanici City textbox'ina "e_city" valid bir city girer
    And Kullanici Address textbox'ina "e_address" valid bir address girer
    And Kullanici Enter Postal Code textbox'ina "e_postal_code" valid bir data girer
    And Kullanici Categories dropdown'undan "e_categories" valid bir category secer
    And Kullanici Password textbox'ina "e_password" valid bir data girer
    And Kullanici Registration butonuna basar
    Then Kullanici Registration butonuna bastiktan sonra site Basarili bir sekilde kayit oldunuz gibi bir mesaj vermeli

    Scenario: Basarisiz
      Given Kullanici GlobalTrader home page e gider
      When Kullanici Seller Join Now butonuna basar
      Then Kullanici Company Seller radio butonunun secer
      And Kullanici Company Name textbox'ina "e_company_name" valid bir data girer
      And Kullanici Company Mobile textbox'ina "e_company_mobile" valid bir data girer
      And Kullanici Company Address textbox'ina "e_company_address" valid bir data girer
      And Kullanici Name textbox'ina "e_name" valid bir data girer
      And Kullanici Email textbox'ina "e_email" valid bir data girer
      And Kullanici Sub Domain textbox'ina "e_sub_domain" valid ve unique bir data girer
      And Kullanici Mobile Number textbox'ina "e_mobile" valid bir data girer
      And Kullanici Country dropdown'undan "e_country" valid bir country secer
      And Kullanici State textbox'ina "e_state" valid bir state girer
      And Kullanici City textbox'ina "e_city" valid bir city girer
      And Kullanici Address textbox'ina "e_address" valid bir address girer
      And Kullanici Enter Postal Code textbox'ina "e_postal_code" valid bir data girer
      And Kullanici Categories dropdown'undan "e_categories" valid bir category secer
      And Kullanici Password textbox'ina "e_password" valid bir data girer
      And Kullanici Registration butonuna basar
      Then Kullanici Registration butonuna bastiktan sonra site Basarili bir sekilde kayit oldunuz gibi bir mesaj vermeli

