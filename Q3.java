/*Go to https://www.path2usa.com/travel-companion/ and try to automate  
Find A Travel Companion form and also capture a screenshot .
*/

package seleniumSession3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Q3 {

	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
	}
	
	public void path2UsaForm() {
		driver.findElement(By.id("form-field-travel_from")).sendKeys(null);
	}
	
//	@AfterClass
//	public void closeBrowser() {
//		driver.close();
//	}


}
