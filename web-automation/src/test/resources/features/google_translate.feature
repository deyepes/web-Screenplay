Feature: Google translate

  As a Google translate user
  I want to translate a word
  So that understand it

  Scenario: Translate a word from Spanish to English
    Given I'm on the google translator page
    When I write "Hola" in spanish
    Then should see the "hello" in english