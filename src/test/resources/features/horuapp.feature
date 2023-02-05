@RTB-1
Feature: Adding elements to the InternetApp
  Scenario: Add 10 elements and verify the number of elements on the InternetApp page
    Given user navigates to "Internet" Application
    When user click the add element button 10 times
    Then 10 elements should exist on the InternetApp page