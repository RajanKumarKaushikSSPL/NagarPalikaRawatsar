package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AllModuleOperatorWiseCollectionPage {

WebDriver ldriver;
	
	public AllModuleOperatorWiseCollectionPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='All Module Operator Wise Collection']")
	WebElement AllModuleOperatorWiseCollectionPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchteam']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="(//strong[contains(text(),'Report')])[1]")
	WebElement ReportPlainText;
	
	public boolean allModuleOperatorWiseCollectionPlainTextDisplayed() {
		return AllModuleOperatorWiseCollectionPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}	
	
}
