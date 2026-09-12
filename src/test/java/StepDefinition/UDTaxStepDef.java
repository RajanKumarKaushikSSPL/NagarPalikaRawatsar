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
	
	///////////////////Search Property Functionality///////////////////////////
	
	@When("user clicks on search property submenu")
	public void user_clicks_on_search_property_submenu() throws InterruptedException {
	    dashboardPg.clickOnSearchPropertySubMenu();
	    log.info("user clicks on search property submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see search property page")
	public void user_can_see_search_property_page() {
	    String expTitle="Search Property";
	    String actTitle=searchpropertyPg.getSearchPropertyPageText();
	    if(expTitle.equals(actTitle)) {
	    	log.info("user can see search property page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see search property page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user select ward no.")
	public void user_select_ward_no() {
	    searchpropertyPg.selectWardNoDropDown("1");
	    log.info("user select ward no.");
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	    searchpropertyPg.clickOnSearchBtn();
	    log.info("user click on search button");
	    //Thread.sleep(2000);
	}

	@Then("user can see property list page")
	public void user_can_see_property_list_page() {
	    String expTitle="Property List";
	    String actTitle=propertylistPg.getPropertyListPageText();
	    if(expTitle.equals(actTitle)) {
	    	log.info("user can see property list page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see property list page");
	    	Assert.assertTrue(false);
	    }
	}
	
	///////////////////Document Upload Functionality//////////////////
	@When("user clicks on document upload submenu")
	public void user_clicks_on_document_upload_submenu() throws InterruptedException {
	    dashboardPg.clickOnDocumentUploadSubMenu();
	    log.info("user clicks on document upload submenu");
	    Thread.sleep(2000);
	}
	
	////////////////////Update Property Details Functionality//////////////////
	@When("user clicks on update property details submenu")
	public void user_clicks_on_update_property_details_submenu() throws InterruptedException {
		dashboardPg.clickOnUpdatePropertyDetailsSubMenu();
	    log.info("user clicks on update property details submenu");
	    Thread.sleep(2000);
	}
	
	/////////////////////Last Payment Update Functionality//////////////////////
	@When("user clicks on last payment update submenu")
	public void user_clicks_on_last_payment_update_submenu() throws InterruptedException {
		dashboardPg.clickOnLastPaymentUpdateSubMenu();
	    log.info("user clicks on last payment update submenu");
	    Thread.sleep(2000);
	}
	
	///////////////////////Update Owner Details Functionality//////////////////
	@When("user clicks on update owner details submenu")
	public void user_clicks_on_update_owner_details_submenu() throws InterruptedException {
		dashboardPg.clickOnUpdateOwnerDetailsSubMenu();;
	    log.info("user clicks on update owner details submenu");
	    Thread.sleep(2000);
	}
	
	/////////////////////////Property Deactivate Functionality/////////////////////
	@When("user clicks on property deactivate submenu")
	public void user_clicks_on_property_deactivate_submenu() throws InterruptedException {
	    dashboardPg.clickOnPropertyDeactivateSubMenu();
	    log.info("user clicks on property deactivate submenu");
	    Thread.sleep(2000);
	}
	
	////////////////////////Ward Update Functionality/////////////////////////////
	@When("user clicks on ward update submenu")
	public void user_clicks_on_ward_update_submenu() throws InterruptedException {
		dashboardPg.clickOnWardUpdateSubMenu();
	    log.info("user clicks on ward update submenu");
	    Thread.sleep(2000);
	}
	
	////////////////////////Adjustment Functionality//////////////////////////////
	@When("user clicks on adjustment submenu")
	public void user_clicks_on_adjustment_submenu() throws InterruptedException {
		dashboardPg.clickOnAdjustmentSubMenu();
	    log.info("user clicks on ward update submenu");
	    Thread.sleep(2000);
	}
	
	//////////////////////House Tax Last Payment Update Functionality//////////////
	@When("user clicks on house tax last payment update submenu")
	public void user_clicks_on_house_tax_last_payment_update_submenu() throws InterruptedException {
		dashboardPg.clickOnHouseTaxLastPaymentUpdateSubMenu();
	    log.info("user clicks on house tax last payment update submenu");
	    Thread.sleep(2000);
	}
	
	////////////////////////DN Notice Distribution Functionality///////////////////
	@When("user clicks on DN notice distribution submenu")
	public void user_clicks_on_dn_notice_distribution_submenu() throws InterruptedException {
		dashboardPg.clickOnDNNoticeDistributionSubMenu();
	    log.info("user clicks on DN notice distribution submenu");
	    Thread.sleep(2000);
	}

	
}
