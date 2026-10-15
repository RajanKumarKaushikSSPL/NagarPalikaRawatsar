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
   
   @Regression
   Scenario: Transaction Deactivate Functionality
   When User clicks on Accounts menu 
   And User clicks on Transaction Deactivate submenu 
   Then User can see Deactivate Transaction page
   
   @Regression
   Scenario: Cash Verification Functionality
   When User clicks on Accounts menu 
   And User clicks on Cash Verification submenu 
   Then User can see Cash Verification page
   
   @Regression
   Scenario: Bank Deposit Date Entry Functionality
   When User clicks on Accounts menu 
   And User clicks on Bank Deposit Date Entry submenu 
   Then User can see Bank Deposit page
   
   @Regression
   Scenario: Bank Reconcilation Functionality
   When User clicks on Accounts menu 
   And User clicks on Bank Reconcilation submenu 
   Then User can see Bank Reconcilation page
   
   @Regression
   Scenario: Payment Mode Update Functionality
   When User clicks on Accounts menu 
   And User clicks on Payment Mode Update submenu 
   Then User can see Payment Mode Update page
   
   @Regression
   Scenario: House Tax Transaction Deactivate Functionality
   When User clicks on Accounts menu 
   And User clicks on House Tax Transaction Deactivate submenu 
   Then User can see Deactivate Transaction page
   
   @Regression
   Scenario: House Tax Payment Mode Update Functionality
   When User clicks on Accounts menu 
   And User clicks on House Tax Payment Mode Update submenu 
   Then User can see Htax Payment Mode Update page

   
   
   
