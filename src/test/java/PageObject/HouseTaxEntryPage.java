package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HouseTaxEntryPage {
	
WebDriver ldriver;
	
	public HouseTaxEntryPage(WebDriver rDriver) {
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left font-weight-bold']")
	WebElement HouseTaxEntryPlainText;
	
	@FindBy(how=How.XPATH,using="//input[@id='service_no']")
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
	WebElement VaccantAreaTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_house_no']")
	WebElement PermHouseNoTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_city']")
	WebElement PermColonyTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_mohalla']")
	WebElement PermStreetTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_landmark']")
	WebElement PermLandmarkTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_pincode']")
	WebElement PermPincodeTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_contact_no']")
	WebElement PermContactNoTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='perm_address']")
	WebElement PermCityTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='check_same_addr']")
	WebElement CurrentAddressCheckBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='owner_name']")
	WebElement OwnerNameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_gender']")
	WebElement GenderDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='age']")
	WebElement AgeTextBox;
	
	@FindBy(how=How.XPATH,using="//input[@id='mobile_no']")
	WebElement MobileNoTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_relation']")
	WebElement RelationDropDown;
	
	@FindBy(how=How.XPATH,using="//input[@id='guardian_name']")
	WebElement GuardianNameTextBox;
	
	@FindBy(how=How.XPATH,using="//select[@id='occupation']")
	WebElement OccupationDropDown;
	
	@FindBy(how=How.XPATH,using="//select[@id='floor_name1']")
	WebElement FloorNameDropDown1;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_type1']")
	WebElement UsageTypeDropDown1;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_sub_cat1']")
	WebElement UsageCategoryDropDown1;
	
	@FindBy(how=How.XPATH,using="//select[@id='from_year1']")
	WebElement FromYearDropDown1;
	
	@FindBy(how=How.XPATH,using="//select[@id='upto_year1']")
	WebElement UpToYearDropDown1;
	
	@FindBy(how=How.XPATH,using="//input[@id='builtup_area1']")
	WebElement BuiltUpAreaTextBox1;
	
	@FindBy(how=How.XPATH,using="(//span[text()='Add'])[1]")
	WebElement AddFloorBtn1;
	
	@FindBy(how=How.XPATH,using="//select[@id='floor_name2']")
	WebElement FloorNameDropDown2;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_type2']")
	WebElement UsageTypeDropDown2;
	
	@FindBy(how=How.XPATH,using="//select[@id='usage_sub_cat2']")
	WebElement UsageCategoryDropDown2;
	
	@FindBy(how=How.XPATH,using="//select[@id='from_year2']")
	WebElement FromYearDropDown2;
	
	@FindBy(how=How.XPATH,using="//select[@id='upto_year2']")
	WebElement UpToYearDropDown2;
	
	@FindBy(how=How.XPATH,using="//input[@id='builtup_area2']")
	WebElement BuiltUpAreaTextBox2;
	
	@FindBy(how=How.XPATH,using="//select[@id='demand_year1']")
	WebElement DemandYearDropDown1;
	
	@FindBy(how=How.XPATH,using="//input[@id='dmd_amount1']")
	WebElement AmountTextBox1;
	
	@FindBy(how=How.XPATH,using="(//span[text()='Add'])[3]")
	WebElement AddDemandBtn1;
	
	@FindBy(how=How.XPATH,using="//select[@id='demand_year2']")
	WebElement DemandYearDropDown2;
	
	@FindBy(how=How.XPATH,using="//input[@id='dmd_amount2']")
	WebElement AmountTextBox2;
	
	@FindBy(how=How.XPATH,using="//button[@id='View']")
	WebElement ViewBtn;
	
	public String getHouseTaxEntryPageText() {
		return HouseTaxEntryPlainText.getText();
	}
	
	public void enterServiceNo(String serviceno) {
		ServiceNoTextBox.sendKeys(serviceno);
		//ServiceNoTextBox.sendKeys(Keys.ENTER);
	}
	
	public void clickOnWardNoDropDown() {
		WardNoDropDown.click();
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
	
	public void enterPermHouseNo(String permhouseno) {
		PermHouseNoTextBox.sendKeys(permhouseno);
	}
	
	public void enterPermColony(String permcolony) {
		PermColonyTextBox.sendKeys(permcolony);
	}
	
	public void enterPermStreet(String permstreet) {
		PermStreetTextBox.sendKeys(permstreet);
	}
	
	public void enterPermLandmark(String permlandmark) {
		PermLandmarkTextBox.sendKeys(permlandmark);
	}
	
	public void enterPermPinCode(String permpincode) {
		PermPincodeTextBox.sendKeys(permpincode);
	}
	
	public void enterPermContactNo(String permcontactno) {
		PermContactNoTextBox.sendKeys(permcontactno);
	}
	
	public void enterPermCity(String permcity) {
		PermCityTextBox.sendKeys(permcity);
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
		Select s =new Select(RelationDropDown);
		s.selectByVisibleText(option);
	}
	
	public void enterGuardianName(String guardianname) {
		GuardianNameTextBox.sendKeys(guardianname);
	}
	
	public void selectOccupationDropDown(String option) {
		Select s=new Select(OccupationDropDown);
		s.selectByVisibleText(option);
	}
	
	public void selectFloorNameDropDown1(String option) {
		Select s=new Select(FloorNameDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageTypeDropDown1(String option) {
		Select s=new Select(UsageTypeDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageCategoryDropDown1(String option) {
		Select s=new Select(UsageCategoryDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void selectFromYearDropDown1(String option) {
		Select s=new Select(FromYearDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void selectUpToYearDropDown1(String option) {
		Select s=new Select(UpToYearDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void enterBuiltUpArea1(String builtuparea1) {
	    BuiltUpAreaTextBox1.sendKeys(builtuparea1);
	}
	
	public void clickOnAddFloorButton1() {
		AddFloorBtn1.click();
	}
	
	public void selectFloorNameDropDown2(String option) {
		Select s=new Select(FloorNameDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageTypeDropDown2(String option) {
		Select s=new Select(UsageTypeDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void selectUsageCategoryDropDown2(String option) {
		Select s=new Select(UsageCategoryDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void selectFromYearDropDown2(String option) {
		Select s=new Select(FromYearDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void selectUpToYearDropDown2(String option) {
		Select s=new Select(UpToYearDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void enterBuiltUpArea2(String builtuparea2) {
	    BuiltUpAreaTextBox2.sendKeys(builtuparea2);
	}
	
	public void selectDemandYearDropDown1(String option) {
		Select s=new Select(DemandYearDropDown1);
		s.selectByVisibleText(option);
	}
	
	public void enterAmount1(String amount1) {
		AmountTextBox1.sendKeys(amount1);
	}
	
	public void clickOnAddDemandButton1() {
		AddDemandBtn1.click();
	}
	
	public void selectDemandYearDropDown2(String option) {
		Select s=new Select(DemandYearDropDown2);
		s.selectByVisibleText(option);
	}
	
	public void enterAmount2(String amount2) {
		AmountTextBox2.sendKeys(amount2);
	}
	
	public void clickOnViewButton() {
		ViewBtn.click();
	}
	
	

}
