package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CashVerificationPage {
	
WebDriver ldriver;
	
	public CashVerificationPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Cash Verification']")
	WebElement CashVerificationPlainText;
	
	public boolean cashVerificationPlainTextDisplayed() {
		return CashVerificationPlainText.isDisplayed();
	}	
	

}
