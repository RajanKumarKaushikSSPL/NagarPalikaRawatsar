package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchSurveyVisitPage {
	
WebDriver ldriver;
	
	public SearchSurveyVisitPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Search Survey Visit']")
	WebElement SearchSurveyVisitPlainText;
	
	public boolean searchSurveyVisitPlainTextDisplayed() {
		return SearchSurveyVisitPlainText.isDisplayed();
	}
		

}
