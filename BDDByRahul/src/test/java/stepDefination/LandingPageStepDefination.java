package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.TestRunner;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.PageObjectManager;
import testRunners.TestNGRunner;
import utils.TestContextSetup;

public class LandingPageStepDefination 
{
	public WebDriver driver;
	public String LandingPageProd;
	TestContextSetup test;
	PageObjectManager pageobjectmanager;
	LandingPage landingPage;
	
	public LandingPageStepDefination(TestContextSetup test)
	{
		this.test=test;
		this.landingPage=test.pageobjectmanager.getLandingPage();
	}
	

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() 
	{
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	
	}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String prodName) throws Throwable {
		//normal way to create object 
		//LandingPage lp = new LandingPage(test.driver);
		//another way of creating object using dependency injection
		//pageobjectmanager = new PageObjectManager(test.driver);
		//pageobjectmanager.getLandingPage().searchItem(prodName);
		//one of the way to initialise the object using dependency injection
		
		landingPage.searchItem(prodName);
		
		//lp.searchItem(prodName);
		Thread.sleep(2000);
		test.LandingPageProd = (String) test.pageobjectmanager.getLandingPage().getProductName().split("-")[0].trim().substring(0,
				3);
		
	   
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_of_the_selected_product_to_cart(String quantity)
	{
		landingPage.IncrementQuantity(Integer.parseInt(quantity));
		landingPage.performaddtoCart();
		
	}
	

	
}
