@regression
Feature: NavigateToAutoTrader

  @autoTrader
  Scenario: Navigate to Auto Trader and gather data on BMW
    Given User is navigated to autoTrader homePage
    Then User can click Browse by Make, Browse By Style and Advanced Search
    And User can select Make, Model from drop down
    Then User is able to click Search Button