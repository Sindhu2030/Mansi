package pages_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class For_loginPage
{
	//define webelement
  @FindBy(xpath="//input[@id='userid']")private WebElement UN;
  @FindBy(xpath="//input[@id='password']") private WebElement PWD;
  @FindBy(xpath="//button[text()='Login ']") private WebElement loginbtn;
  
  //create constructor
  public For_loginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  //create method
  
  public void For_loginPageUsername()
  {
	  UN.sendKeys("mansi");
  }
  public void For_loginPagePassword()
  {
	  PWD.sendKeys("123467");
  }
  public void clickFor_loginPage()
  {
	  loginbtn.click();
  }
  
}
