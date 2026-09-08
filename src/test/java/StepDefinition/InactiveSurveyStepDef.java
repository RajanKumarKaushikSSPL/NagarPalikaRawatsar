package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class InactiveSurveyStepDef extends BaseClass {
	
	@When("User clicks on Inactive Survey menu")
	public void user_clicks_on_inactive_survey_menu() {
	    dashboardPg.clickOnInactiveSurveyMenu();
	    log.info("User clicks on Inactive Survey menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view Inactive Survey submenu of Inactive Survey menu")
	public void user_can_view_inactive_survey_submenu_of_inactive_survey_menu() {
	    if(dashboardPg.InactiveSurveySubMenuisdisplayed()) {
	    	log.info("user can view Inactive Survey submenu of Inactive Survey menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Inactive Survey submenu of Inactive Survey menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Inactive Survey Activity submenu of Inactive Survey menu")
	public void user_can_view_inactive_survey_activity_submenu_of_inactive_survey_menu() {
		if(dashboardPg.InactiveSurveyActivitySubMenuisdisplayed()) {
	    	log.info("user can view Inactive Survey Activity submenu of Inactive Survey menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Inactive Survey Activity submenu of Inactive Survey menu");
	    	Assert.assertTrue(false);
	     
	    }
	}

}
