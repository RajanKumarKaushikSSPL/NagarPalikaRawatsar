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
	
	///////////////////////Transaction Deactivate Functionality///////////////////////////////////
	@When("User clicks on Transaction Deactivate submenu")
	public void user_clicks_on_transaction_deactivate_submenu() throws InterruptedException {
	    dashboardPg.clickOnTransactionDeactivateSubMenu();
	    log.info("User clicks on Transaction Deactivate submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Deactivate Transaction page")
	public void user_can_see_deactivate_transaction_page() {
	    if(deactivatetransactionPg.deactivateTransactionPlainTextDisplayed()) {
	    	log.info("User can see Deactivate Transaction page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Deactivate Transaction page");
	    	Assert.assertTrue(false);
	    }
	}
	
	///////////////////Cash Verification Functionality/////////////////////////////
	@When("User clicks on Cash Verification submenu")
	public void user_clicks_on_cash_verification_submenu() throws InterruptedException {
	    dashboardPg.clickOnCashVerificationSubMenu();
	    log.info("User clicks on Cash Verification submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Cash Verification page")
	public void user_can_see_cash_verification_page() {
	    if(cashverificationPg.cashVerificationPlainTextDisplayed()) {
	    	log.info("User can see Cash Verification page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Cash Verification page");
	    	Assert.assertTrue(false);
	    }
	}
	
	////////////////Bank Deposit Date Entry Functionality/////////////////////
	@When("User clicks on Bank Deposit Date Entry submenu")
	public void user_clicks_on_bank_deposit_date_entry_submenu() throws InterruptedException {
	    dashboardPg.clickOnBankDepositDateEntrySubMenu();
	    log.info("User clicks on Bank Deposit Date Entry submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Bank Deposit page")
	public void user_can_see_bank_deposit_page() {
		if(bankdepositPg.bankDepositPlainTextDisplayed()) {
	    	log.info("User can see Bank Deposit page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Bank Deposit page");
	    	Assert.assertTrue(false);
	    }
	}

    //////////////////Bank Reconcilation Functionality///////////////////////////
	@When("User clicks on Bank Reconcilation submenu")
	public void user_clicks_on_bank_reconcilation_submenu() throws InterruptedException {
	    dashboardPg.clickOnBankReconcilationSubMenu();
	    log.info("User clicks on Bank Reconcilation submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Bank Reconcilation page")
	public void user_can_see_bank_reconcilation_page() {
		if(bankreconcilationPg.bankReconcilationPlainTextDisplayed()) {
	    	log.info("User can see Bank Reconcilation page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Bank Reconcilation page");
	    	Assert.assertTrue(false);
	    }
	}
	
	/////////////////Payment Mode Update Functionality///////////////////////////
	@When("User clicks on Payment Mode Update submenu")
	public void user_clicks_on_payment_mode_update_submenu() throws InterruptedException {
	    dashboardPg.clickOnPaymentModeUpdateSubMenu();
	    log.info("User clicks on Payment Mode Update submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Payment Mode Update page")
	public void user_can_see_payment_mode_update_page() {
		if(paymentmodeupdatePg.paymentModeUpdatePlainTextDisplayed()) {
	    	log.info("User can see Payment Mode Update page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Payment Mode Update page");
	    	Assert.assertTrue(false);
	    }
	}

    /////////////////////House Tax Transaction Deactivate Functionality//////////////////////////
	@When("User clicks on House Tax Transaction Deactivate submenu")
	public void user_clicks_on_house_tax_transaction_deactivate_submenu() throws InterruptedException {
	    dashboardPg.clickOnHouseTaxTransactionDeactivateSubMenu();
	    log.info("User clicks on House Tax Transaction Deactivate submenu");
	    Thread.sleep(2000);
	}
	
	/////////////////////////House Tax Payment Mode Update Functionality/////////////////////////////
	@When("User clicks on House Tax Payment Mode Update submenu")
	public void user_clicks_on_house_tax_payment_mode_update_submenu() throws InterruptedException {
	    dashboardPg.clickOnHouseTaxPaymentModeUpdateSubMenu();
	    log.info("User clicks on House Tax Payment Mode Update submenu");
	    Thread.sleep(2000);
	}

	@Then("User can see Htax Payment Mode Update page")
	public void user_can_see_htax_payment_mode_update_page() {
		if(htaxpaymentmodeupdatePg.HtaxPaymentModeUpdatePlainTextDisplayed()) {
	    	log.info("User can see Htax Payment Mode Update page");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User can not see Htax Payment Mode Update page");
	    	Assert.assertTrue(false);
	    }
	}


}
