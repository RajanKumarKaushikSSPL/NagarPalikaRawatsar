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
