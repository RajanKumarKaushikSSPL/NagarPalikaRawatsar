package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyNoticeReceivedListPage {
	
WebDriver ldriver;
	
	public SurveyNoticeReceivedListPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Notice Recived List']")
	WebElement SurveyNoticeReceivedListPlainText;
	
	public boolean surveyNoticeReceivedListPlainTextDisplayed() {
		return SurveyNoticeReceivedListPlainText.isDisplayed();
	}
	
		

}
