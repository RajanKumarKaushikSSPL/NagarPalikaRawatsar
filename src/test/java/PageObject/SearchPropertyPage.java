package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPropertyPage {
	
WebDriver ldriver;
	
	public SearchPropertyPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Search Property']")
	WebElement SearchPropertyPlainText;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward_no']")
	WebElement WardNoDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='Search']")
	WebElement SearchBtn;
	
	public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
	
	public String getSearchPropertyPageText() {
		return SearchPropertyPlainText.getText();
	}
	
	public void selectWardNoDropDown(String option) {
		Select s=new Select(WardNoDropDown);
		s.selectByVisibleText(option);
	}
	
	public void clickOnSearchBtn() {
		scrollToElement(ldriver, SearchBtn);
		SearchBtn.click();
	}
	
	

}
