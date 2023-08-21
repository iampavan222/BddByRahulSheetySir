package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestBase;
import utils.TestContextSetup;

public class offerPageStepDefination {
	String offerPageProd;
	TestContextSetup test;
	LandingPage landingpage;
	OfferPage offerpage;
	PageObjectManager pageobjectmanager;
	GenericUtils genericutils;
	TestBase testbase;

	public offerPageStepDefination(TestContextSetup test)
	{
		this.test = test;
	}

	@Then("^user searched for (.+) shortname in offers page$")
	public void user_searched_for_shortname_in_offers_page(String prodName) throws Throwable 
	{
		//one way of initialisation
		//pageobjectmanager = new PageObjectManager(test.driver);
		//landingpage = new LandingPage(test.driver);
		//offerpage = new OfferPage(test.driver);
		SwitchWindowToChild();
		test.pageobjectmanager.getLandingPage().searchItem(prodName);
		//landingpage.searchItem(prodName);
		Thread.sleep(2000);
		offerPageProd=test.pageobjectmanager.getOfferPage().getOfferPageProdDetail().substring(0, 3);
		//offerPageProd = offerpage.getOfferPageProdDetail().substring(0, 3);

	}

	public void SwitchWindowToChild() throws Throwable {
		//landingpage.performTopDeals();
		test.pageobjectmanager.getLandingPage().performTopDeals();
		test.genericutils.switchTochild();
		
	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() 
	{
		Assert.assertEquals(test.LandingPageProd, offerPageProd);
		
		
		
	}

}
