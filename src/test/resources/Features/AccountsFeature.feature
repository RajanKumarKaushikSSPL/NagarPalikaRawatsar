Feature: Accounts 

Background: Steps common for Accounts feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
   
@Smoke
Scenario: Accounts menu contains all submenus
   When User clicks on Accounts menu
   Then user can view transaction deactivate submenu of Accounts menu
   And  user can view cash verification submenu of Accounts menu
   And  user can view bank deposit date entry submenu of Accounts menu
   And  user can view bank reconciliation submenu of Accounts menu
   And  user can view Payment Mode Update submenu of Accounts menu
   And  user can view House Tax Transaction Deactivate submenu of Accounts menu
   And  user can view House Tax Payment Mode Update submenu of Accounts menu
   
   
