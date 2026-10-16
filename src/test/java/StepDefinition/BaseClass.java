package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.AllModuleOperatorWiseCollectionPage;
import PageObject.AllModuleReportPage;
import PageObject.ApptiFormListPage;
import PageObject.ApptiRejectListPage;
import PageObject.AppttiPendingReportPage;
import PageObject.BOHDashBoardPage;
import PageObject.BankDepositPage;
import PageObject.BankReconcilationPage;
import PageObject.BulkSurveyNoticePage;
import PageObject.CashVerificationPage;
import PageObject.ChequeBounceRptsPage;
import PageObject.ChequeBouncedCollectionReportPage;
import PageObject.CitizenPage;
import PageObject.CounterReportPage;
import PageObject.DCBReportPage;
import PageObject.DCBULBWisePage;
import PageObject.DN130NoticeDistributionReportPage;
import PageObject.DashBoardPage;
import PageObject.DeactivateTransactionPage;
import PageObject.ExPartySurveyNoticePage;
import PageObject.HouseTaxEntryPage;
import PageObject.HouseTaxEntryViewPage;
import PageObject.HouseTaxPaymentPage;
import PageObject.HouseTaxPaymentReceiptPage;
import PageObject.HtaxDcbReportPage;
import PageObject.HtaxPaymentModeUpdatePage;
import PageObject.InactiveDCBReportPage;
import PageObject.InactivePropActivityPage;
import PageObject.InactiveSurveyActivityPage;
import PageObject.LegacyEntryPage;
import PageObject.LoginPage;
import PageObject.PaymentModeUpdatePage;
import PageObject.PaymentModeWiseCollPage;
import PageObject.PrintAllDemandRecieptPage;
import PageObject.PrintAllPaymentRecieptPage;
import PageObject.PropertyListPage;
import PageObject.PropertyUpdateReportPage;
import PageObject.PropertyWiseTCVisitPage;
import PageObject.ReVerificationReportPage;
import PageObject.ReassesmentDifffernceReportPage;
import PageObject.SafReportPage;
import PageObject.SearchPropertyPage;
import PageObject.SearchSurveyPage;
import PageObject.SearchSurveyVisitPage;
import PageObject.SurveyAssessedListPage;
import PageObject.SurveyAssessedReportPage;
import PageObject.SurveyDemandReportPage;
import PageObject.SurveyGeotaggingReportPage;
import PageObject.SurveyLevelSummaryReportPage;
import PageObject.SurveyModificationReportPage;
import PageObject.SurveyNoticeDistributedReportPage;
import PageObject.SurveyNoticeListPage;
import PageObject.SurveyNoticeReceivedListPage;
import PageObject.SurveyNoticeReceivedReportPage;
import PageObject.SurveyPendingReportPage;
import PageObject.SurveyReportPage;
import PageObject.SurveySummaryReportPage;
import PageObject.SurveyTeamSummaryPage;
import PageObject.SurveyVisitReportPage;
import PageObject.TCCollectionSummaryPage;
import PageObject.TCVisitReportPage;
import PageObject.TCVisitSummaryPage;
import PageObject.TLSurveyVisitReportPage;
import PageObject.TLVisitReportPage;
import PageObject.TaxCollectionReportPage;
import PageObject.TaxablePropertyReportPage;
import PageObject.TransactionDeactivateReportPage;
import PageObject.UserWiseForwardSummaryPage;
import PageObject.UserWiseSurveyEditReportPage;
import PageObject.VarReportPage;
import PageObject.WardWiseCollectionRptPage;
import PageObject.WardWiseSurveyReportPage;
import PageObject.WorkReportDashBoardPage;
import Utilities.ReadConfig;
import io.cucumber.java.Before;

import org.apache.logging.log4j.*;

public class BaseClass {
	
