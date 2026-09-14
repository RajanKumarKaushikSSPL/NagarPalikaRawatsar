package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DCBULBWisePage {
	
WebDriver ldriver;
	
	public DCBULBWisePage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='DCB ULB Wise']")
	WebElement DCBULBWisePlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='search']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[normalize-space(text())='Total Demand :']")
	WebElement TotalDemandPlainText;
	
	@FindBy(how=How.XPATH,using="//strong[normalize-space(text())='Total Collection :']")
	WebElement TotalCollectionPlainText;
	
	public boolean DCBULBWisePlainTextDisplayed() {
		return DCBULBWisePlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean totalDemandPlainTextDisplayed() {
		return TotalDemandPlainText.isDisplayed();
	}
	
	public boolean totalCollectionPlainTextDisplayed() {
		return TotalCollectionPlainText.isDisplayed();
	}

}
