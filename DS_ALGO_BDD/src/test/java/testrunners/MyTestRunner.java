package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"featureFiles/ArrayPage.feature"},
		glue = {"stepdefinitions", "AppHooks"},
		tags = "",
		monochrome=false,
	
		dryRun=false,
	   
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",	
		}
		
		)
public class MyTestRunner {
}





