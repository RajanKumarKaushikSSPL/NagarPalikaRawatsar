package StepDefinition;

import org.testng.Assert;

import PageObject.LegacyEntryPage;
import io.cucumber.java.en.*;

public class AssessmentStepDef extends BaseClass {
	
	/////////////////To check presence of all submenus of Assessment menu//////////////
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
	
	////////////////////To apply House Tax Entry/////////////////////////////
	
	@When("User clicks on House Tax Entry submenu of Assessment menu")
	public void user_clicks_on_house_tax_entry_submenu_of_assessment_menu() {
	    dashboardPg.clickOnHouseTaxEntrySubMenu();
	    log.info("User clicks on House Tax Entry submenu of Assessment menu");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("User can see House Tax Entry page")
	public void user_can_see_house_tax_entry_page() {
	    String expTitle="House Tax Entry";
	    String actTitle=housetaxentryPg.getHouseTaxEntryPageText().trim();
	    if(expTitle.equals(actTitle)) {
	    	log.info("User can see House Tax Entry page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see House Tax Entry page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("User enters property details")
	public void user_enters_property_details() throws InterruptedException {
	   housetaxentryPg.enterServiceNo(randomNumber());
	   Thread.sleep(3000);
	   housetaxentryPg.clickOnWardNoDropDown();
	   housetaxentryPg.selectWardNoDropDown("1");
	   housetaxentryPg.clickOnAreaNameComboBox();
	   Thread.sleep(2000);
	   housetaxentryPg.enterAreaName("Ward 1 - (1)");
	   housetaxentryPg.selectRoadTypeDropDown("Interior Road");
	   housetaxentryPg.enterPlotArea("1000");
	   housetaxentryPg.enterPlinthArea("1000");
	   log.info("User enters property details");
	}

	@When("User enters permanent address")
	public void user_enters_permanent_address() {
	    housetaxentryPg.enterPermHouseNo(randomNumber());
	    housetaxentryPg.enterPermColony(randomString());
	    housetaxentryPg.enterPermStreet(randomString());
	    housetaxentryPg.enterPermLandmark(randomString());
	    housetaxentryPg.enterPermPinCode(randomPinCode());
	    housetaxentryPg.enterPermContactNo(randomNumber());
	    housetaxentryPg.enterPermCity(randomString());
	    log.info("User enters permanent address");
	}

	@When("User enters current address")
	public void user_enters_current_address() {
	    housetaxentryPg.checkCurrentAddressCheckBox();
	    log.info("User enters current address");
	}

	@When("User enters owner details")
	public void user_enters_owner_details() {
	    housetaxentryPg.enterOwnerName(randomString());
	    housetaxentryPg.selectGenderDropDown("Male");
	    housetaxentryPg.enterAge(randomAge());
	    housetaxentryPg.enterMobileNo(randomNumber());
	    housetaxentryPg.selectRelationDropDown("S/O");
	    housetaxentryPg.enterGuardianName(randomString());
	    housetaxentryPg.selectOccupationDropDown("Service");
	    log.info("User enters owner details");
	}

	@When("User enters floor details")
	public void user_enters_floor_details() throws InterruptedException {
	    housetaxentryPg.selectFloorNameDropDown1("Basement 1");
	    housetaxentryPg.selectUsageTypeDropDown1("RESIDENTIAL");
	    housetaxentryPg.selectUsageCategoryDropDown1("General");
	    housetaxentryPg.selectFromYearDropDown1("2007-2008");
	    housetaxentryPg.selectUpToYearDropDown1("2026-2027");
	    housetaxentryPg.enterBuiltUpArea1("1000");
	    housetaxentryPg.clickOnAddFloorButton1();
	    Thread.sleep(2000);
	    housetaxentryPg.selectFloorNameDropDown2("Ground Floor");
	    housetaxentryPg.selectUsageTypeDropDown2("RESIDENTIAL");
	    housetaxentryPg.selectUsageCategoryDropDown2("General");
	    housetaxentryPg.selectFromYearDropDown2("2007-2008");
	    housetaxentryPg.selectUpToYearDropDown2("2026-2027");
	    housetaxentryPg.enterBuiltUpArea2("1000");
	    log.info("User enters floor details");
	}

	@When("User enters demand details")
	public void user_enters_demand_details() throws InterruptedException {
	    housetaxentryPg.selectDemandYearDropDown1("2000-2001");
	    housetaxentryPg.enterAmount1("10000");
	    housetaxentryPg.clickOnAddDemandButton1();
	    Thread.sleep(2000);
	    housetaxentryPg.selectDemandYearDropDown2("2001-2002");
	    housetaxentryPg.enterAmount2("10000");
	    log.info("User enters demand details");
	}

	@When("User clicks on view button")
	public void user_clicks_on_view_button() throws InterruptedException {
	    housetaxentryPg.clickOnViewButton();
	    Thread.sleep(3000);
	    log.info("User clicks on view button");
	}

	@Then("User can see House Tax Entry View Page")
	public void user_can_see_house_tax_entry_view_page() {
	    String expTitle="House Tax Entry View";
	    String actTitle=housetaxentryviewPg.getHouseTaxEntryViewPageText().trim();
	    if(expTitle.equals(actTitle)) {
	    	log.info("User can see House Tax Entry View Page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see House Tax Entry View Page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("User clicks on save button")
	public void user_clicks_on_save_button() throws InterruptedException {
	    housetaxentryviewPg.clickOnSaveButton();
	    log.info("User clicks on save button");
	    Thread.sleep(3000);
	}

	@Then("User can see House Tax Payment page")
	public void user_can_see_house_tax_payment_page() {
		String expTitle="House Tax Payment";
	    String actTitle=housetaxpaymentPg.getHouseTaxPaymentPageText().trim();
	    if(expTitle.equals(actTitle)) {
	    	log.info("User can see House Tax Payment page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see House Tax Payment page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("User enters payment details")
	public void user_enters_payment_details() throws InterruptedException {
		housetaxpaymentPg.enterRefNo("1");
		housetaxpaymentPg.clickOnRefDateTextBox();
		Thread.sleep(2000);
		housetaxpaymentPg.selectTodayDate();
		housetaxpaymentPg.enterBankName("SBI");
		housetaxpaymentPg.enterBranchName("Harmu Housing Colony");
		housetaxpaymentPg.selectFile("C:\\Users\\welcome\\Desktop\\sample PNG.png");
		housetaxpaymentPg.enterRemarks("Test Purpose");
		log.info("User enters payment details");
	}

	@When("User clicks on pay now button")
	public void user_clicks_on_pay_now_button() throws InterruptedException {
	    housetaxpaymentPg.clickOnPayNowButton();
	    log.info("User clicks on pay now button");
	    Thread.sleep(3000);
	}

	@Then("User can see House Tax Payment Receipt Page")
	public void user_can_see_house_tax_payment_receipt_page() {
		String expTitle="House Tax Payment Receipt";
		String actTile=housetaxpaymentreceiptPg.getHouseTaxPaymentReceiptPageText().trim();
		if(expTitle.equals(actTile)) {
			log.info("User can see House Tax Payment Receipt Page");
			Assert.assertTrue(true);
		}else {
			log.warn("User can not see House Tax Payment Receipt Page");
			Assert.assertTrue(false);
		}
	}
	
	/////////////////////To apply Legacy Entry///////////////////////////
	
	@When("User clicks on Legacy Entry submenu of Assessment menu")
	public void user_clicks_on_legacy_entry_submenu_of_assessment_menu() throws InterruptedException {
	    dashboardPg.clickOnLegacyEntrySubMenu();
	    log.info("User clicks on Legacy Entry submenu of Assessment menu");
	    Thread.sleep(2000);
	}

	@Then("User can see Legacy Entry page")
	public void user_can_see_legacy_entry_page() {
	    String expTitle="Legacy Entry";
	    String actTitle=legacyentrypg.getLegacyEntryPageText().trim();
	    if(expTitle.equals(actTitle)) {
	    	log.info("User can see Legacy Entry page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Legacy Entry page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("User enters property details of Legacy Entry submenu")
	public void user_enters_property_details_of_legacy_entry_submenu() throws InterruptedException {
	    legacyentrypg.enterServiceNo(randomNumber());
	    legacyentrypg.selectWardNoDropDown("1");
	    legacyentrypg.clickOnAreaNameComboBox();
	    Thread.sleep(2000);
	    legacyentrypg.enterAreaName("Ward 1 - (1)");
	    legacyentrypg.selectRoadTypeDropDown("Interior Road");
	    legacyentrypg.enterPlotArea("1000");
	    legacyentrypg.enterPlinthArea("1000");
	    legacyentrypg.enterVacantArea("0");
	    log.info("User enters property details of Legacy Entry submenu");
	}

	@When("User enters permanent address of Legacy Entry submenu")
	public void user_enters_permanent_address_of_legacy_entry_submenu() {
	    legacyentrypg.enterPermHouseNo("1");
	    legacyentrypg.enterPermCity(randomString());
	    legacyentrypg.enterPermMohalla(randomString());
	    legacyentrypg.enterPermLandmark(randomString());
	    legacyentrypg.enterPermPinCode(randomPinCode());
	    legacyentrypg.enterPermContactNo(randomNumber());
	    legacyentrypg.enterPermAddress(randomString());
	    log.info("User enters permanent address of Legacy Entry submenu");
	}

	@When("User enters current address of Legacy Entry submenu")
	public void user_enters_current_address_of_legacy_entry_submenu() {
	    legacyentrypg.checkCurrentAddressCheckBox();
	    log.info("User enters current address of Legacy Entry submenu");
	}

	@When("User enters owner details of Legacy Entry submenu")
	public void user_enters_owner_details_of_legacy_entry_submenu() {
	    legacyentrypg.enterOwnerName(randomString());
	    legacyentrypg.selectGenderDropDown("Male");
	    legacyentrypg.enterAge(randomAge());
	    legacyentrypg.enterMobileNo(randomNumber());
	    legacyentrypg.selectRelationDropDown("S/O");
	    legacyentrypg.enterGuardianName(randomString());
	    legacyentrypg.selectOccupationDropDown("Service");
	    log.info("User enters owner details of Legacy Entry submenu");
	}

	@When("User enters tax details of Legacy Entry submenu")
	public void user_enters_tax_details_of_legacy_entry_submenu() {
	    legacyentrypg.selectFinancialYearDropDown1("2007-2008");
	    legacyentrypg.enterYearlyTax1("10000");
	    legacyentrypg.clickOnAddBtn1();
	    legacyentrypg.selectFinancialYearDropDown2("2008-2009");
	    legacyentrypg.enterYearlyTax2("20000");
	    legacyentrypg.uploadFile("C:\\Users\\welcome\\Desktop\\sample PNG.png");
	    legacyentrypg.enterRemarks(randomString());
	    log.info("User enters tax details of Legacy Entry submenu");
	}

	@When("User clicks on save button of Legacy Entry submenu")
	public void user_clicks_on_save_button_of_legacy_entry_submenu() throws InterruptedException {
	    legacyentrypg.clickOnSaveBtn();
	    Thread.sleep(2000);
	    log.info("User clicks on save button of Legacy Entry submenu");
	}

	@Then("User can see confirmation message")
	public void user_can_see_confirmation_message() {
	    String expTitle="Property entry created successfully.";
	    String actTitle=legacyentrypg.getConfirmationMessageOfLegacyEntry().replace("×", "").trim();
	    
	    if(expTitle.equals(actTitle)) {
	    	log.info("User can see confirmation message");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see confirmation message");
	    	Assert.assertTrue(false);
	    }
	  
	}
}
