package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HouseTaxPaymentReceiptPage {
	
WebDriver ldriver;
	
	public HouseTaxPaymentReceiptPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left font-weight-bold']")
	WebElement HouseTaxPaymentReceiptPlainText;
	
	public String getHouseTaxPaymentReceiptPageText() {
		return HouseTaxPaymentReceiptPlainText.getText();
	}

}
