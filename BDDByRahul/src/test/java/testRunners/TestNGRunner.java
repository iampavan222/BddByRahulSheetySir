package testRunners;

import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
( 
   features = "./src/test/java/Features",
   glue = "stepDefination",
   dryRun = false,
   monochrome = true,
   tags = "@SearchOrder or @OfferPage",
   plugin = {"pretty", "html:target/cucumber-reports.html",
		      "json:target/cucumber-reports.json",
		      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		    })

public class TestNGRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
