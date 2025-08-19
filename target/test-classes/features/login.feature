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
Feature: Login functionality of the SauceDemo webshop

  Scenario: Valid user can log in successfully
    Given I am on the login page
    When I log in with username "standard_user" and password "secret_sauce"
    Then I should be redirected to the inventory page
    
    Scenario: Locked out user cannot log in
  Given I am on the login page
  When I log in with username "locked_out_user" and password "secret_sauce"
  Then I should see an error message "Epic sadface: Sorry, this user has been locked out."
  
  Scenario: Problem user sees wrong product image
  Given I am on the login page
  When I log in as problem user
  Then I should see the wrong backpack image