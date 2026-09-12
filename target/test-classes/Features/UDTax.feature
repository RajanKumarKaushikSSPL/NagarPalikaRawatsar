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
 
 @Regression
 Scenario: Search Property Functionality
 When User clicks on UD Tax menu 
 And user clicks on search property submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Document Upload Functionality
 When User clicks on UD Tax menu 
 And user clicks on document upload submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Update Property Details Functionality
 When User clicks on UD Tax menu 
 And user clicks on update property details submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Last Payment Update Functionality
 When User clicks on UD Tax menu 
 And user clicks on last payment update submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Update Owner Details Functionality
 When User clicks on UD Tax menu 
 And user clicks on update owner details submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Property Deactivate Functionality
 When User clicks on UD Tax menu 
 And user clicks on property deactivate submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Ward Update Functionality
 When User clicks on UD Tax menu 
 And user clicks on ward update submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page 
 
 @Regression
 Scenario: Adjustment Functionality
 When User clicks on UD Tax menu 
 And user clicks on adjustment submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page
 
 @Regression
 Scenario: House Tax Last Payment Update Functionality
 When User clicks on UD Tax menu 
 And user clicks on house tax last payment update submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page
 
 @Regression
 Scenario: DN Notice Distribution Functionality
 When User clicks on UD Tax menu 
 And user clicks on DN notice distribution submenu
 Then user can see search property page 
 When user select ward no.
 And user click on search button 
 Then user can see property list page
  


 