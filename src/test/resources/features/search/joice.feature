Feature: Compra DemoBlaze

  Scenario: Compra Choise
    Given User I navigate to demoblaze
    And he I select a product

  Scenario: Validar datos
    Given Ingreso el "JuanPerez" campo name
    When Valido el campo nombre
    #And Ingreso el "<Country>" campo country
    #And Ingreso el "<Creditcard>" campo Credut Card
    #And Ingreso el "<Month>" campo Month
    #And Ingreso el "<Year>" campo Year
    #When Validar Campos
    #Then No debe mostar error*/

