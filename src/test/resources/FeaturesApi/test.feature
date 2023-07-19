Feature: Pruebas de Creacion de un usuario

Scenario: Creacion de un usuario en sign up
    Given url "https://api.demoblaze.com"
    Given path '/signup'
    And request {username: 'RafaCand777', password: 'YaeraHora'}
    When method post
    Then status 200
    And def expectedErrorMessage = "This user already exist."
    And match response contains { "errorMessage": "#(expectedErrorMessage)"}
    #And then karate.log('Respuesta:' + response)
    #And def customMessage = "Vuelva a intentarlo"
    #And def response1 = karate.toMap(response)
     #And if (response.response.errorMessage == expectedErrorMessage) {karate.set('customMessage', customMessage);karate.log('Respuesta:' + response1.body);}
Scenario: Creacion de un usuario existente
    Given url "https://api.demoblaze.com"
    Given path '/signup'
    And request {username: 'RafaCand456', password: 'YaeraHora'}
    When method post
    Then status 200
    And match response == { "errorMessage": "This user already exist." }
Scenario: login successfull
  Given url "https://api.demoblaze.com"
  Given path '/login'
  And request {username: 'RafaCand457', password: 'YaeraHora'}
  When method post
  Then status 200
Scenario: login worng password
  Given url "https://api.demoblaze.com"
  Given path '/login'
  And request {username: 'RafaCand457', password: 'NoesHora'}
  When method post
  Then status 200