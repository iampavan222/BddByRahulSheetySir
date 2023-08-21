package utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup 
{
	public WebDriver driver;
	public String LandingPageProd;
	public PageObjectManager pageobjectmanager;
	public GenericUtils genericutils;
	public TestBase testbase;

	public TestContextSetup() throws Throwable 
	{
		testbase= new TestBase();
		pageobjectmanager = new PageObjectManager(testbase.DriverInitialisation());
		genericutils = new GenericUtils(testbase.DriverInitialisation());
		
		
	}
}
