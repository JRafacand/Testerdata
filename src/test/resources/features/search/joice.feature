Feature: Elegir Productos DemoBlaze

  Scenario: Elegir Productos DemoBlaze
    Given User I navigate to demoblaze
    And he I select a product

  Scenario: Validar datos
    Given Ingreso el "Juan Perez" campo Name
    And Ingreso el "Ecuador" campo Country
    And Ingreso el "Quito" campo City
    And Ingreso el campo "9876-5432-1098-7654" Credit Card
    Then Valido el campo Name
    Then Valido el campo country
    Then Valido ingreso ciudad
    Then Valido ingreso tarjeta
    Then Ingreso Mes
    Then Valido año 2023
    Then Finalizar Compra

