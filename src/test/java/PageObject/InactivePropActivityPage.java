package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InactivePropActivityPage {
	
WebDriver ldriver;
	
	public InactivePropActivityPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Inactive Prop Activity']")
	WebElement InactivePropActivityPlainText;
	
	public boolean inactivePropActivitytPlainTextDisplayed() {
		return InactivePropActivityPlainText.isDisplayed();
	}
	
	
	

}
