package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyNoticeReceivedReportPage {
	
WebDriver ldriver;
	
	public SurveyNoticeReceivedReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Notice Recived Report']")
	WebElement SurveyNoticeReceivedReportPlainText;
	
	public boolean surveyNoticeReceivedReportPlainTextDisplayed() {
		return SurveyNoticeReceivedReportPlainText.isDisplayed();
	}
		

}
