package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	
	static String browser="Chrome";
	static WebDriver driver=null;
	
	static void invokeBrowser()
	{
		
		if(browser.equalsIgnoreCase("chrome")) //Condition
		{
			//Invoke the Chrome browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\aiswarr\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();//maximize the window
			
		}
		
	}
	
	static void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
		System.out.println("Browser is closed");
	}
	
	
	
}