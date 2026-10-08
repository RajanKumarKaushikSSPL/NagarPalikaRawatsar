package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApptiRejectListPage {
	
WebDriver ldriver;
	
	public ApptiRejectListPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Appti Reject List']")
	WebElement ApptiRejectListPlainText;
	
	public boolean apptiRejectListPlainTextDisplayed() {
		return ApptiRejectListPlainText.isDisplayed();
	}	

}