	public static WebDriver driver;
	public static LoginPage loginPg;
	public static DashBoardPage dashboardPg; 
	public static WorkReportDashBoardPage workreportdashboardPg;
	public static BOHDashBoardPage bohdashboardPg;
	public static HouseTaxEntryPage housetaxentryPg;
	public static HouseTaxEntryViewPage housetaxentryviewPg;
	public static HouseTaxPaymentPage housetaxpaymentPg;
	public static HouseTaxPaymentReceiptPage housetaxpaymentreceiptPg;
	public static LegacyEntryPage legacyentrypg;
	public static SearchPropertyPage searchpropertyPg;
	public static PropertyListPage propertylistPg;
	public static CounterReportPage counterreportPg;
	public static TCCollectionSummaryPage tccollectionsummaryPg;
	public static DCBULBWisePage dcbulbwisePg;
	public static SafReportPage safreportPg;
	public static WardWiseCollectionRptPage wardwisecollectionrptPg;
	public static PaymentModeWiseCollPage paymentmodewisecollpg;
	public static AllModuleReportPage allmodulereportpg;
	public static TransactionDeactivateReportPage transactiondeactivatereportPg;
	public static AllModuleOperatorWiseCollectionPage allmoduleoperatorwisecollectionPg;
	public static ChequeBounceRptsPage chequebouncerptsPg;
	public static PrintAllPaymentRecieptPage printallpaymentrecieptpg;
	public static TaxablePropertyReportPage taxablepropertyreportPg;
	public static DCBReportPage dcbreportPg;
	public static HtaxDcbReportPage htaxdcbreportpg;
	public static PrintAllDemandRecieptPage printalldemandreceiptPg;
	public static VarReportPage varreportPg;
	public static ReassesmentDifffernceReportPage reassesmentdiffferencereportPg;
	public static ChequeBouncedCollectionReportPage chequebouncedcollectionreportPg;
	public static ReVerificationReportPage reverificationreportPg;
	public static TaxCollectionReportPage taxcollectionreportPg;
	public static ApptiFormListPage apptiformlistPg;
	public static AppttiPendingReportPage appttipendingreportPg; 
	public static ApptiRejectListPage apptirejectlistPg;
	public static TCVisitReportPage tcvisitreportPg;
	public static TCVisitSummaryPage tcvisitsummaryPg;
	public static PropertyWiseTCVisitPage propertywisetcvisitPg;
	public static TLVisitReportPage tlvisitreportPg;
	public static PropertyUpdateReportPage propertyupdatereportPg;
	public static DN130NoticeDistributionReportPage dn130noticedistributionreportPg;
	public static SurveyReportPage surveyreportPg;
	public static SurveySummaryReportPage surveysummaryreportPg;
	public static SurveyTeamSummaryPage surveyteamsummaryPg;
	public static SurveyAssessedListPage surveyassessedlistPg;
	public static SurveyAssessedReportPage surveyassessedreortPg; 
	public static WardWiseSurveyReportPage wardwisesurveyreportPg;
	public static SurveyPendingReportPage surveypendingreportPg;
	public static SurveyLevelSummaryReportPage surveylevelsummaryreportPg; 
	public static UserWiseForwardSummaryPage userwiseforwardsummaryPg;
	public static UserWiseSurveyEditReportPage userwisesurveyeditreportPg;
	public static SurveyModificationReportPage surveymodificationreportPg; 
	public static SurveyGeotaggingReportPage surveygeotaggingreportPg;
	public static ExPartySurveyNoticePage expartysurveynoticePg;
	public static SurveyNoticeListPage surveynoticelistPg;
	public static BulkSurveyNoticePage bulksurveynoticePg;
	public static SurveyNoticeReceivedListPage surveynoticereceivedlistPg;
	public static SurveyNoticeReceivedReportPage surveynoticereceivedreportPg;
	public static SurveyNoticeDistributedReportPage surveynoticedistributedreportPg;
	public static SurveyDemandReportPage surveydemandreportPg;
	public static SearchSurveyPage searchsurveyPg;
	public static SurveyVisitReportPage surveyvisitreportPg;
	public static SearchSurveyVisitPage searchsurveyvisitPg;
	public static TLSurveyVisitReportPage tlsurveyvisitreportPg;
	public static DeactivateTransactionPage deactivatetransactionPg; 
	public static CashVerificationPage cashverificationPg;
	public static BankDepositPage bankdepositPg;
	public static BankReconcilationPage bankreconcilationPg;
	public static PaymentModeUpdatePage paymentmodeupdatePg;
	public static HtaxPaymentModeUpdatePage htaxpaymentmodeupdatePg;
	public static InactiveDCBReportPage inactivedcbreportPg;
	public static InactivePropActivityPage inactivepropactivityPg;
	public static InactiveSurveyActivityPage inactivesurveyactivityPg;
	public static CitizenPage citizenPg;
	public static Logger log;
	public ReadConfig readConfig;
	
	
	public String randomString(){
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomNumber(){
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomPinCode(){
		String generatedpincode=RandomStringUtils.randomNumeric(6);
		return generatedpincode;
	}
	
	public String randomAge(){
		String generatedage=RandomStringUtils.randomNumeric(2);
		return generatedage;
	}
	
	public String randomAlphaNumeric(){
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
	}
	
	public String captureScreen(String tname)throws IOException {
		String timeStamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timeStamp+".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		
		return targetFilePath;
	}
	
	
	
}
