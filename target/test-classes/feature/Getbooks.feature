Feature: Validation of book

  #Author:Thrishal
  Background: Open link in browser
    Given Open the browser

  Scenario: Get Validation
    Given open book get
    When Enter valid book id
    Then get book information
