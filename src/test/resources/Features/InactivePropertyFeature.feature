Feature: Inactive Property 

Background: Steps common for Inactive Property
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
   
@Smoke
Scenario: Inactive Property menu contains all submenus
   When User clicks on Inactive Property menu
   Then user can view Inactive Property submenu of Inactive Property menu
   And user can view Inactive DCB submenu of Inactive Property menu
   And user can view Inactive Property Activity submenu of Inactive Property menu
   