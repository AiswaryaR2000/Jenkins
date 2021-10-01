package SeleniumPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class Amazon extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		// WebDriverDemo
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();*/
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();*/
		
		invokeBrowser();
		
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		Actions a = new Actions(driver);
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		
		a.moveToElement(account).click().perform();
		
		closeBrowser();
		
		
	}

}