package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ExPartySurveyNoticePage {
	
WebDriver ldriver;
	
	public ExPartySurveyNoticePage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Ex Party Survey Notice']")
	WebElement ExPartySurveyNoticePlainText;
	
	public boolean exPartySurveyNoticePlainTextDisplayed() {
		return ExPartySurveyNoticePlainText.isDisplayed();
	}
	
	
}
