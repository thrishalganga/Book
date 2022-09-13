Feature: Validation of book

  #Author:Thrishal
  Background: Open link in browser
    Given Open the browser

  Scenario: Put Validation of book
    Given open book put
    When Enter valid book id to update
    Then put book information

