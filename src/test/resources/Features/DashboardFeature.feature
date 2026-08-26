Feature: Dashboard

Background: Steps common for all dashboard feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345987"
   And click on Login button
   Then User should be able to see "Dashboard" text
   When User clicks on dashboard menu

@Regression  
Scenario: Search Work Report Dashboard Data
   
   And click on Work Report Dashboard submenu
   And click on search button of Work Report Dashboard
   Then user can view Work Report Dashboard report
   And close browser

@Regression   
Scenario: Search BOH Dashboard Data
   
   And click on Work BOH Dashboard submenu
   And click on search button of BOH Dashboard
   Then user can view report of BOH Dashboard
   And close browser   
   
   
   