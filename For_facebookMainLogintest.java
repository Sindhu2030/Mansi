package pages_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_facebookMainLogintest
{
   
	public static void main (String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		For_loginPageFacebook log=new For_loginPageFacebook(driver);
		log.For_facebookloginUsername();
		log.For_facebookloginPassword();
		log.clickFor_facebookloginPage();
		/*Thread.sleep(2000);
		For_forgetpswd forget=new For_forgetpswd(driver);
		forget.click_forgetpswd();
		*/
		
}
}