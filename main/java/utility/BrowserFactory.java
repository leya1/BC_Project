package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	WebDriver driver;
	public static WebDriver launchbrowser(WebDriver driver,String browser, String url)
	{
	switch(browser)
	{
	case "Chrome":
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		break;
	case "Firefox":
		System.setProperty("webdriver.chrome.driver","./Drivers/geckodriver.exe");
		driver = new FirefoxDriver(); 
		break;
	case "ME":
		System.setProperty("webdriver.chrome.driver","./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		break;
	}
	
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}
	
}
