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
   