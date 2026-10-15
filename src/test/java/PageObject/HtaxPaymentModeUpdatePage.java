package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HtaxPaymentModeUpdatePage {
	
WebDriver ldriver;
	
	public HtaxPaymentModeUpdatePage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Htax Payment Mode Update']")
	WebElement HtaxPaymentModeUpdatePlainText;
	
	public boolean HtaxPaymentModeUpdatePlainTextDisplayed() {
		return HtaxPaymentModeUpdatePlainText.isDisplayed();
	}		

}
