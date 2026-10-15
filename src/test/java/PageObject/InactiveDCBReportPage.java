package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InactiveDCBReportPage {
	
WebDriver ldriver;
	
	public InactiveDCBReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Inactive Dcb Report']")
	WebElement InactiveDCBReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='view']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Report')]")
	WebElement ReportPlainText;
	
	public boolean inactiveDCBReportPlainTextDisplayed() {
		return InactiveDCBReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}
	

}
