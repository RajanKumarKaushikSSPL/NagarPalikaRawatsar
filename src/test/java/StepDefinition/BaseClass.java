package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.BOHDashBoardPage;
import PageObject.DashBoardPage;
import PageObject.LoginPage;
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
