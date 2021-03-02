Feature: OpenMrs Login Functionality

    @OM-login
  Scenario: User should be able to login to OpenMrs website
    Given User navigate to OpenMrs login page
    Then User enters username
    And User enters password
    And User selects registration desk
    Then User clicks login button

  @OM-loginWrong
  Scenario: User should not be able to login to OpenMrs website
    Given User navigate to OpenMrs login page
    Then User enters wrong username
    And User enters wrong password
    And User selects registration desk
    Then User clicks login button
    Then User sees error message

  @OM-logout
  Scenario: User should be able to login to OpenMrs website
    Given User navigate to OpenMrs login page
    Then User enters username
    And User enters password
    And User selects registration desk
    Then User clicks login button
    Then User logs out


#User story 1: Login/Logout Functionality
#○ Scenario 1: User should be able to successfully login
#○ Scenario 2: User should not be able to login with incorrect
#username/password
#○ Scenario 3: User should be able to successfully logout