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
   
   @Regression
   Scenario: Inactive Property Functionality
   When User clicks on Inactive Property menu 
   And User clicks on Inactive Property submenu
   Then user can see search property page 
   When user select ward no. 
   And user click on search button
   Then user can see Property List page 
   
   @Regression
   Scenario: Inactive DCB Functionality
   When User clicks on Inactive Property menu 
   And User clicks on Inactive DCB submenu
   Then user can see Inactive Dcb Report page 
   When user clicks on search button of Inactive Dcb Report page 
   Then user can see report of Inactive Dcb Report page 
   
   @Regression
   Scenario: Inactive Property Activity Functionality
   When User clicks on Inactive Property menu 
   And User clicks on Inactive Property Activity submenu
   Then user can see Inactive Prop Activity page 
   

   