//Go to TTN website https://www.tothenew.com/ and verify the options under Services dropdown

package seleniumSession3;

import java.util.List;

import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Q2 {

	public WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/");
	}

	@Test
	public void verifyServiceDropdown() {
		WebElement service = driver.findElement(By.xpath("(//*[@id=\"h-Services\"])[2]"));
//		List<WebElement> elementList = driver.findElements(By.xpath("//ul[@class=\"show\"]/li"));
//		List<String> newList = elementList.stream().map(e -> e.getText()).collect(Collectors.toList());
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
