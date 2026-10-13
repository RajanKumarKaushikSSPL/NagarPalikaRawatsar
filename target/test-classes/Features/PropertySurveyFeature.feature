Feature: Property Survey

  Background: Steps common for all UD Tax Report feature
    Given User Launch Chrome Browser
    When User opens URL "http://192.168.1.20:94/system/login/"
    And User enters Username as "super_admin" and password as "12345"
    And click on Login button
    Then User should be able to see "Dashboard" text

  @Smoke
  Scenario: Property Survey menu contains all submenus
    When User clicks on Property Survey menu
    Then user can view Survey Report submenu of Property Survey menu	
    And user can view Survey Summary Report submenu of Property Survey menu
    And user can view Survey Team Summary submenu of Property Survey menu
    And user can view Survey Assessed List submenu of Property Survey menu
    And user can view Survey Assessed Report submenu of Property Survey menu
    And user can view Wardwise Survey Report submenu of Property Survey menu
    And user can view Survey Pending Report submenu of Property Survey menu
    And user can view Survey Level Summary Report submenu of Property Survey menu
    And user can view Survey Level Summary Report submenu of Property Survey menu
    And user can view Userwise Forward Summary submenu of Property Survey menu
    And user can view Userwise Survey Edit Report submenu of Property Survey menu
    And user can view Survey Modification Report submenu of Property Survey menu
    And user can view Survey Geotagging Report submenu of Property Survey menu
    And user can view Ex-Party Survey Notice submenu of Property Survey menu
    And user can view Survey Notice List submenu of Property Survey menu
    And user can view Bulk Survey Notice Print submenu of Property Survey menu
    And user can view Survey Notice Received List submenu of Property Survey menu
    And user can view Survey Notice Received Report submenu of Property Survey menu
    And user can view Survey Notice Distributed Report submenu of Property Survey menu
    And user can view Survey Demand Report submenu of Property Survey menu
    And user can view Survey GIS Update submenu of Property Survey menu
    And user can view Survey Visit Report submenu of Property Survey menu
    And user can view TL Survey Visit submenu of Property Survey menu
    And user can view TL Survey Visit Report submenu of Property Survey menu
    
    @Regression
    Scenario: Survey Report Functionality
    When User clicks on Property Survey menu
    And user clicks on survey report submenu
    Then user can see Survey Report page
    When user clicks on search button of Survey Report page 
    Then user can see records of Survey Report page
    
    @Regression
    Scenario: Survey Summary Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Summary Report submenu
    Then user can see Survey Summary Report page
    When user clicks on search button of Survey Summary Report page 
    Then user can see report of Survey Summary Report page
    
    @Regression
    Scenario: Survey Team Summary Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Team Summary submenu
    Then user can see Survey Team Summary page
    When user clicks on search button of Survey Team Summary page 
    Then user can see report of Survey Team Summary page
    
    @Regression
    Scenario: Survey Assessed List Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Assessed List submenu
    Then user can see Survey Assessed List page
    When user clicks on search button of Survey Assessed List page 
    Then user can see report of Survey Assessed List page
    
    @Regression
    Scenario: Survey Assessed Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Assessed Report submenu
    Then user can see Survey Assessed Report page
    When user clicks on search button of Survey Assessed Report page 
    Then user can see report of Survey Assessed Report page
    
    @Regression
    Scenario: Wardwise Survey Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Wardwise Survey Report submenu
    Then user can see Wardwise Survey Report page
    When user clicks on search button of Wardwise Survey Report page 
    Then user can see report of Wardwise Survey Report page
    
    @Regression
    Scenario: Survey Pending Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Pending Report submenu
    Then user can see Survey Pending Report page
    When user clicks on search button of Survey Pending Report page 
    Then user can see report of Survey Pending Report page
    
    @Regression
    Scenario: Survey Level Summary Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Level Summary Report submenu
    Then user can see Surveylevel Summary Report page
    When user clicks on search button of Surveylevel Summary Report page 
    Then user can see report of Surveylevel Summary Report page
    
    @Regression
    Scenario: Userwise Forward Summary Functionality
    When User clicks on Property Survey menu
    And user clicks on Userwise Forward Summary submenu
    Then user can see Userwise Forward Summary page
    When user clicks on search button of Userwise Forward Summary page 
    Then user can see report of Userwise Forward Summary page
    
    @Regression
    Scenario: Userwise Survey Edit Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Userwise Survey Edit Report submenu
    Then user can see Userwise Survey Edit Report page
    When user clicks on search button of Userwise Survey Edit Report page 
    Then user can see report of Userwise Survey Edit Report page
    
    @Regression
    Scenario: Survey Modification Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Modification Report submenu
    Then user can see Survey Modification Report page
    When user clicks on search button of Survey Modification Report page 
    Then user can see report of Survey Modification Report page
    
    @Regression
    Scenario: Survey Geotagging Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Geotagging Report submenu
    Then user can see Survey Geotagging Report page
    When user clicks on search button of Survey Geotagging Report page 
    Then user can see report of Survey Geotagging Report page
    
    @Regression
    Scenario: Ex Party Survey Notice Functionality
    When User clicks on Property Survey menu
    And user clicks on Ex-Party Survey Notice submenu
    Then user can see Ex Party Survey Notice page
    
    @Regression
    Scenario: Survey Notice List Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Notice List submenu
    Then user can see Survey Notice List page
   
    @Regression
    Scenario: Bulk Survey Notice Print Functionality
    When User clicks on Property Survey menu
    And user clicks on Bulk Survey Notice Print submenu
    Then user can see Bulk Survey Notice page
    When user clicks on search button of Bulk Survey Notice page 
    Then user can see print button of Bulk Survey Notice page
    
    @Regression
    Scenario: Survey Notice Received List Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Notice Received List submenu
    Then user can see Survey Notice Received List page
    
    @Regression
    Scenario: Survey Notice Received Report Functionality
    When User clicks on Property Survey menu
    And user clicks on Survey Notice Received Report submenu
    Then user can see Survey Notice Received Report page
