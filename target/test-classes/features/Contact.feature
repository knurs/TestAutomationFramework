Feature: Check Contact Page Functionality


 Scenario Outline: User should reach Artemis support in contact page
   Given user is on the contact page
   When user clicks documentation button for "<SupportName>" support
   Then user should see the "<PageTitle>" page title
   Examples:
     | SupportName | PageTitle|
     |Artemis|Artemis - Confluence|
      |Anova|Spaces - Confluence|


