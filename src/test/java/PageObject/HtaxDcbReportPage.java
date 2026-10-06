package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HtaxDcbReportPage {
	
WebDriver ldriver;
	
	public HtaxDcbReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Htax Dcb Report']")
	WebElement HtaxDcbReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='view']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Report')]")
	WebElement ReportPlainText;
	
	public boolean htaxDcbReportPlainTextDisplayed() {
		return HtaxDcbReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}			
	
		

}
