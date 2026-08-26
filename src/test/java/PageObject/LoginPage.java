package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.ID,using="username")
	WebElement userName;
	
	@FindBy(how=How.ID,using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='login']")
	WebElement LoginBtn;
	
	public void enterUserName(String username) {
		userName.clear();
		userName.sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		LoginBtn.click();
		
	}
	
	

}
