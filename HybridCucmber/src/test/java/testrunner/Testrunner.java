package testrunner;

//import org.junit.runner.RunWith;

import org.testng.annotations.AfterClass;
import com.vimalselvam.cucumber.listener.Reporter;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\HP\\git\\Hybrid-Cucumber\\HybridCucmber\\src\\test\\resources\\Features\\Testcases.feature",
plugin = {"pretty", //"html:reports/cucumberreport","json:reports/cucumberreport/jsonreport",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
glue="stepdefinition",
strict=true
)
public class Testrunner extends AbstractTestNGCucumberTests{

@AfterClass

public static void Extentsreport()
{
Reporter.loadXMLConfig("C:\\Users\\HP\\git\\Hybrid-Cucumber\\HybridCucmber\\src\\test\\resources\\extent-config.xml");
Reporter.setSystemInfo("user", System.getProperty("user.name"));
Reporter.setSystemInfo("os", "Windows");
Reporter.setTestRunnerOutput("Sample test runner output message"); 
}

}
	 

