package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"FeatureFiles/Register.feature"},
		glue = {"stepdefinitions", "AppHooks"},
		tags = "",
		monochrome=false,
	
		dryRun=false,
	   
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" ,
				"timeline:test-output-thread/",	
		}
		
		)
public class MyTestRunner {
}
	
	




