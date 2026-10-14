package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchSurveyPage {
	
WebDriver ldriver;
	
	public SearchSurveyPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Search Survey']")
	WebElement SearchSurveyPlainText;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward_no']")
	WebElement WardNoDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='Search']")
	WebElement SearchBtn;
	
	public boolean searchSurveyPlainTextDisplayed() {
		return SearchSurveyPlainText.isDisplayed();
	}
	
	public void selectWardNoDropDown(String option) {
		Select s=new Select(WardNoDropDown);
		s.selectByVisibleText(option);
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();;
	}

}
