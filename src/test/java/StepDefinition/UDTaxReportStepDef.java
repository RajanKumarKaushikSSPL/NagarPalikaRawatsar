package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class UDTaxReportStepDef extends BaseClass {

	@When("User clicks on UD Tax Report menu")
	public void user_clicks_on_ud_tax_report_menu() {
	    dashboardPg.clickOnUDTaxReportMenu();
	    log.info("User clicks on UD Tax Report menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view counter report submenu of UDTax Report menu")
	public void user_can_view_counter_report_submenu_of_ud_tax_report_menu() {
	    if(dashboardPg.CounterReportSubMenuisdisplayed()) {
	    	log.info("user can view counter report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view counter report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TC Collection Summary submenu of UDTax Report menu")
	public void user_can_view_tc_collection_summary_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TCCollectionSummarySubMenuisdisplayed()) {
	    	log.info("user can view TC Collection Summary submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view TC Collection Summary submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view DCB Report submenu of UDTax Report menu")
	public void user_can_view_dcb_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.DCBReportSubMenuisdisplayed()) {
	    	log.info("user can view DCB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view DCB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view SAF Report submenu of UDTax Report menu")
	public void user_can_view_saf_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.SAFReportSubMenuisdisplayed()) {
	    	log.info("user can view SAF Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view SAF Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Zone and Ward Wise Collection Report submenu of UDTax Report menu")
	public void user_can_view_zone_and_ward_wise_collection_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ZoneAndWardWiseCollectionReportSubMenuisdisplayed()) {
	    	log.info("user can view Zone and Ward Wise Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Zone and Ward Wise Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Payment Mode Wise Collection submenu of UDTax Report menu")
	public void user_can_view_payment_mode_wise_collection_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.PaymentModeWiseCollectionSubMenuisdisplayed()) {
	    	log.info("user can view Payment Mode Wise Collection submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Payment Mode Wise Collection submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view ULB Report submenu of UDTax Report menu")
	public void user_can_view_ulb_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ULBReportSubMenuisdisplayed()) {
	    	log.info("user can view ULB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view ULB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Transaction Deactivate Report submenu of UDTax Report menu")
	public void user_can_view_transaction_deactivate_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TransactionDeactivateReportSubMenuisdisplayed()) {
	    	log.info("user can view Transaction Deactivate Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Transaction Deactivate Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view ALL Module TC Summary submenu of UDTax Report menu")
	public void user_can_view_all_module_tc_summary_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ALLModuleTCSummarySubMenuisdisplayed()) {
	    	log.info("user can view ALL Module TC Summary submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view ALL Module TC Summary submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Cheque Bounce Report submenu of UDTax Report menu")
	public void user_can_view_cheque_bounce_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ChequeBounceReportSubMenuisdisplayed()) {
	    	log.info("user can view Cheque Bounce Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Cheque Bounce Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Print All Payment Reciept submenu of UDTax Report menu")
	public void user_can_view_print_all_payment_reciept_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.PrintAllPaymentReceiptSubMenuisdisplayed()) {
	    	log.info("user can view Print All Payment Reciept submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Print All Payment Reciept submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Taxable Property Report submenu of UDTax Report menu")
	public void user_can_view_taxable_property_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TaxablePropertyReportSubMenuisdisplayed()) {
	    	log.info("user can view Taxable Property Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Taxable Property Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view PropertyWise DCB submenu of UDTax Report menu")
	public void user_can_view_property_wise_dcb_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.PropertyWiseDCBSubMenuisdisplayed()) {
	    	log.info("user can view PropertyWise DCB submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view PropertyWise DCB submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Htax DCB Report submenu of UDTax Report menu")
	public void user_can_view_htax_dcb_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.HtaxDCBReportSubMenuisdisplayed()) {
	    	log.info("user can view Htax DCB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Htax DCB Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Print All Demand Reciept submenu of UDTax Report menu")
	public void user_can_view_print_all_demand_reciept_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.PrintAllDemandRecieptSubMenuisdisplayed()) {
	    	log.info("user can view Print All Demand Reciept submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can view Print All Demand Reciept submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Variation Report submenu of UDTax Report menu")
	public void user_can_view_variation_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.VariationReportSubMenuisdisplayed()) {
	    	log.info("user can view Variation Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Variation Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Reassesment Diff submenu of UDTax Report menu")
	public void user_can_view_reassesment_diff_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ReassesmentDiffSubMenuisdisplayed()) {
	    	log.info("user can view Reassesment Diff submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Reassesment Diff submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Cheque Bounced Collection Report submenu of UDTax Report menu")
	public void user_can_view_cheque_bounced_collection_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ChequeBouncedCollectionReportSubMenuisdisplayed()) {
	    	log.info("user can view Cheque Bounced Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Cheque Bounced Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Re-verification Difference Report submenu of UDTax Report menu")
	public void user_can_view_re_verification_difference_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ReverificationDifferenceReportSubMenuisdisplayed()) {
	    	log.info("user can view Re-verification Difference Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Re-verification Difference Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Tax Collection Report submenu of UDTax Report menu")
	public void user_can_view_tax_collection_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TaxCollectionReportSubMenuisdisplayed()) {
	    	log.info("user can view Tax Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Tax Collection Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Appti List submenu of UDTax Report menu")
	public void user_can_view_appti_list_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ApptiListSubMenuisdisplayed()) {
	    	log.info("user can view Appti List submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Appti List submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Apptti Pending Report submenu of UDTax Report menu")
	public void user_can_view_apptti_pending_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.AppttiPendingReportSubMenuisdisplayed()) {
	    	log.info("user can view Apptti Pending Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Apptti Pending Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Appti Reject List submenu of UDTax Report menu")
	public void user_can_view_appti_reject_list_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.ApptiRejectListSubMenuisdisplayed()) {
	    	log.info("user can view Appti Reject List submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Appti Reject List submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TC Visit Report submenu of UDTax Report menu")
	public void user_can_view_tc_visit_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TCVisitReportSubMenuisdisplayed()) {
	    	log.info("user can view TC Visit Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view TC Visit Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TC Visit Summary submenu of UDTax Report menu")
	public void user_can_view_tc_visit_summary_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TCVisitSummarySubMenuisdisplayed()) {
	    	log.info("user can view TC Visit Summary submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view TC Visit Summary submenu of UDTax Report menuu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Property Wise TC Visit submenu of UDTax Report menu")
	public void user_can_view_property_wise_tc_visit_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.PropertyWiseTCVisitSubMenuisdisplayed()) {
	    	log.info("user can view Property Wise TC Visit submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Property Wise TC Visit submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view TL Visit Report submenu of UDTax Report menu")
	public void user_can_view_tl_visit_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.TLVisitReportSubMenuisdisplayed()) {
	    	log.info("user can view TL Visit Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view TL Visit Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view All Updation Report submenu of UDTax Report menu")
	public void user_can_view_all_updation_report_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.AllUpdationReportSubMenuisdisplayed()) {
	    	log.info("user can view All Updation Report submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view All Updation Report submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view DN130 Distribution Reports submenu of UDTax Report menu")
	public void user_can_view_dn130_distribution_reports_submenu_of_ud_tax_report_menu() {
		if(dashboardPg.DN130DistributionReportsSubMenuisdisplayed()) {
	    	log.info("user can view DN130 Distribution Reports submenu of UDTax Report menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view DN130 Distribution Reports submenu of UDTax Report menu");
	    	Assert.assertTrue(false);
	    }
	}
	
	/////////////////////////////Counter Report Functionality////////////////////////////////////
	@When("user clicks on counter report submenu")
	public void user_clicks_on_counter_report_submenu() throws InterruptedException {
	    dashboardPg.clickOnCounterReportSubMenu();
	    log.info("user clicks on counter report submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see counter report page")
	public void user_can_see_counter_report_page() {
	    if(counterreportPg.counterReportPlainTextDisplayed()) {
	       log.info("user can see counter report page");
	       Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see counter report page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	    counterreportPg.clickOnSearchBtn();
	    log.info("user clicks on search button");
	}

	@Then("user can see report")
	public void user_can_see_report() {
		if(counterreportPg.reportPlainTextDisplayed()) {
		       log.info("user can see report");
		       Assert.assertTrue(true);
		    }else {
		    	log.warn("user can not see report");
		    	Assert.assertTrue(false);
		    }
	}
	
	/////////////////////TC Collection Summary Functionality////////////////////
	@When("user clicks on TC collection summary submenu")
	public void user_clicks_on_tc_collection_summary_submenu() throws InterruptedException {
	    dashboardPg.clickOnTCCollectionSummarySubMenu();
	    log.info("user clicks on TC collection summary submenu");
	    Thread.sleep(2000);
	}

	@Then("user can see TC collection summary page")
	public void user_can_see_tc_collection_summary_page() {
	    if(tccollectionsummaryPg.TCCollectionSummaryPlainTextDisplayed()) {
	    	log.info("user can see TC collection summary page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see TC collection summary page");
	    	Assert.assertTrue(false);
	    }
	}

	@When("user clicks on search button of TC collection summary page")
	public void user_clicks_on_search_button_of_tc_collection_summary_page() {
	    tccollectionsummaryPg.clickOnSearchBtn();
	    log.info("user clicks on search button of TC collection summary page");
	}

	@Then("user can see report of TC collection summary page")
	public void user_can_see_report_of_tc_collection_summary_page() {
	    if(tccollectionsummaryPg.reportPlainTextDisplayed()) {
	    	log.info("user can see report of TC collection summary page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not see report of TC collection summary page");
	    	Assert.assertTrue(false);
	    }
	}


	
}
