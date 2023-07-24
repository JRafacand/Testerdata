Feature: Elegir Productos DemoBlaze

  Scenario: Elegir Productos DemoBlaze
    Given User I navigate to demoblaze
    And he I select a product

  Scenario: Validar datos
    Given User Ingreso el "Juan Perez" campo Name
    Then he Valido el campo "Juan Perez"
    Then he Valido ingreso country "Ecuador"
    Then he Valido ingreso city "Quito"
    Then he valido ingreso tarjeta "9876-5432-1098-7654"
    Then he Ingreso Mes
    Then he Valido año 2023
    Then Finalizar Compra

