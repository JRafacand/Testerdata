Feature: Compra DemoBlaze

  Scenario: Compra Choise
    Given User I navigate to demoblaze
    And he I proceed to checkout

  Scenario: Validar datos
    Given Ingreso el "<name>" campo name
    And Ingreso el "<Country>" campo country
    And Ingreso el "<City>" campo city
    And Ingreso el "<Creditcard>" campo Credut Card
    And Ingreso el "<Month>" campo Month
    And Ingreso el "<Year>" campo Year
    When Validar Campos
    Then No debe mostar error

