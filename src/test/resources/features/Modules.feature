Feature: Check Modules Functionality

@wip
  Scenario: User should navigate The Hub page
    Given user is on the main page
    When user clicks "The Hub" module
    Then user should see The Hub page in new window


    Scenario: User should navigate solution details at Atlassian Marketplace
      Given user is on the main page
      When user clicks "Solutions" module
      And user clicks "JSU Automation Suite for Jira Workflows" solution and clicks try for free button
      Then user should see "JSU Automation Suite for Jira Workflows" details at Atlassian Marketplace page



