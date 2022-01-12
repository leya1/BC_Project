package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.BrowserFactory;
import utility.ConfigDataProvider;
import utility.ExcelDataProvider;
import utility.Helper;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setUpSuite() throws IOException
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/BC_"+ Helper.getCurrentDateTime() +".html"));
		report=new ExtentReports();
		report.attachReporter(extent);
	}
	@BeforeClass
	  public void setUp() {
		  driver=BrowserFactory.launchbrowser(driver,config.getBrowser(),config.getQaURL());
	  }
	
	@AfterClass
	  public void tearDown() {
		  BrowserFactory.quitBrowser(driver);
	  }
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);
			logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Test Passed",MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		report.flush();
	}	
	
	public void jsScroll(int a,int b)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy("+ a +","+ b +")");
	}
	public void jsWait()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
	}
	public void jsClick(WebElement value)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", value);
	}
	
	public void dropdown(WebElement element, String value) {
		
		Select objselect =  new Select (element);
		objselect.selectByValue(value);
	}
	
    public void dropdown(WebElement element, String value, int wait) throws InterruptedException {	
	Thread.sleep(wait);
		Select objselect =  new Select (element);
		objselect.selectByValue(value);
	}


}
