package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyVisitReportPage {
	
WebDriver ldriver;
	
	public SurveyVisitReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Visit Report']")
	WebElement SurveyVisitReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Records')]")
	WebElement RecordPlainText;
	
	public boolean surveyVisitReportPlainTextDisplayed() {
		return SurveyVisitReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean recordPlainTextDisplayed() {
		return RecordPlainText.isDisplayed();
	}			
	

}
