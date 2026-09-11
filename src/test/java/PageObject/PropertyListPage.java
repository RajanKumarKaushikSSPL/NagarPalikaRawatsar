package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PropertyListPage {
	
WebDriver ldriver;
	
	public PropertyListPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Property List']")
	WebElement PropertyListPlainText;
	
	public String getPropertyListPageText() {
		return PropertyListPlainText.getText();
	}

}
