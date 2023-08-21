package stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class CheckOutPageStepDefination 
{
	public WebDriver driver;
	public String LandingPageProd;
	TestContextSetup test;
	PageObjectManager pageobjectmanager;
	CheckoutPage checkoutpage;
	
	public CheckOutPageStepDefination(TestContextSetup test)
	{
		this.test=test;
		this.checkoutpage=test.pageobjectmanager.getCheckoutpage();
	}
	
	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout_and_validate(String name) throws Throwable
	{
		checkoutpage.performCartPage();
		Thread.sleep(3000);
		String getProd=checkoutpage.validateProductName();
		Assert.assertEquals(getProd, name);
		
	}
	
	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo()
	{
		
		Assert.assertTrue(checkoutpage.verifyPromoBtn());
		Assert.assertTrue(checkoutpage.VerifyPlaceOrder());
	}
	
	
	

	

	
}
