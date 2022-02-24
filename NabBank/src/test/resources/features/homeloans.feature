#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: feature to enquire about home loans

Background: 
Given Validate the browser
When Browser is triggered
Then check if browser is started

  @tag1
  Scenario: Check enquiry about the home loans is successful 
    Given user is on Nab Website
    And user tab on  home loan section
    When user tap on loan book an appointment section
    And user goes to buying a property
    And user tap on otherNabneeds
    And user tap on continue
    And user tap on newHomeLoans
    And user tap on next
    And user tap on buynewpty
    And user tap on Next 
    And user tap on No 
    When user fill the form
    Then user validate the outcomes
    And user tap on submit 
    
    

