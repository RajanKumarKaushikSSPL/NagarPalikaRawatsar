package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrintAllDemandRecieptPage {
	
WebDriver ldriver;
	
	public PrintAllDemandRecieptPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Print All Demand Reciept']")
	WebElement PrintAllDemandReceiptPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Print']")
	WebElement PrintBtn;
	
	public boolean printAllDemandReceiptPlainTextDisplayed() {
		return PrintAllDemandReceiptPlainText.isDisplayed();
	}
	
	public boolean searchBtnDisplayed() {
		return SearchBtn.isDisplayed();
	}
	
	public boolean printBtnDisplayed() {
		return PrintBtn.isDisplayed();
	}			
		

}
