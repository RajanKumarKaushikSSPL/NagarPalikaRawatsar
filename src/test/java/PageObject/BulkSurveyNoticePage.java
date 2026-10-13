package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BulkSurveyNoticePage {
	
WebDriver ldriver;
	
	public BulkSurveyNoticePage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()=' Bulk Survey Notice']")
	WebElement BulkSurveyNoticePlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Print']")
	WebElement PrintBtn;
	
	public boolean bulkSurveyNoticePlainTextDisplayed() {
		return BulkSurveyNoticePlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean printBtnDisplayed() {
		return PrintBtn.isDisplayed();
	}
			

}
