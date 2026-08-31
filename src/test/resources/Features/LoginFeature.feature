Feature: Login

Background: Steps common for Login feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"

@Smoke @Regression   
Scenario: Successful Login With Valid Credentials
   #Given User Launch Chrome Browser
   #When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345987"
   And click on Login button
   Then User should be able to see "Dashboard" text
   When User clicks on super admin profile
   And User clicks on signout button
   Then Page Title should be "Nagar Palika Rawatsar"
   And close browser

@DDT   
Scenario Outline: Successful Login With different Credentials DDT
   #Given User Launch Chrome Browser
   #When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "<user_name>" and password as "<password>"
   And click on Login button
   Then User should be able to see "Dashboard" text
   When User clicks on super admin profile
   And User clicks on signout button
   Then Page Title should be "Nagar Palika Rawatsar"
   And close browser
   
 Examples:
 |user_name|password|
 |super_admin|12345987|
 |superadmin|12345987|
 |super_admin|123459878|
 |superadmin|123459878|
 |          |12345987|
 |super_admin|       |
 |          |       |
 |          |123459878|
 |superadmin|         |
 
   
