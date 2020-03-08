
Feature: Login
 @Smoke
  Scenario: As an advisor I should be able to successfully login to Imposta
    Given I'm on the login page
    When I enter  valid username as "info@conslynk.com"
    Then I enter valid  password as "Yolladvisor1"
    And I click on login button
    Then I am navigated to home page
