package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyNoticeListPage {
	
WebDriver ldriver;
	
	public SurveyNoticeListPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Notice List']")
	WebElement SurveyNoticeListPlainText;
	
	public boolean surveyNoticeListPlainTextDisplayed() {
		return SurveyNoticeListPlainText.isDisplayed();
	}
		

}
