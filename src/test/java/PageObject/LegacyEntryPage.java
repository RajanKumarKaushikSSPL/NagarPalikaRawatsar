package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LegacyEntryPage {
	
WebDriver ldriver;
	
	public LegacyEntryPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left font-weight-bold']")
	WebElement LegacyEntryPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='old_service_no']")
	WebElement ServiceNoTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='ward']")
	WebElement WardNoDropDown;
	
	@FindBy(how=How.XPATH,using="//span[@id='select2-ward_area-container']")
	WebElement AreaNameComboBox;
	
	@FindBy(how=How.XPATH,using="//input[@role='textbox']")
	WebElement AreaNameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='road_type']")
	WebElement RoadTypeDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='plot_area']")
	WebElement PlotAreaTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='plinth_area']")
	WebElement PlinthAreaTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='vacant_area']")
	WebElement VacantAreaTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_house_no']")
	WebElement PermHouseNoTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_city']")
	WebElement PermCityTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_mohalla']")
	WebElement PermMohallaTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_landmark']")
	WebElement PermLandmarkTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_pincode']")
	WebElement PermPinCodeTextBox;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-lg-4']//input[@id='perm_contact_no']")
	WebElement PermContactNoTextBox;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='perm_address']")
	WebElement PermAddressTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='check_same_addr']")
	WebElement CurrentAddressCheckBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='owner_name']")
	WebElement OwnerNameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_gender']")
	WebElement GenderDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='age']")
	WebElement AgeTextBox;
	
	@FindBy(how=How.XPATH,using="//div[@class='col-lg-3']//input[@id='perm_contact_no']")
	WebElement MobileNoTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_relation']")
	WebElement RelationDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='guardian_name']")
	WebElement GuardianNameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_occupation']")
	WebElement OccupationDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='fy1']")
	WebElement FinancialYearDropDown1;
	
	@FindBy(how=How.XPATH,using="//input[@id='tax1']")
	WebElement YearlyTaxTextBox1;
	
	@FindBy(how=How.XPATH,using="//span[@class='btn btn-info']")
	WebElement AddBtn1;
	
	@FindBy(how=How.XPATH,using="//select[@id='fy2']")
	WebElement FinancialYearDropDown2;
	
	@FindBy(how=How.XPATH,using="//input[@id='tax2']")
	WebElement YearlyTaxTextBox2;
	
	@FindBy(how=How.XPATH,using="//input[@id='file_name']")
	WebElement ChooseFileBtn;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='remarks']")
	WebElement RemarksTextBox;
	
	@FindBy(how=How.XPATH,using="//button[@id='save']")
	WebElement SaveBtn;
	
	@FindBy(how=How.XPATH,using="//div[@role='alert']")
	WebElement ConfirmationMessageOfLegacyEntry;
	
	
	public String getLegacyEntryPageText() {
		return LegacyEntryPlainText.getText();
	}
	
	public void enterServiceNo(String serviceno) {
		ServiceNoTextBox.sendKeys(serviceno);
	}
	
	public void selectWardNoDropDown(String option) {
		Select s=new Select(WardNoDropDown);
		s.selectByVisibleText(option);
	}
	
	public void clickOnAreaNameComboBox() {
	    AreaNameComboBox.click();
	}
	
	public void enterAreaName(String areaname) {
		AreaNameTextBox.sendKeys(areaname);
		AreaNameTextBox.sendKeys(Keys.ENTER);
	}
	
	public void selectRoadTypeDropDown(String option) {
		Select s=new Select(RoadTypeDropDown);
		s.selectByVisibleText(option);
	}
	
	public void enterPlotArea(String plotarea) {
		PlotAreaTextBox.sendKeys(plotarea);
	}
	
	public void enterPlinthArea(String plintharea) {
		PlinthAreaTextBox.sendKeys(plintharea);
	}
	
	public void enterVacantArea(String vacantarea) {
		VacantAreaTextBox.sendKeys(vacantarea);
	}
	
	public void enterPermHouseNo(String permhouseno) {
		PermHouseNoTextBox.sendKeys(permhouseno);
	}
	
	public void enterPermCity(String permcity) {
		PermCityTextBox.sendKeys(permcity);
	}
	
	public void enterPermMohalla(String permmohalla) {
		PermMohallaTextBox.sendKeys(permmohalla);
	}
	
	public void enterPermLandmark(String permlandmark) {
		PermLandmarkTextBox.sendKeys(permlandmark);
	}
	
	public void enterPermPinCode(String permpincode) {
		PermPinCodeTextBox.sendKeys(permpincode);
	}
	
	public void enterPermContactNo(String permcontactno) {
		PermContactNoTextBox.sendKeys(permcontactno);
	}
	
	public void enterPermAddress(String permaddress) {
		PermAddressTextBox.sendKeys(permaddress);
	}
	
	public void checkCurrentAddressCheckBox() {
		CurrentAddressCheckBox.click();
	}
	
	public void enterOwnerName(String ownername) {
		OwnerNameTextBox.sendKeys(ownername);
	}
	
	public void selectGenderDropDown(String option) {
		Select s=new Select(GenderDropDown);
		s.selectByVisibleText(option);	
	}
	
	public void enterAge(String age) {
		AgeTextBox.sendKeys(age);
	}
	
	public void enterMobileNo(String mobileno) {
		MobileNoTextBox.sendKeys(mobileno);
	}
	
	public void selectRelationDropDown(String option) {
		Select s=new Select(RelationDropDown);
		s.selectByVisibleText(option);
	}
	
	public void enterGuardianName(String guardianname) {
		GuardianNameTextBox.sendKeys(guardianname);
	}
	
	public void selectOccupationDropDown(String option) {
		Select s=new Select(OccupationDropDown);
		s.selectByVisibleText(option);
	}
	
	public void selectFinancialYearDropDown1(String option) {
		Select s=new Select(FinancialYearDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void enterYearlyTax1(String yearlytax1) {
		YearlyTaxTextBox1.sendKeys(yearlytax1);
	}
	
	public void clickOnAddBtn1() {
		AddBtn1.click();
	}
	
	public void selectFinancialYearDropDown2(String option) {
		Select s=new Select(FinancialYearDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void enterYearlyTax2(String yearlytax2) {
		YearlyTaxTextBox2.sendKeys(yearlytax2);
	}
	
	public void uploadFile(String filepath) {
		ChooseFileBtn.sendKeys(filepath);
	}
	
	public void enterRemarks(String remarks) {
		RemarksTextBox.sendKeys(remarks);
	}
	
	public void clickOnSaveBtn() {
		SaveBtn.click();
	}
	
	public String getConfirmationMessageOfLegacyEntry() {
		return ConfirmationMessageOfLegacyEntry.getText();
	}
	
	

}
