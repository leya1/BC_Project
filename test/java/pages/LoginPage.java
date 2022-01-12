package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	
	 @FindBy(id="email")
	  public WebElement email;
	  
	  @FindBy(id="password")
	  public WebElement password;
	  
	  @FindBy(xpath="//button[@class='w-100 btn btn-lg btn-primary']")
	  public WebElement signInButton;
	  
	  @FindBy(xpath="//*[@id=\"signin-form\"]/div[1]")
	  public WebElement msg;
 
	  @FindBy(xpath="//*[@id=\"user-dropdown\"]")
	  public WebElement sigonOutOption;
	
	  @FindBy(xpath="//*[@id=\"default-navbar\"]/div/div/div/ul/li[6]/ul/li[7]/a")
	  public WebElement sigonOut;
	
	  public void logintoBuffaloCart(String emailApplication,String passwordApplication)
	  {
		  email.sendKeys(emailApplication);
		  password.sendKeys(passwordApplication);
		  signInButton.click();
	  }
	  
	  public void logoutFromBuffaloCart()
	  {
		  sigonOutOption.click();
		  sigonOut.click();
	  }
	  
	  
}
