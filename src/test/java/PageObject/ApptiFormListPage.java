package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ApptiFormListPage {
	
WebDriver ldriver;
	
	public ApptiFormListPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Appti Form List']")
	WebElement ApptiFormListPlainText;
	
	public boolean apptiFormListPlainTextDisplayed() {
		return ApptiFormListPlainText.isDisplayed();
	}	

}
