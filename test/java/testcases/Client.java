package testcases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.ClientPage;
import pages.LoginPage;

public class Client extends BaseClass{
	/*@Test(priority=1)
	  public void selectClients() 
	  {
		 logger=report.createTest("Select clients tab");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		  
		  loginPage.logoutFromBuffaloCart();
		  
	  }
	
	@Test(priority=2)
	  public void ClientsTitleVerification() 
	  {
		 logger=report.createTest("Title verification");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		  
          String actualTitle="Clients | Demo- Project Manager";
		  
		  String expectedTitle= driver.getTitle();
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
		  loginPage.logoutFromBuffaloCart();
		  
	  }
	
	  @Test(priority=3)
	  public void clientDetails() 
	  {
		 logger=report.createTest("Add client details");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		  clientPage.addClient.click();
		  
		  clientPage.companyName.sendKeys(excel.getStringData("CompName",1,0));
		  
          //String text=clientPage.msg.getText();
		  
		  //String expectedText="This field is required.";
		  
		  //Assert.assertEquals(text,expectedText);
		 
		  clientPage.closebutton.click();
		  
		  loginPage.logoutFromBuffaloCart();
		  
	  }
	
	@Test(priority=4,enabled=true)
	  public void addClient() 
	  {
		  logger=report.createTest("select add client tab");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		  
		  clientPage.addClient.click();
		  
          String actualTitle="Clients | Demo- Project Manager";
		  
		  String expectedTitle= driver.getTitle();
		  
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
	  }
	@Test(priority=5,enabled=true)
	  public void companyName() 
	  {
		  logger=report.createTest("Blank as company name");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.addClientDetails();
		 
		  clientPage.companyName.click();
		  
		  clientPage.companyName.sendKeys(Keys.ENTER);
		  
          String actualMsg= clientPage.compNameValidationMsg.getText();
		  
		  Assert.assertEquals(actualMsg, "This field is required.");
		  
		  clientPage.closebutton.click();
		  
		  loginPage.logoutFromBuffaloCart();
		  
	  }
	
	@Test(priority=6,enabled=true)
	  public void clientDetails() throws InterruptedException 
	  {
		  logger=report.createTest("Add client");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  //clientPage.addaClient(excel.getStringData("ClientDetails",1,0),excel.getStringData("ClientDetails",2,0),excel.getStringData("ClientDetails",3,0),excel.getStringData("ClientDetails",4,0),excel.getNumericData("ClientDetails",5,0),excel.getStringData("ClientDetails",6,0),excel.getNumericData("ClientDetails",7,0),excel.getStringData("ClientDetails",8,0),excel.getNumericData("ClientDetails",9,0),excel.getStringData("ClientDetails",10,0));
		 
		  clientPage.addaClient(excel.getStringData("ClientDetails",0,0),excel.getStringData("ClientDetails",1,0),excel.getStringData("ClientDetails",2,0),excel.getStringData("ClientDetails",3,0),excel.getNumericData("ClientDetails",4,0),excel.getStringData("ClientDetails",5,0),excel.getNumericData("ClientDetails",6,0),excel.getStringData("ClientDetails",7,0),excel.getNumericData("ClientDetails",8,0),excel.getStringData("ClientDetails",9,0));
		  Thread.sleep(3000);
		  //clientPage.save.click();
		  
	  }
	
	@Test(priority=7,enabled=true)
	  public void clintDetails() throws InterruptedException 
	  {
		  logger=report.createTest("Search client");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
		  
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		 
		  clientPage.searchClient(excel.getStringData("ClientDetails",0,0));
		  
	  }*/
	
	@Test(priority=7,enabled=true)
	  public void clintDetails() throws InterruptedException 
	  {
		  logger=report.createTest("Search client");
		  
		  LoginPage loginPage=new LoginPage(driver);
		  
		  logger.info("Starting Application");
	
		  loginPage.logintoBuffaloCart(excel.getStringData("Login",1,0), excel.getNumericData("Login",1,1));
		  
		  ClientPage clientPage=new ClientPage(driver);
		  
		  clientPage.clients.click();
		  
		  clientPage.searchClient(excel.getStringData("ClientDetails",0,0));
		  
	  }
	
}
