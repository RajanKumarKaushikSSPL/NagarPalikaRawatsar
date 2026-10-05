package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaxablePropertyReportPage {
	
WebDriver ldriver;
	
	public TaxablePropertyReportPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Taxable Property Report']")
	WebElement TaxablePropertyReportPlainText;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_entry_type']")
	WebElement EntryTypeDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Report')]")
	WebElement ReportPlainText;
	
	public boolean taxablePropertyReportPlainTextDisplayed() {
		return TaxablePropertyReportPlainText.isDisplayed();
	}
	
	public void selectEntryTypeDropDown(String option) {
		Select s=new Select(EntryTypeDropDown);
		s.selectByVisibleText(option);
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean reportPlainTextDisplayed() {
		return ReportPlainText.isDisplayed();
	}			

}
