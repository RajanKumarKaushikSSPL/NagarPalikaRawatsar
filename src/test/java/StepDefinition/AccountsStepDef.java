package StepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;

public class AccountsStepDef extends BaseClass {

	@When("User clicks on Accounts menu")
	public void user_clicks_on_accounts_menu() {
	    dashboardPg.clickOnAccountsMenu();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view transaction deactivate submenu of Accounts menu")
	public void user_can_view_transaction_deactivate_submenu_of_accounts_menu() {
	    if(dashboardPg.TransactionDeactivateSubMenuisdisplayed()) {
	    	log.info("user can view transaction deactivate submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view transaction deactivate submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view cash verification submenu of Accounts menu")
	public void user_can_view_cash_verification_submenu_of_accounts_menu() {
		if(dashboardPg.CashVerificationSubMenuisdisplayed()) {
	    	log.info("user can view cash verification submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view cash verification submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view bank deposit date entry submenu of Accounts menu")
	public void user_can_view_bank_deposit_date_entry_submenu_of_accounts_menu() {
		if(dashboardPg.BankDepositDateEntrySubMenuisdisplayed()) {
	    	log.info("user can view bank deposit date entry submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view bank deposit date entry submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view bank reconciliation submenu of Accounts menu")
	public void user_can_view_bank_reconciliation_submenu_of_accounts_menu() {
		if(dashboardPg.BankReconciliationSubMenuisdisplayed()) {
	    	log.info("user can view bank reconciliation submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view bank reconciliation submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view Payment Mode Update submenu of Accounts menu")
	public void user_can_view_payment_mode_update_submenu_of_accounts_menu() {
		if(dashboardPg.PaymentModeUpdateSubMenuisdisplayed()) {
	    	log.info("user can view Payment Mode Update submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view Payment Mode Update submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view House Tax Transaction Deactivate submenu of Accounts menu")
	public void user_can_view_house_tax_transaction_deactivate_submenu_of_accounts_menu() {
		if(dashboardPg.HouseTaxTransactionDeactivateSubMenuisdisplayed()) {
	    	log.info("user can view House Tax Transaction Deactivate submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view House Tax Transaction Deactivate submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

	@Then("user can view House Tax Payment Mode Update submenu of Accounts menu")
	public void user_can_view_house_tax_payment_mode_update_submenu_of_accounts_menu() {
		if(dashboardPg.HouseTaxPaymentModeUpdateSubMenuisdisplayed()) {
	    	log.info("user can view House Tax Payment Mode Update submenu of Accounts menu");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("user can not view House Tax Payment Mode Update submenu of Accounts menu");
	    	Assert.assertTrue(false);
	    }
	}

}
