package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BankReconcilationPage {
	
WebDriver ldriver;
	
	public BankReconcilationPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Bank Reconcilation']")
	WebElement BankReconcilationPlainText;
	
	public boolean bankReconcilationPlainTextDisplayed() {
		return BankReconcilationPlainText.isDisplayed();
	}		

}
