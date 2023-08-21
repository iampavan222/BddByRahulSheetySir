package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	WebDriver driver;
	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By CartBag = By.cssSelector("img[alt='Cart']");
	By ProceedCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By ApplyBtn = By.cssSelector(".promoBtn");
	By PlaceOrderBtn = By.xpath("//button[normalize-space()='Place Order']");
	
	By getProductName = By.cssSelector("p.product-name");
	
	
	public void performCartPage()
	{
		driver.findElement(CartBag).click();
		driver.findElement(ProceedCheckout).click();
	}
	
	public boolean verifyPromoBtn()
	{
		return driver.findElement(ApplyBtn).isDisplayed();
	}
	
	public boolean VerifyPlaceOrder()
	{
		return driver.findElement(PlaceOrderBtn).isDisplayed();
	}
	
	public String validateProductName()
	{
		return driver.findElement(getProductName).getText().split("-")[0].substring(0, 3);
	}
	

}
