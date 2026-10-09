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



}
