package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage 
{
	public By search = By.xpath("//*[@type='search']");
	private By productName = By.cssSelector("div.product h4");
	private By topDeals= By.linkText("Top Deals");
	By Increment = By.cssSelector("a.increment");
	By addToCart = By.cssSelector("div.product-action button");
	
	private WebDriver driver;
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void IncrementQuantity(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(Increment).click();
			i--;
		}
	}
	
	public void performaddtoCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
	
	public void performTopDeals()
	{
		driver.findElement(topDeals).click();
	}
	
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}

}
