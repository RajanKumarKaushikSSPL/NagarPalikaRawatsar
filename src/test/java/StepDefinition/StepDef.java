package StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.BOHDashBoardPage;
import PageObject.DashBoardPage;
import PageObject.LoginPage;
import PageObject.WorkReportDashBoardPage;
import Utilities.ReadConfig;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class StepDef extends BaseClass {
	
	@Before("@Smoke")
	public void setup1() {
		readConfig=new ReadConfig();
		log=LogManager.getLogger("StepDef");
	    String browser=readConfig.getBrowser();
		
		//launch browser
		switch(browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
	
		case "msedge":
			driver=new EdgeDriver();
			break;
		
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
	    default:
	    	driver=null;
	    	break;
	    }
		System.out.println("Setup-Smoke method executed..");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Setup-Smoke method executed");
	}
	
	@Before("@Regression")
	public void setup2() {
		readConfig=new ReadConfig();
		log=LogManager.getLogger("StepDef");
        String browser=readConfig.getBrowser();
		
		//launch browser
		switch(browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
	
		case "msedge":
			driver=new EdgeDriver();
			break;
		
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
	    default:
	    	driver=null;
	    	break;
	    }
		System.out.println("Setup-Regression method executed..");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Setup-Regression method executed");
	}
	
	@Before("@DDT")
	public void setup3() {
		readConfig=new ReadConfig();
		log=LogManager.getLogger("StepDef");
        String browser=readConfig.getBrowser();
		
		//launch browser
		switch(browser.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
	
		case "msedge":
			driver=new EdgeDriver();
			break;
		
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
	    default:
	    	driver=null;
	    	break;
	    }
		System.out.println("Setup-DDT method executed..");
		//driver=new ChromeDriver();
		driver.manage().window().maximize();
		log.info("Setup-DDT method executed..");
	}
	
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    loginPg=new LoginPage(driver);
	    dashboardPg=new DashBoardPage(driver);
	    workreportdashboardPg=new WorkReportDashBoardPage(driver);
	    bohdashboardPg=new BOHDashBoardPage(driver);
	    
	    log.info("chrome browser launched");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	    log.info("URL opened");
	}
    
	@When("User enters Username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		loginPg.enterUserName(username);
		loginPg.enterPassword(password);
		log.info("username and password entered");
	}

	@When("click on Login button")
	public void click_on_login_button() {
		loginPg.clickOnLoginButton();
		log.info("clicked on login button");
	}
	
    /////////////////////////Login/////////////////////////////
	@Then("User should be able to see {string} text")
	public void user_should_be_able_to_see_text(String expPlainText) {
		String actPlainText=dashboardPg.getDashBoardText();
	    if(expPlainText.equals(actPlainText)) {
	    	log.info("Test passed: Login feature: User is able to see dashboard text");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("Test failed: Login feature: User is not able to see dashboard text");
	    	Assert.assertTrue(false);
	    }
	}

	@When("User clicks on super admin profile")
	public void user_clicks_on_super_admin_profile() {
	    dashboardPg.clickOnSuperAdminProfile();
	    log.info("User clicked on super admin profile");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User clicks on signout button")
	public void user_clicks_on_signout_button() {
	    dashboardPg.clickOnSignOutButton();
	    log.info("User clicked on signout button");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) {
	    String actTitle=driver.getTitle();
	    if(expTitle.equals(actTitle)) {
	    	log.info("User is able to see login page of Nagar Palika Rawatsar");
	    	Assert.assertTrue(true);
	    }else {
	    	log.warn("User is not able to see login page of Nagar Palika Rawatsar");
	    	Assert.assertTrue(false);
	    }
	}

	/*@Then("close browser")
	public void close_browser() {
	    //driver.close();
	    //driver.quit();
		log.info("Browser closed");
	}*/
	
	///////////////////////Dashboard////////////////////////
	@When("User clicks on dashboard menu")
	public void user_clicks_on_dashboard_menu() {
	    dashboardPg.clickOnDashBoardMenu();
	    log.info("User clicks on dashboard menu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("click on Work Report Dashboard submenu")
	public void click_on_work_report_dashboard_submenu() {
	    dashboardPg.clickOnWorkReportDashBoardSubMenu();
	    log.info("User clicks on Work Report Dashboard submenu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("click on search button of Work Report Dashboard")
	public void click_on_search_button_of_work_report_dashboard() {
		workreportdashboardPg.clickOnSearchButton();
		log.info("User clicks on search button of Work Report Dashboard");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user can view Work Report Dashboard report")
	public void user_can_view_work_report_dashboard_report() {
		String expTitle="Daily Work Report";
		String actTitle=workreportdashboardPg.getReportPlainText();
		   
		if(actTitle.contains(expTitle)) {
			log.info("user can view Work Report Dashboard report");
			Assert.assertTrue(true);
		}else {
			log.warn("user can not view Work Report Dashboard report");
			Assert.assertTrue(false);
		}
	}

    @When("click on Work BOH Dashboard submenu")
	public void click_on_work_boh_dashboard_submenu() {
	    dashboardPg.clickOnBOHDashBoardSubMenu();
	    log.info("User clicks on Work BOH Dashboard submenu");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    @When("click on search button of BOH Dashboard")
    public void click_on_search_button_of_boh_dashboard() {
        bohdashboardPg.clickOnSearchButton();
        log.info("User clicks on search button of BOH Dashboard");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @Then("user can view report of BOH Dashboard")
    public void user_can_view_report_of_boh_dashboard() {
    	String expTitle="Daily Work Report";
		String actTitle=bohdashboardPg.getReportPlainText();
		   
		if(actTitle.contains(expTitle)) {
			log.info("user can view report of BOH Dashboard");
			Assert.assertTrue(true);
		}else {
			log.warn("user can not view report of BOH Dashboard");
			Assert.assertTrue(false);
		}
    }
    
    @After
    public void teardown(Scenario sc) {
    	System.out.println("Tear Down method executed..");
    	/*if(sc.isFailed()==true) {
    		
    		String fileWithPath="D:\\Cucumber\\CucumberWorkSpace\\NagarPalikaRawatsar\\Screenshot\\failedScreenshot.png";
    		TakesScreenshot scrShot=((TakesScreenshot)driver);
    		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    		File DestFile=new File(fileWithPath);
    		log.warn("Screenshot of failed test case taken");
    		try {
				FileUtils.copyFile(SrcFile, DestFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}*/
    	driver.quit();
    }
    
    @AfterStep
	public void addScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}
    
    /*
    @After("@Regression")
    public void teardown2() {
    	System.out.println("Tear Down-Regression method executed..");
    	driver.quit();
    }
    
    @After("@DDT")
    public void teardown3() {
    	System.out.println("Tear Down-DDT method executed..");
    	driver.quit();
    }
    */
    /*
    @BeforeStep
    public void beforeStepMethodDemo() {
    	System.out.println("This is before step....");
    }
    
    @AfterStep
    public void afterStepMethodDemo() {
    	System.out.println("This is after step....");
    }
    */
    
}
