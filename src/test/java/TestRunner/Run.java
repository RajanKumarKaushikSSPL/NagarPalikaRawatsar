package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
//features={".//src/test/resources/Features/LoginFeature.feature",".//src/test/resources/Features/DashboardFeature.feature"},
//features={".//src/test/resources/Features/UDTaxSetUp.feature"},
//features={".//src/test/resources/Features/UDTaxReportFeature.feature:69"},		
features=".//src/test/resources/Features/",		
glue="StepDefinition",
dryRun=false,
monochrome = true,
//tags="@Regression",
//plugin= {"pretty","html:Reports/cucumber-reports/reports.html"}
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

//plugin= {"pretty","junit:Reports/cucumber-reports/report_xml.xml","html:Reports/cucumber-reports/reports1.html","json:Reports/cucumber-reports/report_json.json"}
//plugin={"pretty","html:Reports/cucumber-reports/reports1.html"}
//plugin= {"pretty","json:Reports/cucumber-reports/report_json.json"}
public class Run extends AbstractTestNGCucumberTests {
/*this class be empty*/
}
