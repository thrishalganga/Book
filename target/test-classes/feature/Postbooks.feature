Feature: Validation of book

  #Author:Thrishal
  Background: Open link in browser
    Given Open the browser

  Scenario: Post Validation of book
    Given open book post
    When Enter valid book id to create
    Then post book information
