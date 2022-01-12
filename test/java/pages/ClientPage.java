package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ClientPage extends BaseClass{
	
	WebDriver driver;
	public ClientPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver ,this);
	}
	
	  @FindBy(xpath="//*[@id=\"sidebar-menu\"]/li[3]/a/span")
	  public WebElement clients;
	  
	  @FindBy(xpath="//*[@id=\"client-tabs\"]/div/div/a[2]")
	  public WebElement addClient;
	  
	  @FindBy(id="company_name")
	  public WebElement companyName;
	  
	  @FindBy(xpath="//*[@id=\"address\"]")
	  public WebElement address;
	  
	  @FindBy(xpath="//*[@id=\"city\"]")
	  public WebElement city;
	  
	  @FindBy(xpath="//*[@id=\"state\"]")
	  public WebElement state;
	  
	  @FindBy(xpath="//*[@id=\"zip\"]")
	  public WebElement zip;
	  
	  @FindBy(xpath="//*[@id=\"country\"]")
	  public WebElement country;
	  
	  @FindBy(xpath="//*[@id=\"phone\"]")
	  public WebElement phone;
	  
	  @FindBy(xpath="//*[@id=\"website\"]")
	  public WebElement website;
	  
	  @FindBy(xpath="//*[@id=\"vat_number\"]")
	  public WebElement vatNumber;
	  
	  @FindBy(xpath="//*[@id=\"s2id_autogen1\"]")
	  public WebElement clientGroup;
	  
	  @FindBy(xpath="//*[@id=\"save-and-continue-button\"]")
	  public WebElement saveAndContinue;
	  
	  @FindBy(xpath="//*[@id=\"ajaxModal\"]/div/div/div[1]/button")
	  public WebElement closebutton;
	  
	  @FindBy(xpath="//*[@id=\"company_name-error\"]")
	  public WebElement msg;
	
	  @FindBy(xpath="//div[@class='col-md-9']/span") 
	  public WebElement compNameValidationMsg;
	  
	  @FindBy(xpath="//*[@id=\"client-form\"]/div[2]/button[3]")
	  public WebElement save;
	  
	  @FindBy(xpath="//*[@id=\"client-tabs\"]/li[2]/a")
	  public WebElement clientsTable;
	
	  @FindBy(xpath="//*[@id=\"client-table\"]/thead/tr/th[2]")
	  public WebElement clientName;

	  public void addClientDetails()
	  {
		  clients.click();
		  
		  addClient.click();
	  }
	  
	  //public void addaClient(String cN,String add,String cityN,String stateN,String zipN,String cntry,String phoneN,String web,String vatN,String clientGp)
	  public void addaClient(String cN,String add,String cityN,String stateN,String zipN,String cntry,String phoneN,String web,String vatN,String clientGp)
	  {
		  addClientDetails();
		  
		  //companyName.sendKeys(excel.getStringData("ClientDetails",0,0));
		  
		  companyName.sendKeys(cN);
		  
		  address.sendKeys(add);
		  
		  city.sendKeys(cityN);
		  
		  state.sendKeys(stateN);
		  
		  zip.sendKeys(zipN);
		  
		  country.sendKeys(cntry);
		  
		  phone.sendKeys(phoneN);
		  
		  phone.sendKeys(Keys.TAB);
		  
		  website.sendKeys(web);
		  
		  vatNumber.sendKeys(vatN);
		  
		  clientGroup.sendKeys(clientGp);
	  }
	
	  public void searchClient(String Cname) throws InterruptedException
	  {
		  
		  clients.click();
		  Thread.sleep(3000);
		  clientsTable.click();
		 
		  for(int i=1;i<=10;i++)
		  {
			 String name=clientName.getText();
			 if(name.contains(Cname))
			 {
				 Assert.assertTrue(true);
				 break;
			 }
			 else
			 {
				 Assert.assertTrue(false);
			 }
			 //WebElement next=driver.findElement(By.xpath("//*[@id=\"dtBasicExample_next\"]"));
			 //next.click();
		  }
	  }
}
