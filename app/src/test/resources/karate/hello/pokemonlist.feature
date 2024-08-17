Feature: Hello Again

  Background:
    * url baseUrl
    * path '/pokemon/list'

  Scenario: Pokemon Listing

    * method GET
    * status 200
    * match $[0].name == "pikachu"