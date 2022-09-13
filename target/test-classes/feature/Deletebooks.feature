Feature: Validation of book

  #Author:Thrishal
  Background: Open link in browser
    Given Open the browser

  Scenario: Delete Validation of book
    Given open book Delete
    When Enter valid book id to Delete
    Then Delete book information
