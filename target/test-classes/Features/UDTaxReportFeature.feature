Feature: UD Tax Report 

Background: Steps common for all UD Tax Report feature
   Given User Launch Chrome Browser
   When User opens URL "http://192.168.1.20:94/system/login/"
   And User enters Username as "super_admin" and password as "12345"
   And click on Login button
   Then User should be able to see "Dashboard" text
   
   
@Smoke
Scenario: UD Tax Report menu contains all submenus
   When User clicks on UD Tax Report menu
   Then user can view counter report submenu of UDTax Report menu
   And  user can view TC Collection Summary submenu of UDTax Report menu
   And  user can view DCB Report submenu of UDTax Report menu
   And  user can view SAF Report submenu of UDTax Report menu
   And  user can view Zone and Ward Wise Collection Report submenu of UDTax Report menu
   And  user can view Payment Mode Wise Collection submenu of UDTax Report menu
   And  user can view ULB Report submenu of UDTax Report menu
   And  user can view Transaction Deactivate Report submenu of UDTax Report menu
   And  user can view ALL Module TC Summary submenu of UDTax Report menu
   And  user can view Cheque Bounce Report submenu of UDTax Report menu
   And  user can view Print All Payment Reciept submenu of UDTax Report menu
   And  user can view Taxable Property Report submenu of UDTax Report menu
   And  user can view PropertyWise DCB submenu of UDTax Report menu
   And  user can view Htax DCB Report submenu of UDTax Report menu
   And  user can view Print All Demand Reciept submenu of UDTax Report menu
   And  user can view Variation Report submenu of UDTax Report menu
   And  user can view Reassesment Diff submenu of UDTax Report menu
   And  user can view Cheque Bounced Collection Report submenu of UDTax Report menu
   And  user can view Re-verification Difference Report submenu of UDTax Report menu
   And  user can view Tax Collection Report submenu of UDTax Report menu
   And  user can view Appti List submenu of UDTax Report menu
   And  user can view Apptti Pending Report submenu of UDTax Report menu
   And  user can view Appti Reject List submenu of UDTax Report menu
   And  user can view TC Visit Report submenu of UDTax Report menu
   And  user can view TC Visit Summary submenu of UDTax Report menu
   And  user can view Property Wise TC Visit submenu of UDTax Report menu
   And  user can view TL Visit Report submenu of UDTax Report menu
   And  user can view All Updation Report submenu of UDTax Report menu
   And  user can view DN130 Distribution Reports submenu of UDTax Report menu
   
 @Regression
 Scenario: Counter Report Functionality
 When User clicks on UD Tax Report menu
 And user clicks on counter report submenu
 Then user can see counter report page 
 When user clicks on search button 
 Then user can see report
 
 @Regression
 Scenario: TC Collection Summary Functionality
 When User clicks on UD Tax Report menu
 And user clicks on TC collection summary submenu
 Then user can see TC collection summary page 
 When user clicks on search button of TC collection summary page
 Then user can see report of TC collection summary page
 
 @Regression
 Scenario: DCB Report Functionality
 When User clicks on UD Tax Report menu
 And user clicks on DCB Report submenu
 Then user can see DCB ULB Wise page 
 When user clicks on search button of DCB ULB Wise page
 Then user can see total demand and total collection of DCB ULB Wise page
 
 @Regression
 Scenario: SAF Report Functionality
 When User clicks on UD Tax Report menu
 And user clicks on SAF Report submenu
 Then user can see saf Report page 
 When user clicks on search button of saf Report page
 Then user can see property tax plain text of saf Report page
 
 
    
   
   
