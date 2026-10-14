package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class PropertySurveyStepDef extends BaseClass {
    
	//////////////////////////////Property Survey menu contains all submenus///////////////////////////
	@When("User clicks on Property Survey menu")
	public void user_clicks_on_property_survey_menu() {
	    dashboardPg.clickOnPropertySurveyMenu();
	    log.info("User clicks on Property Survey menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view Survey Report submenu of Property Survey menu")
	public void user_can_view_survey_report_submenu_of_property_survey_menu() {
	    if(dashboardPg.SurveyReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Summary Report submenu of Property Survey menu")
	public void user_can_view_survey_summary_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveySummaryReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Summary Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Summary Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Team Summary submenu of Property Survey menu")
	public void user_can_view_survey_team_summary_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyTeamSummarySubMenuisdisplayed()) {
	    	log.info("user can view Survey Team Summary submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Team Summary submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Assessed List submenu of Property Survey menu")
	public void user_can_view_survey_assessed_list_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyAssessedListSubMenuisdisplayed()) {
	    	log.info("user can view Survey Assessed List submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Assessed List submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Assessed Report submenu of Property Survey menu")
	public void user_can_view_survey_assessed_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyAssessedReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Assessed Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Assessed Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Wardwise Survey Report submenu of Property Survey menu")
	public void user_can_view_wardwise_survey_report_submenu_of_property_survey_menu() {
		if(dashboardPg.WardwiseSurveyReportSubMenuisdisplayed()) {
	    	log.info("user can view Wardwise Survey Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Wardwise Survey Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Pending Report submenu of Property Survey menu")
	public void user_can_view_survey_pending_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyPendingReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Pending Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Pending Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Level Summary Report submenu of Property Survey menu")
	public void user_can_view_survey_level_summary_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyLevelSummaryReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Level Summary Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Level Summary Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Userwise Forward Summary submenu of Property Survey menu")
	public void user_can_view_userwise_forward_summary_submenu_of_property_survey_menu() {
		if(dashboardPg.UserwiseForwardSummarySubMenuisdisplayed()) {
	    	log.info("user can view Userwise Forward Summary submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Userwise Forward Summary submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Userwise Survey Edit Report submenu of Property Survey menu")
	public void user_can_view_userwise_survey_edit_report_submenu_of_property_survey_menu() {
		if(dashboardPg.UserwiseSurveyEditReportSubMenuisdisplayed()) {
	    	log.info("user can view Userwise Survey Edit Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Userwise Survey Edit Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Modification Report submenu of Property Survey menu")
	public void user_can_view_survey_modification_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyModificationReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Modification Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Modification Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Geotagging Report submenu of Property Survey menu")
	public void user_can_view_survey_geotagging_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyGeotaggingReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Geotagging Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Geotagging Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Ex-Party Survey Notice submenu of Property Survey menu")
	public void user_can_view_ex_party_survey_notice_submenu_of_property_survey_menu() {
		if(dashboardPg.ExPartySurveyNoticeSubMenuisdisplayed()) {
	    	log.info("user can view Ex-Party Survey Notice submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Ex-Party Survey Notice submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Notice List submenu of Property Survey menu")
	public void user_can_view_survey_notice_list_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyNoticeListSubMenuisdisplayed()) {
	    	log.info("user can view Survey Notice List submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Notice List submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Bulk Survey Notice Print submenu of Property Survey menu")
	public void user_can_view_bulk_survey_notice_print_submenu_of_property_survey_menu() {
		if(dashboardPg.BulkSurveyNoticePrintSubMenuisdisplayed()) {
	    	log.info("user can view Bulk Survey Notice Print submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Bulk Survey Notice Print submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Notice Received List submenu of Property Survey menu")
	public void user_can_view_survey_notice_received_list_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyNoticeReceivedListSubMenuisdisplayed()) {
	    	log.info("user can view Survey Notice Received List submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Notice Received List submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Notice Received Report submenu of Property Survey menu")
	public void user_can_view_survey_notice_received_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyNoticeReceivedReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Notice Received Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Notice Received Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Notice Distributed Report submenu of Property Survey menu")
	public void user_can_view_survey_notice_distributed_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyNoticeDistributedReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Notice Distributed Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Notice Distributed Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Demand Report submenu of Property Survey menu")
	public void user_can_view_survey_demand_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyDemandReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Demand Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Demand Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey GIS Update submenu of Property Survey menu")
	public void user_can_view_survey_gis_update_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyGISUpdateSubMenuisdisplayed()) {
	    	log.info("user can view Survey GIS Update submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey GIS Update submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Survey Visit Report submenu of Property Survey menu")
	public void user_can_view_survey_visit_report_submenu_of_property_survey_menu() {
		if(dashboardPg.SurveyVisitReportSubMenuisdisplayed()) {
	    	log.info("user can view Survey Visit Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view Survey Visit Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TL Survey Visit submenu of Property Survey menu")
	public void user_can_view_tl_survey_visit_submenu_of_property_survey_menu() {
		if(dashboardPg.TLSurveyVisitSubMenuisdisplayed()) {
	    	log.info("user can view TL Survey Visit submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view TL Survey Visit submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TL Survey Visit Report submenu of Property Survey menu")
	public void user_can_view_tl_survey_visit_report_submenu_of_property_survey_menu() {
		if(dashboardPg.TLSurveyVisitReportSubMenuisdisplayed()) {
	    	log.info("user can view TL Survey Visit Report submenu of Property Survey menu");
	    	Assert.assertTrue(true);
	    	
	    }else {
	    	log.warn("user can not view TL Survey Visit Report submenu of Property Survey menu");
	    	Assert.assertTrue(false);
	    }
	}
	
	/////////////////////////Survey Report Functionality/////////////////////////////////////
	@When("user clicks on survey report submenu")
	public void user_clicks_on_survey_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyReportSubMenu();
	    log.info("user clicks on survey report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Report page")
	public void user_can_see_survey_report_page() {
	   if(surveyreportPg.surveyReportPlainTextDisplayed()) {
		  log.info("user can see Survey Report page");
		  Assert.assertTrue(true);
	   }else {
		   log.warn("user can not see Survey Report page");
		   Assert.assertTrue(false);
	   }
	}

	@When("user clicks on search button of Survey Report page")
	public void user_clicks_on_search_button_of_survey_report_page() throws InterruptedException {
	    surveyreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see records of Survey Report page")
	public void user_can_see_records_of_survey_report_page() {
		if(surveyreportPg.recordPlainTextDisplayed()) {
			  log.info("user can see records of Survey Report page");
			  Assert.assertTrue(true);
		   }else {
			   log.warn("user can not see records of Survey Report page");
			   Assert.assertTrue(false);
		   }
	}
	
	//////////////////Survey Summary Report Functionality/////////////////
	@When("user clicks on Survey Summary Report submenu")
	public void user_clicks_on_survey_summary_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveySummaryReportSubMenu();
	    log.info("user clicks on Survey Summary Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Summary Report page")
	public void user_can_see_survey_summary_report_page() {
	    if(surveysummaryreportPg.surveySummaryReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Summary Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Summary Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Summary Report page")
	public void user_clicks_on_search_button_of_survey_summary_report_page() throws InterruptedException {
	    surveysummaryreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Summary Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Summary Report page")
	public void user_can_see_report_of_survey_summary_report_page() {
		 if(surveysummaryreportPg.reportPlainTextDisplayed()) {
		    	log.info("user can see report of Survey Summary Report page");
		    	Assert.assertTrue(true);
		    }else {
		    	log.warn("user can not see report of Survey Summary Report page");
		    	Assert.assertTrue(false);
		    }
	}
	
	////////////////Survey Team Summary Functionality///////////////////////
	@When("user clicks on Survey Team Summary submenu")
	public void user_clicks_on_survey_team_summary_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyTeamSummarySubMenu();
	    log.info("user clicks on Survey Team Summary submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Team Summary page")
	public void user_can_see_survey_team_summary_page() {
	     if(surveyteamsummaryPg.surveyTeamSummaryPlainTextDisplayed()) {
	    	log.info("user can see Survey Team Summary page");
	    	Assert.assertTrue(true);
	     }else {
	    	 log.warn("user can not see Survey Team Summary page");
	    	 Assert.assertTrue(false);
	     }
	}

	@When("user clicks on search button of Survey Team Summary page")
	public void user_clicks_on_search_button_of_survey_team_summary_page() throws InterruptedException {
	    surveyteamsummaryPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Team Summary page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Team Summary page")
	public void user_can_see_report_of_survey_team_summary_page() {
		if(surveyteamsummaryPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Team Summary page");
	    	Assert.assertTrue(true);
	     }else {
	    	 log.warn("user can not see report of Survey Team Summary page");
	    	 Assert.assertTrue(false);
	     }
	}
	
	///////////////////////Survey Assessed List Functionality///////////////////////////
	@When("user clicks on Survey Assessed List submenu")
	public void user_clicks_on_survey_assessed_list_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyAssessedListSubMenu();
	    log.info("user clicks on Survey Assessed List submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Assessed List page")
	public void user_can_see_survey_assessed_list_page() {
	    if(surveyassessedlistPg.surveyAssessedListPlainTextDisplayed()) {
	    	log.info("user can see Survey Assessed List page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Assessed List page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Assessed List page")
	public void user_clicks_on_search_button_of_survey_assessed_list_page() throws InterruptedException {
	    surveyassessedlistPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Assessed List page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Assessed List page")
	public void user_can_see_report_of_survey_assessed_list_page() {
		if(surveyassessedlistPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Assessed List page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Survey Assessed List page");
	    	Assert.assertTrue(false);
	    }
	}

    //////////////////////Survey Assessed Report Functionality/////////////////////////
	@When("user clicks on Survey Assessed Report submenu")
	public void user_clicks_on_survey_assessed_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyAssessedReportSubMenu();
	    log.info("user clicks on Survey Assessed Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Assessed Report page")
	public void user_can_see_survey_assessed_report_page() {
	    if(surveyassessedreortPg.surveyAssessedReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Assessed Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Assessed Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Assessed Report page")
	public void user_clicks_on_search_button_of_survey_assessed_report_page() throws InterruptedException {
	    surveyassessedreortPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Assessed Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Assessed Report page")
	public void user_can_see_report_of_survey_assessed_report_page() {
		if(surveyassessedreortPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Assessed Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Survey Assessed Report page");
	    	Assert.assertTrue(false);
	    }
	}
    
	////////////////Wardwise Survey Report Functionality//////////////////////
	@When("user clicks on Wardwise Survey Report submenu")
	public void user_clicks_on_wardwise_survey_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnWardWiseSurveyReportSubMenu();
	    log.info("user clicks on Wardwise Survey Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Wardwise Survey Report page")
	public void user_can_see_wardwise_survey_report_page() {
	    if(wardwisesurveyreportPg.wardWiseSurveyReportPlainTextDisplayed()) {
	    	log.info("user can see Wardwise Survey Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Wardwise Survey Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Wardwise Survey Report page")
	public void user_clicks_on_search_button_of_wardwise_survey_report_page() throws InterruptedException {
	    wardwisesurveyreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Wardwise Survey Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Wardwise Survey Report page")
	public void user_can_see_report_of_wardwise_survey_report_page() {
		if(wardwisesurveyreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Wardwise Survey Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Wardwise Survey Report page");
	    	Assert.assertTrue(false);
	    }
	}

    ////////////////////Survey Pending Report Functionality///////////////////
	@When("user clicks on Survey Pending Report submenu")
	public void user_clicks_on_survey_pending_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyPendingReportSubMenu();
	    log.info("user clicks on Survey Pending Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Pending Report page")
	public void user_can_see_survey_pending_report_page() {
	    if(surveypendingreportPg.surveyPendingReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Pending Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Pending Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Pending Report page")
	public void user_clicks_on_search_button_of_survey_pending_report_page() throws InterruptedException {
	    surveypendingreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Pending Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Pending Report page")
	public void user_can_see_report_of_survey_pending_report_page() {
		if(surveypendingreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Pending Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Survey Pending Report page");
	    	Assert.assertTrue(false);
	    }
	}

    //////////////////Survey Level Summary Report Functionality////////////////////////
	@When("user clicks on Survey Level Summary Report submenu")
	public void user_clicks_on_survey_level_summary_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyLevelSummaryReportSubMenu();
	    log.info("user clicks on Survey Level Summary Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Surveylevel Summary Report page")
	public void user_can_see_surveylevel_summary_report_page() {
	    if(surveylevelsummaryreportPg.surveyLevelSummaryReportPlainTextDisplayed()) {
	    	log.info("user can see Surveylevel Summary Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Surveylevel Summary Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Surveylevel Summary Report page")
	public void user_clicks_on_search_button_of_surveylevel_summary_report_page() throws InterruptedException {
	    surveylevelsummaryreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Surveylevel Summary Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Surveylevel Summary Report page")
	public void user_can_see_report_of_surveylevel_summary_report_page() {
		if(surveylevelsummaryreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Surveylevel Summary Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Surveylevel Summary Report page");
	    	Assert.assertTrue(false);
	    }
	}
	
	////////////////////////////Userwise Forward Summary Functionality/////////////////////////
	@When("user clicks on Userwise Forward Summary submenu")
	public void user_clicks_on_userwise_forward_summary_submenu() throws InterruptedException {
	    dashboardPg.clickOnUserWiseForwardSummarySubMenu();
	    log.info("user clicks on Userwise Forward Summary submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Userwise Forward Summary page")
	public void user_can_see_userwise_forward_summary_page() {
	    if(userwiseforwardsummaryPg.userWiseForwardSummaryPlainTextDisplayed()) {
	    	log.info("user can see Userwise Forward Summary page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Userwise Forward Summary page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Userwise Forward Summary page")
	public void user_clicks_on_search_button_of_userwise_forward_summary_page() throws InterruptedException {
	    userwiseforwardsummaryPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Userwise Forward Summary page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Userwise Forward Summary page")
	public void user_can_see_report_of_userwise_forward_summary_page() {
	    if(userwiseforwardsummaryPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Userwise Forward Summary page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Userwise Forward Summary page");
	    	Assert.assertTrue(false);
	    }
	}
	
	/////////////////Userwise Survey Edit Report Functionality//////////////////////
	@When("user clicks on Userwise Survey Edit Report submenu")
	public void user_clicks_on_userwise_survey_edit_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnUserWiseSurveyEditReportSubMenu();
	    log.info("user clicks on Userwise Survey Edit Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Userwise Survey Edit Report page")
	public void user_can_see_userwise_survey_edit_report_page() {
	    if(userwisesurveyeditreportPg.userWiseSurveyEditReportPlainTextDisplayed()) {
	    	log.info("user can see Userwise Survey Edit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Userwise Survey Edit Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Userwise Survey Edit Report page")
	public void user_clicks_on_search_button_of_userwise_survey_edit_report_page() throws InterruptedException {
	    userwisesurveyeditreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Userwise Survey Edit Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Userwise Survey Edit Report page")
	public void user_can_see_report_of_userwise_survey_edit_report_page() {
		if(userwisesurveyeditreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Userwise Survey Edit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Userwise Survey Edit Report page");
	    	Assert.assertTrue(false);
	    }
	}
	
	//////////////////Survey Modification Report Functionality///////////////////////
	@When("user clicks on Survey Modification Report submenu")
	public void user_clicks_on_survey_modification_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyModificationReportSubMenu();
	    log.info("user clicks on Survey Modification Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Modification Report page")
	public void user_can_see_survey_modification_report_page() {
	    if(surveymodificationreportPg.surveyModificationReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Modification Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Modification Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Modification Report page")
	public void user_clicks_on_search_button_of_survey_modification_report_page() throws InterruptedException {
	    surveymodificationreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Modification Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Modification Report page")
	public void user_can_see_report_of_survey_modification_report_page() {
		 if(surveymodificationreportPg.reportPlainTextDisplayed()) {
		    	log.info("user can see report of Survey Modification Report page");
		    	Assert.assertTrue(true);
		    }else {
		    	log.warn("user can not see report of Survey Modification Report page");
		    	Assert.assertTrue(false);
		    }
	}
	
	/////////////////////Survey Geotagging Report Functionality////////////////////////////////
	@When("user clicks on Survey Geotagging Report submenu")
	public void user_clicks_on_survey_geotagging_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyGeoTaggingReportSubMenu();
	    log.info("user clicks on Survey Geotagging Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Geotagging Report page")
	public void user_can_see_survey_geotagging_report_page() {
	    if(surveygeotaggingreportPg.surveyGeoTaggingReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Geotagging Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Geotagging Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Geotagging Report page")
	public void user_clicks_on_search_button_of_survey_geotagging_report_page() throws InterruptedException {
	    surveygeotaggingreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Geotagging Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Geotagging Report page")
	public void user_can_see_report_of_survey_geotagging_report_page() {
		if(surveygeotaggingreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Geotagging Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Survey Geotagging Report page");
	    	Assert.assertTrue(false);
	    }
	}

    ///////////////////Ex Party Survey Notice Functionality//////////////////////////
	@When("user clicks on Ex-Party Survey Notice submenu")
	public void user_clicks_on_ex_party_survey_notice_submenu() throws InterruptedException {
	    dashboardPg.clickOnExPartySurveyNoticeSubMenu();
	    log.info("user clicks on Ex-Party Survey Notice submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Ex Party Survey Notice page")
	public void user_can_see_ex_party_survey_notice_page() {
	    if(expartysurveynoticePg.exPartySurveyNoticePlainTextDisplayed()) {
	    	log.info("user can see Ex Party Survey Notice page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Ex Party Survey Notice page");
	    	Assert.assertTrue(false);
	    }
	}
	
	//////////////////Survey Notice List Functionality//////////////////////////
	@When("user clicks on Survey Notice List submenu")
	public void user_clicks_on_survey_notice_list_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyNoticeListSubMenu();
	    log.info("user clicks on Survey Notice List submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Notice List page")
	public void user_can_see_survey_notice_list_page() {
	    if(surveynoticelistPg.surveyNoticeListPlainTextDisplayed()) {
	    	log.info("user can see Survey Notice List page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Notice List page");
	    	Assert.assertTrue(false);
	    }
	}

    //////////////Bulk Survey Notice Print Functionality////////////////////////
	@When("user clicks on Bulk Survey Notice Print submenu")
	public void user_clicks_on_bulk_survey_notice_print_submenu() throws InterruptedException {
	    dashboardPg.clickOnBulkSurveyNoticePrintSubMenu();
	    log.info("user clicks on Bulk Survey Notice Print submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Bulk Survey Notice page")
	public void user_can_see_bulk_survey_notice_page() {
	    if(bulksurveynoticePg.bulkSurveyNoticePlainTextDisplayed()) {
	    	log.info("user can see Bulk Survey Notice page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Bulk Survey Notice page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Bulk Survey Notice page")
	public void user_clicks_on_search_button_of_bulk_survey_notice_page() throws InterruptedException {
	    bulksurveynoticePg.clickOnSearchBtn();
	    log.info("user clicks on search button of Bulk Survey Notice page");
	    Thread.sleep(3000);
	}

	@Then("user can see print button of Bulk Survey Notice page")
	public void user_can_see_print_button_of_bulk_survey_notice_page() {
		if(bulksurveynoticePg.printBtnDisplayed()) {
	    	log.info("user can see print button of Bulk Survey Notice page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see print button of Bulk Survey Notice page");
	    	Assert.assertTrue(false);
	    }
	}

    ////////////////////////Survey Notice Received List Functionality/////////////////////////
	@When("user clicks on Survey Notice Received List submenu")
	public void user_clicks_on_survey_notice_received_list_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyNoticeReceivedListSubMenu();
	    log.info("user clicks on Survey Notice Received List submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Notice Received List page")
	public void user_can_see_survey_notice_received_list_page() {
	    if(surveynoticereceivedlistPg.surveyNoticeReceivedListPlainTextDisplayed()) {
	    	log.info("user can see Survey Notice Received List page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Notice Received List page");
	    	Assert.assertTrue(false);
	    }
	}

    ////////////////////////Survey Notice Received Report Functionality/////////////////////////////////
	@When("user clicks on Survey Notice Received Report submenu")
	public void user_clicks_on_survey_notice_received_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyNoticeReceivedReportSubMenu();
	    log.info("user clicks on Survey Notice Received Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Notice Received Report page")
	public void user_can_see_survey_notice_received_report_page() {
	    if(surveynoticereceivedreportPg.surveyNoticeReceivedReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Notice Received Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Notice Received Report page");
	    	Assert.assertTrue(false);
	    }
	}

    ////////////////////Survey Notice Distributed Report Functionality////////////////////////
	@When("user clicks on Survey Notice Distributed Report submenu")
	public void user_clicks_on_survey_notice_distributed_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyNoticeDistributedReportSubMenu();
	    log.info("user clicks on Survey Notice Distributed Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Notice Distributed Report page")
	public void user_can_see_survey_notice_distributed_report_page() {
	    if(surveynoticedistributedreportPg.surveyNoticeDistributedReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Notice Distributed Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Notice Distributed Report page");
	    	Assert.assertTrue(false);
	    }
	}

	/////////////////////Survey Demand Report Functionality/////////////////////////////
	@When("user clicks on Survey Demand Report submenu")
	public void user_clicks_on_survey_demand_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyDemandReportSubMenu();
	    log.info("user clicks on Survey Demand Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Demand Report page")
	public void user_can_see_survey_demand_report_page() {
	    if(surveydemandreportPg.surveyDemandReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Demand Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Demand Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Demand Report page")
	public void user_clicks_on_search_button_of_survey_demand_report_page() throws InterruptedException {
	    surveydemandreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Demand Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see report of Survey Demand Report page")
	public void user_can_see_report_of_survey_demand_report_page() {
		if(surveydemandreportPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of Survey Demand Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of Survey Demand Report page");
	    	Assert.assertTrue(false);
	    }
	}
	
	///////////////////Survey GIS Update Functionality///////////////////////////
	@When("user clicks on Survey GIS Update submenu")
	public void user_clicks_on_survey_gis_update_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyGISUpdateSubMenu();
	    log.info("user clicks on Survey GIS Update submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Search Survey page")
	public void user_can_see_search_survey_page() {
	    if(searchsurveyPg.searchSurveyPlainTextDisplayed()) {
	    	log.info("user can see Search Survey page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Search Survey page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user select ward no. of Search Survey page")
	public void user_select_ward_no_of_search_survey_page() {
	    searchsurveyPg.selectWardNoDropDown("1");
	    log.info("user select ward no. of Search Survey page");
	}

	@When("user clicks search button of Search Survey page")
	public void user_clicks_search_button_of_search_survey_page() throws InterruptedException {
	    searchsurveyPg.clickOnSearchBtn();
	    log.info("user clicks search button of Search Survey page");
	    Thread.sleep(3000);
	}

	@Then("user can see Property List page")
	public void user_can_see_property_list_page() {
	    if(propertylistPg.propertyListPlainTextDisplayed()) {
	       log.info("user can see Property List page");
	       Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Property List page");
	    	Assert.assertTrue(false);
	    }
	}

	////////////////Survey Visit Report Functionality//////////////////
	@When("user clicks on Survey Visit Report submenu")
	public void user_clicks_on_survey_visit_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnSurveyVisitReportSubMenu();
	    log.info("user clicks on Survey Visit Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Survey Visit Report page")
	public void user_can_see_survey_visit_report_page() {
	    if(surveyvisitreportPg.surveyVisitReportPlainTextDisplayed()) {
	    	log.info("user can see Survey Visit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Survey Visit Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of Survey Visit Report page")
	public void user_clicks_on_search_button_of_survey_visit_report_page() throws InterruptedException {
	    surveyvisitreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of Survey Visit Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see records of Survey Visit Report page")
	public void user_can_see_records_of_survey_visit_report_page() {
		if(surveyvisitreportPg.recordPlainTextDisplayed()) {
	    	log.info("user can see records of Survey Visit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see records of Survey Visit Report page");
	    	Assert.assertTrue(false);
	    }
	}
	
	/////////////////TL Survey Visit Functionality//////////////////////////
	@When("user clicks on TL Survey Visit submenu")
	public void user_clicks_on_tl_survey_visit_submenu() throws InterruptedException {
	    dashboardPg.clickOnTLSurveyVisitSubMenu();
	    log.info("user clicks on TL Survey Visit submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see Search Survey Visit page")
	public void user_can_see_search_survey_visit_page() {
	    if(searchsurveyvisitPg.searchSurveyVisitPlainTextDisplayed()) {
	    	log.info("user can see Search Survey Visit page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see Search Survey Visit page");
	    	Assert.assertTrue(false);
	    }
	}
	
	////////////////////TL Survey Visit Report Functionality////////////////////////////
	@When("user clicks on TL Survey Visit Report submenu")
	public void user_clicks_on_tl_survey_visit_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnTLSurveyVisitReportSubMenu();
	    log.info("user clicks on TL Survey Visit Report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see TL Survey Visit Report page")
	public void user_can_see_tl_survey_visit_report_page() {
	    if(tlsurveyvisitreportPg.tlSurveyVisitReportPlainTextDisplayed()) {
	    	log.info("user can see TL Survey Visit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see TL Survey Visit Report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of TL Survey Visit Report page")
	public void user_clicks_on_search_button_of_tl_survey_visit_report_page() throws InterruptedException {
	    tlsurveyvisitreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button of TL Survey Visit Report page");
	    Thread.sleep(3000);
	}

	@Then("user can see records of TL Survey Visit Report page")
	public void user_can_see_records_of_tl_survey_visit_report_page() {
		if(tlsurveyvisitreportPg.recordPlainTextDisplayed()) {
	    	log.info("user can see records of TL Survey Visit Report page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see records of TL Survey Visit Report page");
	    	Assert.assertTrue(false);
	    }
	}
	

}
