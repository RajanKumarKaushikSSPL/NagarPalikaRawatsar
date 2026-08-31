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
	
	@FindBy(how=How.XPATH,using="(//a[text()='UD Tax Set Up  '])[2]")
	WebElement UDTaxSetUpMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Road type '])[2]")
	WebElement RoadTypeSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Usage Type '])[2]")
	WebElement UsageTypeSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Usage SubCategory Master '])[2]")
	WebElement UsageSubCategoryMasterSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Sub Category Details '])[2]")
	WebElement SubCategoryDetailsSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Dlc Rate Master '])[2]")
	WebElement DLCRateMasterSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' DLC Search '])[2]")
	WebElement DLCSearchSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()='Assessment  '])[2]")
	WebElement AssessmentMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Re Assessment '])[2]")
	WebElement ReAssessmentSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Re Verification '])[2]")
	WebElement ReVerificationSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Re Verification TL '])[2]")
	WebElement ReVerificationTLSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' House Tax Entry '])[2]")
	WebElement HouseTaxEntrySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Legacy Entry '])[2]")
	WebElement LegacyEntrySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[text()=' Edit New Assessment '])[2]")
	WebElement EditNewAssessmentSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='UD Tax'])[2]")
	WebElement UDTaxMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Search Property'])[2]")
	WebElement SearchPropertySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Document Upload'])[2]")
	WebElement DocumentUploadSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Update Property Details'])[2]")
	WebElement UpdatePropertyDetailsSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Last Payment Update'])[2]")
	WebElement LastPaymentUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Update Owner Details'])[2]")
	WebElement UpdateOwnerDetailsSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Property Deactivate'])[2]")
	WebElement PropertyDeactivateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Ward Update'])[2]")
	WebElement WardUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Adjustment'])[2]")
	WebElement AdjustmentSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='House Tax Last Payment Update'])[2]")
	WebElement HouseTaxLastPaymentUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TL Property Visit'])[2]")
	WebElement TLPropertyVisitSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='DN Notice Distribution'])[2]")
	WebElement DNNoticeDistributionSubMenu;
	
	
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
	
	public boolean workReportDashboardSubmenuisdisplayed() {
		return WorkReportDashBoardSubMenu.isDisplayed();
	}
	
	public boolean bohDashboardSubmenuisdisplayed() {
		return BOHDashBoardSubMenu.isDisplayed();
	}
	
	public void clickOnUDTaxSetUpMenu() {
		UDTaxSetUpMenu.click();
	}
	
	public boolean roadTypeSubMenuisdisplayed() {
		return RoadTypeSubMenu.isDisplayed();
	}
	
	public boolean usageTypeSubMenuisdisplayed() {
		return UsageTypeSubMenu.isDisplayed();
	}
	
	public boolean usageSubCategoryMasterSubMenuisdisplayed() {
		return UsageSubCategoryMasterSubMenu.isDisplayed();
	}
	
	public boolean subCategoryDetailsSubMenuisdisplayed() {
		return SubCategoryDetailsSubMenu.isDisplayed();
	}
	
	public boolean dlcRateMasterSubMenuisdisplayed() {
		return DLCRateMasterSubMenu.isDisplayed();
	}
	
	public boolean dlcSearchSubMenuisdisplayed() {
		return DLCSearchSubMenu.isDisplayed();
	}
	
	public void clickOnAssessmentMenu() {
		AssessmentMenu.click();
	}
	
	public boolean reAssessmentSubMenuisdisplayed() {
		return ReAssessmentSubMenu.isDisplayed();
	}
	
	public boolean reVerificationSubMenuisdisplayed() {
		return ReVerificationSubMenu.isDisplayed();
	}
	
	public boolean reVerificationTLSubMenuisdisplayed() {
		return ReVerificationTLSubMenu.isDisplayed();
	}
	
	public boolean houseTaxEntrySubMenuisdisplayed() {
		return HouseTaxEntrySubMenu.isDisplayed();
	}
	
	public boolean legacyEntrySubMenuisdisplayed() {
		return LegacyEntrySubMenu.isDisplayed();
	}
	
	public boolean editNewAssessmentSubMenuisdisplayed() {
		return EditNewAssessmentSubMenu.isDisplayed();
	}
	
	public void clickOnUDTaxMenu() {
		UDTaxMenu.click();
	}
	
	public boolean searchPropertySubMenuisdisplayed() {
		return SearchPropertySubMenu.isDisplayed();
	}
	
	public boolean documentUploadSubMenuisdisplayed() {
		return DocumentUploadSubMenu.isDisplayed();
	}
	
	public boolean updatePropertyDetailsSubMenuisdisplayed() {
		return UpdatePropertyDetailsSubMenu.isDisplayed();
	}
	
	public boolean lastPaymentUpdateSubMenuisdisplayed() {
		return LastPaymentUpdateSubMenu.isDisplayed();
	}
	
	public boolean updateOwnerDetailsSubMenuisdisplayed() {
		return UpdateOwnerDetailsSubMenu.isDisplayed();
	}
	
	public boolean propertyDeactivateSubMenuisdisplayed() {
		return PropertyDeactivateSubMenu.isDisplayed();
	}
	
	public boolean wardUpdateSubMenuisdisplayed() {
		return WardUpdateSubMenu.isDisplayed();
	}
	
	public boolean adjustmentSubMenuisdisplayed() {
		return AdjustmentSubMenu.isDisplayed();
	}
	
	public boolean HouseTaxLastPaymentUpdateSubMenuisdisplayed() {
		return HouseTaxLastPaymentUpdateSubMenu.isDisplayed();
	}
	
	public boolean TLPropertyVisitSubMenuisdisplayed() {
		return TLPropertyVisitSubMenu.isDisplayed();
	}
	
	public boolean DNNoticeDistributionSubMenuisdisplayed() {
		return DNNoticeDistributionSubMenu.isDisplayed();
	}
	
	
	
	
	 
	
	
	
	

}
