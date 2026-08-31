package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class UDTaxStepDef extends BaseClass {
 
	@When("User clicks on UD Tax menu")
	public void user_clicks_on_ud_tax_menu() {
	    dashboardPg.clickOnUDTaxMenu();
	    log.info("User clicks on UD Tax menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User is able to see Search Propety submenu")
	public void user_is_able_to_see_search_propety_submenu() {
	    if(dashboardPg.searchPropertySubMenuisdisplayed()) {
	    	log.info("User is able to see Search Propety submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Search Propety submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Document Upload submenu")
	public void user_is_able_to_see_document_upload_submenu() {
		if(dashboardPg.documentUploadSubMenuisdisplayed()) {
	    	log.info("User is able to see Document Upload submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Document Upload submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Update Property Details submenu")
	public void user_is_able_to_see_update_property_details_submenu() {
		if(dashboardPg.updatePropertyDetailsSubMenuisdisplayed()) {
	    	log.info("User is able to see Update Property Details submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Update Property Details submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Last Payment Update submenu")
	public void user_is_able_to_see_last_payment_update_submenu() {
		if(dashboardPg.lastPaymentUpdateSubMenuisdisplayed()) {
	    	log.info("User is able to see Last Payment Update submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Last Payment Update submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Update Owner Details submenu")
	public void user_is_able_to_see_update_owner_details_submenu() {
		if(dashboardPg.updateOwnerDetailsSubMenuisdisplayed()) {
	    	log.info("User is able to see Update Owner Details submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Update Owner Details submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Property Deativate submenu")
	public void user_is_able_to_see_property_deativate_submenu() {
		if(dashboardPg.propertyDeactivateSubMenuisdisplayed()) {
	    	log.info("User is able to see Property Deativate submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Property Deativate submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Ward Update submenu")
	public void user_is_able_to_see_ward_update_submenu() {
		if(dashboardPg.wardUpdateSubMenuisdisplayed()) {
	    	log.info("User is able to see Ward Update submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Ward Update submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see Adjustment submenu")
	public void user_is_able_to_see_adjustment_submenu() {
		if(dashboardPg.adjustmentSubMenuisdisplayed()) {
	    	log.info("User is able to see Adjustment submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see Adjustment submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see House Tax Last Payment Update submenu")
	public void user_is_able_to_see_house_tax_last_payment_update_submenu() {
		if(dashboardPg.HouseTaxLastPaymentUpdateSubMenuisdisplayed()) {
	    	log.info("User is able to see House Tax Last Payment Update submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see House Tax Last Payment Update submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see TL Property Visit submenu")
	public void user_is_able_to_see_tl_property_visit_submenu() {
		if(dashboardPg.TLPropertyVisitSubMenuisdisplayed()) {
	    	log.info("User is able to see TL Property Visit submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see TL Property Visit submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User is able to see DN Notice Distribution submenu")
	public void user_is_able_to_see_dn_notice_distribution_submenu() {
		if(dashboardPg.DNNoticeDistributionSubMenuisdisplayed()) {
	    	log.info("User is able to see DN Notice Distribution submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see DN Notice Distribution submenu");
	    	Assert.assertTrue(false);
	    }
	}
}
