Feature: Hello World

  Background:
    Given url baseUrl
    Given path '/pokemon/health'

  Scenario: Status Check

    When method GET
    Then status 200
    And match $.status == "UP"
