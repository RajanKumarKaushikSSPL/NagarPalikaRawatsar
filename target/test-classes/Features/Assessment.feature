Feature: Check functionality of Assessment menu 

Background: Steps common for all Assessment menu feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345987"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
 @Smoke
 Scenario: To check presence of all submenus of Assessment menu
 When User clicks on Assessment menu 
 Then User is able to see Reassessment submenu 
 Then User is able to see Reverification submenu
 Then User is able to see Reverification TL submenu 
 Then User is able to see House Tax Entry submenu
 Then User is able to see Legacy Entry submenu
 Then User is able to see Edit New Assessment submenu
 
  