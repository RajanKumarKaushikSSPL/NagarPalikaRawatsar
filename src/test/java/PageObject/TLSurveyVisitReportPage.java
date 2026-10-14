package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TLSurveyVisitReportPage {
	
WebDriver ldriver;
	
	public TLSurveyVisitReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Tl Survey Visit Report']")
	WebElement TLSurveyVisitReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Records')]")
	WebElement RecordPlainText;
	
	public boolean tlSurveyVisitReportPlainTextDisplayed() {
		return TLSurveyVisitReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean recordPlainTextDisplayed() {
		return RecordPlainText.isDisplayed();
	}			
		

}
