package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrintAllPaymentRecieptPage {
	
WebDriver ldriver;
	
	public PrintAllPaymentRecieptPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Print All Payment Reciept']")
	WebElement PrintAllPaymentReceiptPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchcounter']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Print']")
	WebElement PrintBtn;
	
	public boolean printAllPaymentReceiptPlainTextDisplayed() {
		return PrintAllPaymentReceiptPlainText.isDisplayed();
	}
	
	public void clickOnSearchBtn() {
		SearchBtn.click();
	}
	
	public boolean printBtnDisplayed() {
		return PrintBtn.isDisplayed();
	}		
	

}
