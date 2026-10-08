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
import PageObject.ChequeBounceRptsPage;
import PageObject.ChequeBouncedCollectionReportPage;
import PageObject.CounterReportPage;
import PageObject.DCBReportPage;
import PageObject.DCBULBWisePage;
import PageObject.DN130NoticeDistributionReportPage;
import PageObject.DashBoardPage;
import PageObject.HouseTaxEntryPage;
import PageObject.HouseTaxEntryViewPage;
import PageObject.HouseTaxPaymentPage;
import PageObject.HouseTaxPaymentReceiptPage;
import PageObject.HtaxDcbReportPage;
import PageObject.LegacyEntryPage;
import PageObject.LoginPage;
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
import PageObject.TCCollectionSummaryPage;
import PageObject.TCVisitReportPage;
import PageObject.TCVisitSummaryPage;
import PageObject.TLVisitReportPage;
import PageObject.TaxCollectionReportPage;
import PageObject.TaxablePropertyReportPage;
import PageObject.TransactionDeactivateReportPage;
import PageObject.VarReportPage;
import PageObject.WardWiseCollectionRptPage;
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
