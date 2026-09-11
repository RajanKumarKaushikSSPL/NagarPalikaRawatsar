Feature: Login

Background: Steps common for Login feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"

@Smoke @Regression   
Scenario: Successful Login With Valid Credentials
   #Given User Launch Chrome Browser
   #When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
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
   Then dashboard visibility should be "<dashboardVisible>"
   
   
 Examples:
 |user_name|password|dashboardVisible|
 |super_admin|12345|true|
 |superadmin|12345987|false|
 |super_admin|123459878|false|
 |superadmin|123459878|false|
 |          |12345987|false|
 |super_admin|       |false|
 |          |       |false|
 |          |123459878|false|
 |superadmin|         |false|
 
   
