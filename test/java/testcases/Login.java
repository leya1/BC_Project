package testcases;

import org.testng.annotations.Test;
import pages.BaseClass;
import pages.LoginPage;
import org.testng.Assert;

public class Login extends BaseClass {
	@Test(priority=1)
	public void validUserInvalidPass() {
		
		  logger=report.createTest("Attempt to login with valid username and invalid password");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",0,0), excel.getNumericData("Login",0,1));
		  
		  String text=loginPage.msg.getText();
		  
		  String expectedText="Authentication failed!";
		  
		  Assert.assertEquals(text,expectedText);
		  
		  logger.pass("Login Failed as expected");
	  }
	
	@Test(priority=2)
	  public void validUserValidPass() {
		
		  logger=report.createTest("Attempt to login with valid username and invalid password");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  String actualUrl="http://buffalocart.com/demo/crm/index.php/dashboard";
		  
		  String expectedUrl= driver.getCurrentUrl();
		  
		  Assert.assertEquals(actualUrl, expectedUrl);
		  
		  loginPage.logoutFromBuffaloCart();
		  
		  logger.pass("Successful login");
		  
	  }
	  @Test(priority=3)
	  public void invalidUserValidPass() {
		  
		  logger=report.createTest("Attempt to login with valid username and invalid password");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",2,0), excel.getNumericData("Login",2,1));
		  
		  String actualUrl="http://buffalocart.com/demo/crm/index.php/signin";
		  
		  String expectedUrl= driver.getCurrentUrl();
		  
		  Assert.assertEquals(actualUrl, expectedUrl);
		  
		  logger.pass("Login Failed as expected");
		  
	  }
	  @Test(priority=4)
	  public void invalidUserInvalidPass() {
		  
		  logger=report.createTest("Attempt to login with valid username and invalid password");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",3,0), excel.getNumericData("Login",3,1));
		  
		  String actualUrl=";p";
		  
		  String expectedUrl= driver.getCurrentUrl();
		  
		  Assert.assertEquals(actualUrl, expectedUrl);
		  
		  logger.pass("Login Failed as expected");
		  
	  }
	 
	  @Test(priority=5)
	  public void titleVerification() {
		  
		  logger=report.createTest("Title Verification");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
          String actualTitle="Dashboard | Demo- Project Manager";
		  
		  String expectedTitle= driver.getTitle();
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
		  loginPage.logoutFromBuffaloCart();
		  
	  }
	  
	  @Test(priority=6)
	  public void signInTitleVerification() {
		  
		  logger=report.createTest("Title Verification");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  //loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
          String actualTitle="Sign in | Demo- Project Manager";
		  
		  String expectedTitle= driver.getTitle();
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
	  }
}
