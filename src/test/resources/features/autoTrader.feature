@regression
  Feature: Navigate to auto trader

@autoDemo
    Scenario: navigate to auto trader and search data for BMW
      Given User navigates to auto trader home page
      Then User can click Browse by Make, Browse by Style and Advanced Search
      And User has the option to click Search button
      Then Make sure can see Make and Model in drop down option on the website
      Then User clicks advanced search button
