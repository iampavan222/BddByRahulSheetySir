package utils;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	WebDriver driver;
	Properties prop;
	public WebDriver DriverInitialisation() throws Throwable
	{
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//resources//global.properties");
		prop = new Properties();
		prop.load(fi);
		String QAUrl=prop.getProperty("QAUrl");
		String browser=prop.getProperty("browser");
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
				
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(QAUrl);
		}
        return driver;
	}

}
