package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class CitizenStepDef extends BaseClass {
	
	//////////////////////User opens Citizen Page successfully//////////////////////////////
	@When("user opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    log.info("URL opened");
	}

	@Then("User can see Citizen Page")
	public void user_can_see_citizen_page() {
	    if(citizenPg.homeLinkTextDisplayed()) {
	    	log.info("User can see Citizen Page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Citizen Page");
	    	Assert.assertTrue(false);
	    }
	}
	
	///////////////////Citizen Page contains all fields////////////////////////////
	@Then("User can see plain text of Nagar Palika Rawatsar")
	public void user_can_see_plain_text_of_nagar_palika_rawatsar() {
	    if(citizenPg.nagarPalikaRawatsarPlainTextDisplayed()) {
	    	log.info("User can see plain text of Nagar Palika Rawatsar");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see plain text of Nagar Palika Rawatsar");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see official login button")
	public void user_can_see_official_login_button() {
		if(citizenPg.officialLoginBtnDisplayed()) {
	    	log.info("User can see official login button");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see official login button");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see TC App button")
	public void user_can_see_tc_app_button() {
		if(citizenPg.tcAppBtnDisplayed()) {
	    	log.info("User can see TC App button");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see TC App button");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Home link")
	public void user_can_see_home_link() {
		if(citizenPg.homeLinkTextDisplayed()) {
	    	log.info("User can see Home link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Home link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Services link")
	public void user_can_see_services_link() {
		if(citizenPg.servicesLinkTextDisplayed()) {
	    	log.info("User can see Services link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Services link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see About Us link")
	public void user_can_see_about_us_link() {
		if(citizenPg.aboutUsLinkTextDisplayed()) {
	    	log.info("User can see About Us link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see About Us link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Act link")
	public void user_can_see_act_link() {
		if(citizenPg.actLinkTextDisplayed()) {
	    	log.info("User can see Act link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Act link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Gallery link")
	public void user_can_see_gallery_link() {
		if(citizenPg.galleryLinkTextDisplayed()) {
	    	log.info("User can see Gallery link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Gallery link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Contact link")
	public void user_can_see_contact_link() {
		if(citizenPg.contactLinkTextDisplayed()) {
	    	log.info("User can see Contact link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Contact link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Feedback link")
	public void user_can_see_feedback_link() {
		if(citizenPg.feedbackLinkTextDisplayed()) {
	    	log.info("User can see Feedback link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Feedback link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Quick Access Tiles section")
	public void user_can_see_quick_access_tiles_section() {
		if(citizenPg.quickAccessTilesSectionDisplayed()) {
	    	log.info("User can see Quick Access Tiles section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Quick Access Tiles section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Access citizen services at section")
	public void user_can_see_access_citizen_services_at_section() {
		if(citizenPg.accessCitizenServicesAtSectionDisplayed()) {
	    	log.info("User can see Access citizen services at section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Access citizen services at section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Recent Notices & Tenders section")
	public void user_can_see_recent_notices_tenders_section() {
		if(citizenPg.recentNoticesAndTendersSectionDisplayed()) {
	    	log.info("User can see Recent Notices & Tenders section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Recent Notices & Tenders section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Administrator section")
	public void user_can_see_administrator_section() {
		if(citizenPg.administratorSectionDisplayed()) {
	    	log.info("User can see Administrator section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Administrator section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Government Programs & Schemes section")
	public void user_can_see_government_programs_schemes_section() {
		if(citizenPg.governmentProgramsAndSchemesSectionDisplayed()) {
	    	log.info("User can see Government Programs & Schemes section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Government Programs & Schemes section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Zone & Wards section")
	public void user_can_see_zone_wards_section() {
		if(citizenPg.zoneAndWardsSectionDisplayed()) {
	    	log.info("User can see Zone & Wards section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Zone & Wards section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see About Us section")
	public void user_can_see_about_us_section() {
		if(citizenPg.aboutUsSectionDisplayed()) {
	    	log.info("User can see About Us section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see About Us section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Gallery of Rawatsar section")
	public void user_can_see_gallery_of_rawatsar_section() {
		if(citizenPg.galleryOfRawatsarSectionDisplayed()) {
	    	log.info("User can see Gallery of Rawatsar section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Gallery of Rawatsar section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Get in touch section")
	public void user_can_see_get_in_touch_section() {
		if(citizenPg.getInTouchSectionDisplayed()) {
	    	log.info("User can see Get in touch section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Get in touch section");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Quicks Links section")
	public void user_can_see_quicks_links_section() {
		if(citizenPg.quicksLinksSectionDisplayed()) {
	    	log.info("User can see Quicks Links section");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Quicks Links section");
	    	Assert.assertTrue(false);
	    }
	}
	
	//////////////////Services Link contains all links ///////////////////////////
	@When("User clicks on services link")
	public void user_clicks_on_services_link() throws InterruptedException {
	    citizenPg.clickOnServicesLink();
	    log.info("User clicks on services link");
	    Thread.sleep(2000);
	}

	@Then("User can see Search Property link")
	public void user_can_see_search_property_link() {
	    if(citizenPg.searchPropertyLinkDisplayed()) {
	    	log.info("User can see Search Property link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Search Property link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Property Details link")
	public void user_can_see_property_details_link() {
		if(citizenPg.propertyDetailsLinkDisplayed()) {
	    	log.info("User can see Property Details link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Property Details link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Pay UD Tax link")
	public void user_can_see_pay_ud_tax_link() {
		if(citizenPg.payUDTaxLinkDisplayed()) {
	    	log.info("User can see Pay UD Tax link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Pay UD Tax link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see View Payment Details link")
	public void user_can_see_view_payment_details_link() {
		if(citizenPg.viewPaymentDetailsLinkDisplayed()) {
	    	log.info("User can see View Payment Details link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see View Payment Details link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see UDT - Apply Self Assessment link")
	public void user_can_see_udt_apply_self_assessment_link() {
		if(citizenPg.UDTApplySelfAssesmentLinkDisplayed()) {
	    	log.info("User can see UDT - Apply Self Assessment link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see UDT - Apply Self Assessment link");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("User can see Apply Aapatti link")
	public void user_can_see_apply_aapatti_link() {
		if(citizenPg.applyAapattiLinkDisplayed()) {
	    	log.info("User can see Apply Aapatti link");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Apply Aapatti link");
	    	Assert.assertTrue(false);
	    }
	}


	

}
