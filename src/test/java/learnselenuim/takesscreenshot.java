package learnselenuim;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import basePack.testbase;

public class takesscreenshot extends testbase {

	public static void main(String[] args) throws IOException {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().to("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.switchTo().defaultContent();
		captureScreeshot(); // just call the method to capture the screen shot.

		driver.close();
	}

}
