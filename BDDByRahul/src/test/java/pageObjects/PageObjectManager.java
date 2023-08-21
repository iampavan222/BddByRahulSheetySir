package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{
	public WebDriver driver;
	public LandingPage landingpage;
	public OfferPage offerpage;
	public CheckoutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()
	{
	    landingpage = new LandingPage(driver);	
	    return landingpage;
	}
	
	public OfferPage getOfferPage()
	{
		offerpage = new OfferPage(driver);
		return offerpage;
	}
	
	public CheckoutPage getCheckoutpage()
	{
		checkoutpage = new CheckoutPage(driver);
		return checkoutpage;
	}

}
