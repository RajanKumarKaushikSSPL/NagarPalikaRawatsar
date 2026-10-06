package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VarReportPage {
	
WebDriver ldriver;
	
	public VarReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Var Report']")
	WebElement VarReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Report')]")
	WebElement ReportPlainText;
	
	public boolean varReportPlainTextDisplayed() {
		return VarReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}			
			

}
