Feature: Check functionality of Assessment menu 

Background: Steps common for all Assessment menu feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
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
 
 @Regression
 Scenario: To apply House Tax Entry
 When User clicks on Assessment menu
 And User clicks on House Tax Entry submenu of Assessment menu
 Then User can see House Tax Entry page
 When User enters property details
 And User enters permanent address
 And User enters current address
 And User enters owner details 
 And User enters floor details 
 And User enters demand details
 And User clicks on view button 
 Then User can see House Tax Entry View Page
 When User clicks on save button  
 Then User can see House Tax Payment page
 When User enters payment details 
 And User clicks on pay now button
 Then User can see House Tax Payment Receipt Page 
 
 @Regression
 Scenario: To apply Legacy Entry
 When User clicks on Assessment menu
 And User clicks on Legacy Entry submenu of Assessment menu
 Then User can see Legacy Entry page 
 When User enters property details of Legacy Entry submenu
 And User enters permanent address of Legacy Entry submenu
 And User enters current address of Legacy Entry submenu
 And User enters owner details of Legacy Entry submenu
 And User enters tax details of Legacy Entry submenu
 And User clicks on save button of Legacy Entry submenu  
 Then User can see confirmation message
 

 
  