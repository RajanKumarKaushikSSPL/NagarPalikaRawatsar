package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class AssessmentStepDef extends BaseClass {
	
	@When("User clicks on Assessment menu")
	public void user_clicks_on_assessment_menu() {
	    dashboardPg.clickOnAssessmentMenu();
	    log.info("clicked on Assessment Menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User is able to see Reassessment submenu")
	public void user_is_able_to_see_reassessment_submenu() {
	    if(dashboardPg.reAssessmentSubMenuisdisplayed()) {
	    	log.info("User is able to see Reassessment submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Reassessment submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Reverification submenu")
	public void user_is_able_to_see_reverification_submenu() {
		if(dashboardPg.reVerificationSubMenuisdisplayed()) {
	    	log.info("User is able to see Reverification submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Reverification submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Reverification TL submenu")
	public void user_is_able_to_see_reverification_tl_submenu() {
		if(dashboardPg.reVerificationTLSubMenuisdisplayed()) {
	    	log.info("User is able to see Reverification TL submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Reverification TL submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see House Tax Entry submenu")
	public void user_is_able_to_see_house_tax_entry_submenu() {
		if(dashboardPg.houseTaxEntrySubMenuisdisplayed()) {
	    	log.info("User is able to see House Tax Entry submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see House Tax Entry submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Legacy Entry submenu")
	public void user_is_able_to_see_legacy_entry_submenu() {
		if(dashboardPg.legacyEntrySubMenuisdisplayed()) {
	    	log.info("User is able to see Legacy Entry submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Legacy Entry submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Edit New Assessment submenu")
	public void user_is_able_to_see_edit_new_assessment_submenu() {
		if(dashboardPg.editNewAssessmentSubMenuisdisplayed()) {
	    	log.info("User is able to see Edit New Assessment submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Edit New Assessment submenu");
	    	Assert.assertTrue(false);
	    }
	}
}
