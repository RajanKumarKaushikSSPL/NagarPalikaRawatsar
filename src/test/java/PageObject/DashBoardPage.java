package PageObject;

import org.openqa.selenium.JavascriptExecutor;
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
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='UD Tax Report'])[2]")
	WebElement UDTaxReportMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Counter Report'])[2]")
	WebElement CounterReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TC Collection Summary'])[2]")
	WebElement TCCollectionSummarySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='DCB Report'])[2]")
	WebElement DCBReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='SAF Report'])[2]")
	WebElement SAFReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Zone and Ward Wise Collection Report'])[2]")
	WebElement ZoneAndWardWiseCollectionReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Payment Mode Wise Collection'])[2]")
	WebElement PaymentModeWiseCollectionSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='ULB Report'])[2]")
	WebElement ULBReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Transaction Deactivate Report'])[2]")
	WebElement TransactionDeactivateReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='ALL Module TC Summary'])[2]")
	WebElement ALLModuleTCSummarySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Cheque Bounce Report'])[2]")
	WebElement ChequeBounceReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Print All Payment Reciept'])[2]")
	WebElement PrintAllPaymentRecieptSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Taxable Property Report'])[2]")
	WebElement TaxablePropertyReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='PropertyWise DCB'])[2]")
	WebElement PropertyWiseDCBSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Htax DCB Report'])[2]")
	WebElement HtaxDCBReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Print All Demand Reciept'])[2]")
	WebElement PrintAllDemandRecieptSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Variation Report'])[2]")
	WebElement VariationReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Reassesment Diff'])[2]")
	WebElement ReassesmentDiffSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Cheque Bounced Collection Report'])[2]")
	WebElement ChequeBouncedCollectionReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Re-verification Difference Report'])[2]")
	WebElement ReVerificationDifferenceReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Tax Collection Report'])[2]")
	WebElement TaxCollectionReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Appti List'])[2]")
	WebElement ApptiListSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Apptti Pending Report'])[2]")
	WebElement AppttiPendingReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Appti Reject List'])[2]")
	WebElement ApptiRejectListSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TC Visit Report'])[2]")
	WebElement TCVisitReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TC Visit Summary'])[2]")
	WebElement TCVisitSummarySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Property Wise TC Visit'])[2]")
	WebElement PropertyWiseTCVisitSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TL Visit Report'])[2]")
	WebElement TLVisitReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='All Updation Report'])[2]")
	WebElement AllUpdationReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='DN 130 Distribution Reports'])[2]")
	WebElement DN130DistributionReportsSubMenu;
	
	public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
	
	
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
	
	public void clickOnUDTaxReportMenu() {
		UDTaxReportMenu.click();
	}
	
	public boolean CounterReportSubMenuisdisplayed() {
		return CounterReportSubMenu.isDisplayed();
	}
	
	public boolean TCCollectionSummarySubMenuisdisplayed() {
		return TCCollectionSummarySubMenu.isDisplayed();
	}
	
	public boolean DCBReportSubMenuisdisplayed() {
		return DCBReportSubMenu.isDisplayed();
	}
	
	public boolean SAFReportSubMenuisdisplayed() {
		return SAFReportSubMenu.isDisplayed();
	}
	
	public boolean ZoneAndWardWiseCollectionReportSubMenuisdisplayed() {
		return ZoneAndWardWiseCollectionReportSubMenu.isDisplayed();
	}
	
	public boolean PaymentModeWiseCollectionSubMenuisdisplayed() {
		return PaymentModeWiseCollectionSubMenu.isDisplayed();
	}
	
	public boolean ULBReportSubMenuisdisplayed() {
		return ULBReportSubMenu.isDisplayed();
	}
	
	public boolean TransactionDeactivateReportSubMenuisdisplayed() {
		return TransactionDeactivateReportSubMenu.isDisplayed();
	}
	
	public boolean ALLModuleTCSummarySubMenuisdisplayed() {
		scrollToElement(ldriver, ALLModuleTCSummarySubMenu);
		return ALLModuleTCSummarySubMenu.isDisplayed();
	}
	
	public boolean ChequeBounceReportSubMenuisdisplayed() {
		scrollToElement(ldriver, ChequeBounceReportSubMenu);
		return ChequeBounceReportSubMenu.isDisplayed();
	}
	
	public boolean PrintAllPaymentReceiptSubMenuisdisplayed() {
		scrollToElement(ldriver, PrintAllPaymentRecieptSubMenu);
		return PrintAllPaymentRecieptSubMenu.isDisplayed();
	}
	
	public boolean TaxablePropertyReportSubMenuisdisplayed() {
		scrollToElement(ldriver, TaxablePropertyReportSubMenu);
		return TaxablePropertyReportSubMenu.isDisplayed();
	}
	
	public boolean PropertyWiseDCBSubMenuisdisplayed() {
		scrollToElement(ldriver, PropertyWiseDCBSubMenu);
		return PropertyWiseDCBSubMenu.isDisplayed();
	}
	
	public boolean HtaxDCBReportSubMenuisdisplayed() {
		scrollToElement(ldriver, HtaxDCBReportSubMenu);
		return HtaxDCBReportSubMenu.isDisplayed();
	}
	
	public boolean PrintAllDemandRecieptSubMenuisdisplayed() {
		scrollToElement(ldriver, PrintAllDemandRecieptSubMenu);
		return PrintAllDemandRecieptSubMenu.isDisplayed();
	}
	
	public boolean VariationReportSubMenuisdisplayed() {
		scrollToElement(ldriver, VariationReportSubMenu);
		return VariationReportSubMenu.isDisplayed();
	}
	
	public boolean ReassesmentDiffSubMenuisdisplayed() {
		scrollToElement(ldriver, ReassesmentDiffSubMenu);
		return ReassesmentDiffSubMenu.isDisplayed();
	}
	
	public boolean ChequeBouncedCollectionReportSubMenuisdisplayed() {
		scrollToElement(ldriver, ChequeBouncedCollectionReportSubMenu);
		return ChequeBouncedCollectionReportSubMenu.isDisplayed();
	}
	
	public boolean ReverificationDifferenceReportSubMenuisdisplayed() {
		scrollToElement(ldriver, ReVerificationDifferenceReportSubMenu);
		return ReVerificationDifferenceReportSubMenu.isDisplayed();
	}
	
	public boolean TaxCollectionReportSubMenuisdisplayed() {
		scrollToElement(ldriver, TaxCollectionReportSubMenu);
		return TaxCollectionReportSubMenu.isDisplayed();
	}
	
	public boolean ApptiListSubMenuisdisplayed() {
		scrollToElement(ldriver, ApptiListSubMenu);
		return ApptiListSubMenu.isDisplayed();
	}
	
	public boolean AppttiPendingReportSubMenuisdisplayed() {
		scrollToElement(ldriver, AppttiPendingReportSubMenu);
		return AppttiPendingReportSubMenu.isDisplayed();
	}
	
	public boolean ApptiRejectListSubMenuisdisplayed() {
		scrollToElement(ldriver, ApptiRejectListSubMenu);
		return ApptiRejectListSubMenu.isDisplayed();
	}
	
	public boolean TCVisitReportSubMenuisdisplayed() {
		scrollToElement(ldriver, TCVisitReportSubMenu);
		return TCVisitReportSubMenu.isDisplayed();
	}
	
	public boolean TCVisitSummarySubMenuisdisplayed() {
		scrollToElement(ldriver, TCVisitSummarySubMenu);
		return TCVisitSummarySubMenu.isDisplayed();
	}
	
	public boolean PropertyWiseTCVisitSubMenuisdisplayed() {
		scrollToElement(ldriver, PropertyWiseTCVisitSubMenu);
		return PropertyWiseTCVisitSubMenu.isDisplayed();
	}
	
	public boolean TLVisitReportSubMenuisdisplayed() {
		scrollToElement(ldriver, TLVisitReportSubMenu);
		return TLVisitReportSubMenu.isDisplayed();
	}
	
	public boolean AllUpdationReportSubMenuisdisplayed() {
		scrollToElement(ldriver, AllUpdationReportSubMenu);
		return AllUpdationReportSubMenu.isDisplayed();
	}
	
	public boolean DN130DistributionReportsSubMenuisdisplayed() {
		scrollToElement(ldriver, DN130DistributionReportsSubMenu);
		return DN130DistributionReportsSubMenu.isDisplayed();
	}
	
	
	
	
	
	
	 
	
	
	
	

}
