package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage 
{
	By offerPageProd= By.cssSelector("table.table-bordered tbody tr td:nth-child(1)");
	
	private WebDriver driver;
	public OfferPage(WebDriver driver) 
	{
		this.driver=driver;
	}
   public String getOfferPageProdDetail()
   {
	   return driver.findElement(By.cssSelector("table.table-bordered tbody tr td:nth-child(1)")).getText();
   }
}
