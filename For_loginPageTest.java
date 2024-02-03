package pages_test;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
public class For_loginPageTest 
{
	public static void main (String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		 For_loginPage log=new  For_loginPage(driver);
		 log.For_loginPageUsername();
		 Thread.sleep(2000);
		 log.For_loginPagePassword();
		 Thread.sleep(2000);
		 log.clickFor_loginPage();
		 
		 
	}

}
