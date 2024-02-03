package pages_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class For_forgetpswd
{
  @FindBy(xpath="//a[contains(text(),'Forgotten password?')]") private WebElement forgetpswd;
  
  public For_forgetpswd(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void click_forgetpswd()
  {
	  forgetpswd.click(); 
  }
  
}
