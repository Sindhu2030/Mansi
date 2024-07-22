package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot_Full {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
      //capture full page screenshot
      //step1: convert webdriver object to TakesScreenshot interface
      		
        TakesScreenshot screenshot=((TakesScreenshot)driver);
      //step2:call getScreenshot method to create image file
      		File src=screenshot.getScreenshotAs(OutputType.FILE);
      		File dest=new File("file:///C:/Users/mansi/.eclipse/Manu/Screenshot/fb.png");
      	
      		//step3: copy image file to destination
      		
    		FileUtils.copyFile(src, dest);
    		driver.close();
      		
        

	}

}
