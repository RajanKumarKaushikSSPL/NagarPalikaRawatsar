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
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Property Survey'])[2]")
	WebElement PropertySurveyMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Report'])[2]")
	WebElement SurveyReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Summary Report'])[2]")
	WebElement SurveySummaryReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Team Summary'])[2]")
	WebElement SurveyTeamSummarySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Assessed List'])[2]")
	WebElement SurveyAssessedListSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Assessed Report'])[2]")
	WebElement SurveyAssessedReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Wardwise Survey Report'])[2]")
	WebElement WardwiseSurveyReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Pending Report'])[2]")
	WebElement SurveyPendingReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Level Summary Report'])[2]")
	WebElement SurveyLevelSummaryReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Userwise Forward Summary'])[2]")
	WebElement UserwiseForwardSummarySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Userwise Survey Edit Report'])[2]")
	WebElement UserwiseSurveyEditReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Modification Report'])[2]")
	WebElement SurveyModificationReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Geotagging Report'])[2]")
	WebElement SurveyGeotaggingReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Ex-Party Survey Notice'])[2]")
	WebElement ExPartySurveyNoticeSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Notice List'])[2]")
	WebElement SurveyNoticeListSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Bulk Survey Notice Print'])[2]")
	WebElement BulkSurveyNoticePrintSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Notice Received List'])[2]")
	WebElement SurveyNoticeReceivedListSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Notice Received Report'])[2]")
	WebElement SurveyNoticeReceivedReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Notice Distributed Report'])[2]")
	WebElement SurveyNoticeDistributedReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Demand Report'])[2]")
	WebElement SurveyDemandReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey GIS Update'])[2]")
	WebElement SurveyGISUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Survey Visit Report'])[2]")
	WebElement SurveyVisitReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TL Survey Visit'])[2]")
	WebElement TLSurveyVisitSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='TL Survey Visit Report'])[2]")
	WebElement TLSurveyVisitReportSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Accounts'])[2]")
	WebElement AccountsMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Transaction Deactivate'])[2]")
	WebElement TransactionDeactivateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Cash verification'])[2]")
	WebElement CashVerificationSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Bank Deposit Date Entry'])[2]")
	WebElement BankDepositDateEntrySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Bank Reconciliation'])[2]")
	WebElement BankReconciliationSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Payment Mode Update'])[2]")
	WebElement PaymentModeUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='House Tax Transaction Deactivate'])[2]")
	WebElement HouseTaxTransactionDeactivateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='House Tax Payment Mode Update'])[2]")
	WebElement HouseTaxPaymentModeUpdateSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Property'])[3]")
	WebElement InactivePropertyMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Property'])[4]")
	WebElement InactivePropertySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive DCB'])[2]")
	WebElement InactiveDCBSubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Property Activity'])[2]")
	WebElement InactivePropertyActivitySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Survey'])[3]")
	WebElement InactiveSurveyMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Survey'])[4]")
	WebElement InactiveSurveySubMenu;
	
	@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Inactive Survey Activity'])[2]")
	WebElement InactiveSurveyActivitySubMenu;
	
	public void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
	
	
	public String getDashBoardText() {
		return DashBoardPlainText.getText();
	}
	
	public boolean isDashboardDisplayed() {
        try {
	        return DashBoardPlainText.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
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
	
	public void clickOnPropertySurveyMenu() {
		PropertySurveyMenu.click();
	}
	
	public boolean SurveyReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyReportSubMenu);
		return SurveyReportSubMenu.isDisplayed();
	}
	
	public boolean SurveySummaryReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveySummaryReportSubMenu);
		return SurveySummaryReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyTeamSummarySubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyTeamSummarySubMenu);
		return SurveyTeamSummarySubMenu.isDisplayed();
	}
	
	public boolean SurveyAssessedListSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyAssessedListSubMenu);
		return SurveyAssessedListSubMenu.isDisplayed();
	}
	
	public boolean SurveyAssessedReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyAssessedReportSubMenu);
		return SurveyAssessedReportSubMenu.isDisplayed();
	}
	
	public boolean WardwiseSurveyReportSubMenuisdisplayed() {
		scrollToElement(ldriver, WardwiseSurveyReportSubMenu);
		return WardwiseSurveyReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyPendingReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyPendingReportSubMenu);
		return SurveyPendingReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyLevelSummaryReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyLevelSummaryReportSubMenu);
		return SurveyLevelSummaryReportSubMenu.isDisplayed();
	}
	
	public boolean UserwiseForwardSummarySubMenuisdisplayed() {
		scrollToElement(ldriver, UserwiseForwardSummarySubMenu);
		return UserwiseForwardSummarySubMenu.isDisplayed();
	}
	
	public boolean UserwiseSurveyEditReportSubMenuisdisplayed() {
		scrollToElement(ldriver, UserwiseSurveyEditReportSubMenu);
		return UserwiseSurveyEditReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyModificationReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyModificationReportSubMenu);
		return SurveyModificationReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyGeotaggingReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyGeotaggingReportSubMenu);
		return SurveyGeotaggingReportSubMenu.isDisplayed();
	}
	
	public boolean ExPartySurveyNoticeSubMenuisdisplayed() {
		scrollToElement(ldriver, ExPartySurveyNoticeSubMenu);
		return ExPartySurveyNoticeSubMenu.isDisplayed();
	}
	
	public boolean SurveyNoticeListSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyNoticeListSubMenu);
		return SurveyNoticeListSubMenu.isDisplayed();
	}
	
	public boolean BulkSurveyNoticePrintSubMenuisdisplayed() {
		scrollToElement(ldriver, BulkSurveyNoticePrintSubMenu);
		return BulkSurveyNoticePrintSubMenu.isDisplayed();
	}
	
	public boolean SurveyNoticeReceivedListSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyNoticeReceivedListSubMenu);
		return SurveyNoticeReceivedListSubMenu.isDisplayed();
	}
	
	public boolean SurveyNoticeReceivedReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyNoticeReceivedReportSubMenu);
		return SurveyNoticeReceivedReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyNoticeDistributedReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyNoticeDistributedReportSubMenu);
		return SurveyNoticeDistributedReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyDemandReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyDemandReportSubMenu);
		return SurveyDemandReportSubMenu.isDisplayed();
	}
	
	public boolean SurveyGISUpdateSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyGISUpdateSubMenu);
		return SurveyGISUpdateSubMenu.isDisplayed();
	}
	
	public boolean SurveyVisitReportSubMenuisdisplayed() {
		scrollToElement(ldriver, SurveyVisitReportSubMenu);
		return SurveyVisitReportSubMenu.isDisplayed();
	}
	
	public boolean TLSurveyVisitSubMenuisdisplayed() {
		scrollToElement(ldriver, TLSurveyVisitSubMenu);
		return TLSurveyVisitSubMenu.isDisplayed();
	}
	
	public boolean TLSurveyVisitReportSubMenuisdisplayed() {
		scrollToElement(ldriver, TLSurveyVisitReportSubMenu);
		return TLSurveyVisitReportSubMenu.isDisplayed();
	}
	
	public void clickOnAccountsMenu() {
		AccountsMenu.click();
	}
	
	public boolean TransactionDeactivateSubMenuisdisplayed() {
		scrollToElement(ldriver, TransactionDeactivateSubMenu);
		return TransactionDeactivateSubMenu.isDisplayed();
	}
	
	public boolean CashVerificationSubMenuisdisplayed() {
		scrollToElement(ldriver, CashVerificationSubMenu);
		return CashVerificationSubMenu.isDisplayed();
	}
	
	public boolean BankDepositDateEntrySubMenuisdisplayed() {
		scrollToElement(ldriver, BankDepositDateEntrySubMenu);
		return BankDepositDateEntrySubMenu.isDisplayed();
	}
	
	public boolean BankReconciliationSubMenuisdisplayed() {
		scrollToElement(ldriver, BankReconciliationSubMenu);
		return BankReconciliationSubMenu.isDisplayed();
	}
	
	public boolean PaymentModeUpdateSubMenuisdisplayed() {
		scrollToElement(ldriver, PaymentModeUpdateSubMenu);
		return PaymentModeUpdateSubMenu.isDisplayed();
	}
	
	public boolean HouseTaxTransactionDeactivateSubMenuisdisplayed() {
		scrollToElement(ldriver, HouseTaxTransactionDeactivateSubMenu);
		return HouseTaxTransactionDeactivateSubMenu.isDisplayed();
	}
	
	public boolean HouseTaxPaymentModeUpdateSubMenuisdisplayed() {
		scrollToElement(ldriver, HouseTaxPaymentModeUpdateSubMenu);
		return HouseTaxPaymentModeUpdateSubMenu.isDisplayed();
	}
	
	public void clickOnInactivePropertyMenu() {
		InactivePropertyMenu.click();
	}
	
	public boolean InactivePropertySubMenuisdisplayed() {
		scrollToElement(ldriver, InactivePropertySubMenu);
		return InactivePropertySubMenu.isDisplayed();
	}
	
	public boolean InactiveDCBSubMenuisdisplayed() {
		scrollToElement(ldriver, InactiveDCBSubMenu);
		return InactiveDCBSubMenu.isDisplayed();
	}
	
	public boolean InactivePropertyActivitySubMenuisdisplayed() {
		scrollToElement(ldriver, InactivePropertyActivitySubMenu);
		return InactivePropertyActivitySubMenu.isDisplayed();
	}
	
	public void clickOnInactiveSurveyMenu() {
		InactiveSurveyMenu.click();
	}
	
	public boolean InactiveSurveySubMenuisdisplayed() {
		scrollToElement(ldriver, InactiveSurveySubMenu);
		return InactiveSurveySubMenu.isDisplayed();
	}
	
	public boolean InactiveSurveyActivitySubMenuisdisplayed() {
		scrollToElement(ldriver, InactiveSurveyActivitySubMenu);
		return InactiveSurveyActivitySubMenu.isDisplayed();
	}
	
	public void clickOnHouseTaxEntrySubMenu() {
		HouseTaxEntrySubMenu.click();
	}
	
	public void clickOnLegacyEntrySubMenu() {
		LegacyEntrySubMenu.click();
	}
	
	public void clickOnSearchPropertySubMenu() {
		SearchPropertySubMenu.click();
	}
	
	public void clickOnDocumentUploadSubMenu() {
		DocumentUploadSubMenu.click();
	}
	
	public void clickOnUpdatePropertyDetailsSubMenu() {
		UpdatePropertyDetailsSubMenu.click();
	}
	
	public void clickOnLastPaymentUpdateSubMenu() {
		LastPaymentUpdateSubMenu.click();
	}
	
	public void clickOnUpdateOwnerDetailsSubMenu() {
		UpdateOwnerDetailsSubMenu.click();
	}
	
	public void clickOnPropertyDeactivateSubMenu() {
		PropertyDeactivateSubMenu.click();
	}
	
	public void clickOnWardUpdateSubMenu() {
		WardUpdateSubMenu.click();
	}
	
	public void clickOnAdjustmentSubMenu() {
		AdjustmentSubMenu.click();
	}
	
	public void clickOnHouseTaxLastPaymentUpdateSubMenu() {
		HouseTaxLastPaymentUpdateSubMenu.click();
	}
	
	public void clickOnDNNoticeDistributionSubMenu() {
		scrollToElement(ldriver, DNNoticeDistributionSubMenu);
		DNNoticeDistributionSubMenu.click();
	}
	
	public void clickOnCounterReportSubMenu() {
		scrollToElement(ldriver, CounterReportSubMenu);
		CounterReportSubMenu.click();
	}
	
	public void clickOnTCCollectionSummarySubMenu() {
		scrollToElement(ldriver, TCCollectionSummarySubMenu);
		TCCollectionSummarySubMenu.click();
	}
	
	public void clickOnDCBReportSubMenu() {
		scrollToElement(ldriver, DCBReportSubMenu);
		DCBReportSubMenu.click();
	}
	
	public void clickOnSAFReportSubMenu() {
		scrollToElement(ldriver, SAFReportSubMenu);
		SAFReportSubMenu.click();
	}
	
	
	
	
	
	
	
	
	
	 
	
	
	
	

}
