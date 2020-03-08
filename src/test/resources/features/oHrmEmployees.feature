Feature: As an administrator I should be able to view all employees and search.
  Background:
    Given I'm on logged in to OrangeHRM as admin
  @hrm
  Scenario: Search Employee by First Name
    And I click on the Employee List
    And I enter employee first name
    Then I click on search button on OrangeHRM
    Then I see the employee in results of OrangeHRM
  @hrm-2
  Scenario: View All Employees
    And I click on the Employee List
    Then I see the list of employees in OrangeHRM



  #Scenario: Search Employee by Job Title