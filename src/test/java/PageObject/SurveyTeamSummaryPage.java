package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SurveyTeamSummaryPage {
	
WebDriver ldriver;
	
	public SurveyTeamSummaryPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Survey Team Summary']")
	WebElement SurveyTeamSummaryPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchteam']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Report')]")
	WebElement ReportPlainText;
	
	public boolean surveyTeamSummaryPlainTextDisplayed() {
		return SurveyTeamSummaryPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}				

}
