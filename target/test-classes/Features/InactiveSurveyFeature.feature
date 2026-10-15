Feature: Inactive Survey 

Background: Steps common for Inactive Survey
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
   
   @Smoke
   Scenario: Inactive Survey menu contains all submenus
   When User clicks on Inactive Survey menu
   Then user can view Inactive Survey submenu of Inactive Survey menu
   And user can view Inactive Survey Activity submenu of Inactive Survey menu
   
   @Regression
   Scenario: Inactive Survey Functionality
   When User clicks on Inactive Survey menu 
   And User clicks on Inactive Survey submenu 
   Then user can see Search Survey page
   When user select ward no. of Search Survey page
   And user clicks search button of Search Survey page
   Then user can see property list page
   
   @Regression
   Scenario: Inactive Survey Activity Functionality
   When User clicks on Inactive Survey menu
   And User clicks on Inactive Survey Activity submenu 
   Then user can see Inactive Survey Activity page
  
   