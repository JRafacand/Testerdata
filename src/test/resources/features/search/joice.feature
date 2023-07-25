Feature: Elegir Productos DemoBlaze

  Scenario: Elegir Productos DemoBlaze
    Given User I navigate to demoblaze
    And he I select a product


  Scenario: Validar datos y comprar
    Given User I navigate to demoblaze compra
    Then he Valido el campo "Juan Perez"
    Then he Valido ingreso country "Ecuador Sudamerica"
    Then he Valido ingreso city "Quito"
    Then he valido ingreso tarjeta "9876-5432-1098-7654"
    Then he Ingreso Mes
    Then he Valido año 2023
    Then he Finalizar Compra
    Then he navigate demoblaze back

