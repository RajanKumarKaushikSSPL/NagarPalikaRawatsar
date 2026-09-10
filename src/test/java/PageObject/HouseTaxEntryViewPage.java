package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HouseTaxEntryViewPage {
	
WebDriver ldriver;
	
	public HouseTaxEntryViewPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left font-weight-bold']")
	WebElement HouseTaxEntryViewPlainText;
	
	@FindBy(how=How.XPATH,using="//button[@id='Save']")
	WebElement SaveBtn;
	
	public String getHouseTaxEntryViewPageText() {
		return HouseTaxEntryViewPlainText.getText();
	}
	
	public void clickOnSaveButton() {
		SaveBtn.click();
		
	}


}
