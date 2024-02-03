package pages_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class For_loginPageFacebook
{
   
	 @FindBy(xpath="//input[@id='email']")private WebElement UN;
     @FindBy(xpath="//input[@id='pass']") private WebElement PWD;
	 @FindBy(xpath="//button[text()='Log in']") private WebElement loginbtn;
	 
	 //create constructor
	 
	  public For_loginPageFacebook(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  

	  public void For_facebookloginUsername()
	  {
		  UN.sendKeys("mansi");
	  }
	  public void For_facebookloginPassword()
	  {
		  PWD.sendKeys("123467");
	  }
	  public void clickFor_facebookloginPage()
	  {
		  loginbtn.click();
		  
		  
	  }
	  
	  
	
}
