package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HouseTaxPaymentPage {

WebDriver ldriver;
	
	public HouseTaxPaymentPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='House Tax Payment']")
	WebElement HouseTaxPaymentPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_cheque_no']")
	WebElement RefNoTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_cheque_dt']")
	WebElement RefDateTextBox;
	
	@FindBy(how=How.XPATH,using="//td[@class='tcalToday tcalSelected']")
	WebElement TodayDate;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_bank_name']")
	WebElement BankNameTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_branch_name']")
	WebElement BranchNameTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_chq_img']")
	WebElement ChooseFileBtn;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='id_remarks']")
	WebElement RemarksTextBox;
	
	@FindBy(how=How.XPATH,using="//button[@id='pay']")
	WebElement PayNowBtn;
	
	public String getHouseTaxPaymentPageText() {
		return HouseTaxPaymentPlainText.getText();
	}
	
	public void enterRefNo(String refno) {
		RefNoTextBox.sendKeys(refno);
	}
	
	public void clickOnRefDateTextBox() {
		RefDateTextBox.click();
		
	}
	
	public void selectTodayDate() {
		TodayDate.click();
	}
	
	public void enterBankName(String bankname) {
		BankNameTextBox.sendKeys(bankname);
	}
	
	public void enterBranchName(String branchname) {
		BranchNameTextBox.sendKeys(branchname);
	}
	
	public void selectFile(String filepath) {
		ChooseFileBtn.sendKeys(filepath);
	}
	
	public void enterRemarks(String remarks) {
		RemarksTextBox.sendKeys(remarks);
	}
	
	public void clickOnPayNowButton() {
		PayNowBtn.click();
	}
	
	
}
