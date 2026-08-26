package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BOHDashBoardPage {
	
WebDriver ldriver;
	
	public BOHDashBoardPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@id='search']")
	WebElement SearchBtn;
	
	@FindBy(how=How.XPATH,using="//strong[contains(text(),'Daily Work Report')]")
	WebElement DailyWorkReportPlainText;
	
	
   public void clickOnSearchButton() {
		SearchBtn.click();
	}
	
	public String getReportPlainText() {
		return DailyWorkReportPlainText.getText();
	}

}
