package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TaxCollectionReportPage {
	
WebDriver ldriver;
	
	public TaxCollectionReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Tax Collection Report']")
	WebElement TaxCollectionReportPlainText;
	
	public boolean taxCollectionReportPlainTextDisplayed() {
		return TaxCollectionReportPlainText.isDisplayed();
	}
	
	
}
