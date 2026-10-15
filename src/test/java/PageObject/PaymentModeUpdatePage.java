package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentModeUpdatePage {
	
WebDriver ldriver;
	
	public PaymentModeUpdatePage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Payment Mode Update']")
	WebElement PaymentModeUpdatePlainText;
	
	public boolean paymentModeUpdatePlainTextDisplayed() {
		return PaymentModeUpdatePlainText.isDisplayed();
	}		
	

}
