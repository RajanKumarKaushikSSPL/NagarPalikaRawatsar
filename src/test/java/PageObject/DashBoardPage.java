package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
WebDriver ldriver;
	
	public DashBoardPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Dashboard']")
	WebElement DashBoardPlainText;
	
	@FindBy(how=How.XPATH,using="(//div[@id='dropdownMenuLink'])[2]")
	WebElement SuperAdminProfile;
	
	@FindBy(how=How.XPATH,using="//span[@class='sign_out_btn']")
	WebElement SignOutBtn;
	
	@FindBy(how=How.XPATH,using="(//a[contains(text(),'Dashboard')])[4]")
	WebElement DashBoardMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space()='Work Report Dashboard'])[2]")
	WebElement WorkReportDashBoardSubMenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='resize01']//a[normalize-space()='BOH Dashboard']")
	WebElement BOHDashBoardSubMenu;
	
	
	
	public String getDashBoardText() {
		return DashBoardPlainText.getText();
	}
	
	public void clickOnSuperAdminProfile() {
		SuperAdminProfile.click();
	}
	
	public void clickOnSignOutButton() {
		SignOutBtn.click();
		
	}
	
	public void clickOnDashBoardMenu() {
		DashBoardMenu.click();
	}
	
	public void clickOnWorkReportDashBoardSubMenu() {
		WorkReportDashBoardSubMenu.click();
	}
	
	public void clickOnBOHDashBoardSubMenu() {
		BOHDashBoardSubMenu.click();
	}
	

}
