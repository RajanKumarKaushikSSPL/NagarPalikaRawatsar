Feature: Check functionality of UDTax menu 

Background: Steps common for all UDTax menu feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
 @Smoke
 Scenario: To check presence of all submenus of UDTax menu
 When User clicks on UD Tax menu 
 Then User is able to see Search Propety submenu 
 Then User is able to see Document Upload submenu
 Then User is able to see Update Property Details submenu
 Then User is able to see Last Payment Update submenu 
 Then User is able to see Update Owner Details submenu
 Then User is able to see Property Deativate submenu
 Then User is able to see Ward Update submenu
 Then User is able to see Adjustment submenu
 Then User is able to see House Tax Last Payment Update submenu
 Then User is able to see TL Property Visit submenu
 Then User is able to see DN Notice Distribution submenu
 