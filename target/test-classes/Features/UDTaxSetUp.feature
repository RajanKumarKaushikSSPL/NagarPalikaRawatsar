Feature: UD Tax Set Up  

Background: Steps common for all UD Tax Set Up feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
   
@Smoke
Scenario: UD Tax Set Up menu contains all submenus
   When User clicks on UD Tax set up menu
   Then user can view Road Type submenu 
   And user can view Usage Type submenu 
   And user can view Usage SubCategory Master submenu 
   And user can view Sub Category Details submenu 
   And user can view DLC rate master submenu 
   And user can view DLC Search submenu
