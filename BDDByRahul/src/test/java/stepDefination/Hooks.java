package stepDefination;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import utils.TestContextSetup;

public class Hooks 
{  
	TestContextSetup test;
	public Hooks(TestContextSetup test) 
	{
		this.test=test;
	}
	
	@After
	public void tearDown() throws Throwable
	{
		test.testbase.DriverInitialisation().quit();
	}

}
