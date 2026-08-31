package StepDefinition;

import org.junit.Assert;


import io.cucumber.java.en.*;

public class UDTaxSetUpStepDef extends BaseClass {
	
	
	@When("User clicks on UD Tax set up menu")
	public void user_clicks_on_ud_tax_set_up_menu() {
		dashboardPg.clickOnUDTaxSetUpMenu();
	    log.info("clicked on UD Tax Menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view Road Type submenu")
	public void user_can_view_road_type_submenu() {
	    if(dashboardPg.roadTypeSubMenuisdisplayed()) {
	    	log.info("user can view Road Type submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Road Type submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Usage Type submenu")
	public void user_can_view_usage_type_submenu() {
		if(dashboardPg.usageTypeSubMenuisdisplayed()) {
	        log.info("user can view Usage Type submenu");
	        Assert.assertTrue(true);
		}else {
			log.warn("user can not view Usage Type submenu");
			Assert.assertTrue(false);
		}
	}

	@Then("user can view Usage SubCategory Master submenu")
	public void user_can_view_usage_sub_category_master_submenu() {
	    if(dashboardPg.usageSubCategoryMasterSubMenuisdisplayed()) {
	    	log.info("user can view Usage SubCategory Master submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Usage SubCategory Master submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Sub Category Details submenu")
	public void user_can_view_sub_category_details_submenu() {
	    if(dashboardPg.subCategoryDetailsSubMenuisdisplayed()) {
	    	log.info("user can view Sub Category Details submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Sub Category Details submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view DLC rate master submenu")
	public void user_can_view_dlc_rate_master_submenu() {
	    if(dashboardPg.dlcRateMasterSubMenuisdisplayed()) {
	    	log.info("user can view DLC rate master submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view DLC rate master submenu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view DLC Search submenu")
	public void user_can_view_dlc_search_submenu() {
	    if(dashboardPg.dlcSearchSubMenuisdisplayed()) {
	    	log.info("user can view DLC Search submenu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view DLC Search submenu");
	    	Assert.assertTrue(false);
	    }
	}

}
