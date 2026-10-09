package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyReportPage {
	
WebDriver ldriver;
	
	public SurveyReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Report']")
	WebElement SurveyReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Records')]")
	WebElement RecordPlainText;
	
	public boolean surveyReportPlainTextDisplayed() {
		return SurveyReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean recordPlainTextDisplayed() {
		return RecordPlainText.isDisplayed();
	}				
		

}
