package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SafReportPage {
	
WebDriver ldriver;
	
	public SafReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Saf Report']")
	WebElement SafReportPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[normalize-space()='Property Tax']")
	WebElement PropertyTaxPlainText;
	
	public boolean SafReportPlainTextDisplayed() {
		return SafReportPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean propertyTaxPlainTextDisplayed() {
		return PropertyTaxPlainText.isDisplayed();
	}

}
