package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TCVisitReportPage {
	
WebDriver ldriver;
	
	public TCVisitReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Tc Visit Report']")
	WebElement TCVisitReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Records')]")
	WebElement RecordsPlainText;
	
	public boolean tcVisitReportPlainTextDisplayed() {
		return TCVisitReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean recordsPlainTextDisplayed() {
		return RecordsPlainText.isDisplayed();
	}				
		

}
