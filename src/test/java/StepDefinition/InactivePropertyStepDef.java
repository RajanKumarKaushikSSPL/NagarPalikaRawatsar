package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class InactivePropertyStepDef extends BaseClass {
	
	@When("User clicks on Inactive Property menu")
	public void user_clicks_on_inactive_property_menu() {
	    dashboardPg.clickOnInactivePropertyMenu();
	    log.info("User clicks on Inactive Property menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view Inactive Property submenu of Inactive Property menu")
	public void user_can_view_inactive_property_submenu_of_inactive_property_menu() {
	    if(dashboardPg.InactivePropertySubMenuisdisplayed()) {
	    	log.info("user can view Inactive Property submenu of Inactive Property menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Inactive Property submenu of Inactive Property menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Inactive DCB submenu of Inactive Property menu")
	public void user_can_view_inactive_dcb_submenu_of_inactive_property_menu() {
		if(dashboardPg.InactiveDCBSubMenuisdisplayed()) {
	    	log.info("user can view Inactive DCB submenu of Inactive Property menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Inactive DCB submenu of Inactive Property menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Inactive Property Activity submenu of Inactive Property menu")
	public void user_can_view_inactive_property_activity_submenu_of_inactive_property_menu() {
		if(dashboardPg.InactivePropertyActivitySubMenuisdisplayed()) {
	    	log.info("user can view Inactive Property Activity submenu of Inactive Property menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Inactive Property Activity submenu of Inactive Property menu");
	    	Assert.assertTrue(false);
	    }
	}

}
