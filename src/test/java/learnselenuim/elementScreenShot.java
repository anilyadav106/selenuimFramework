package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementScreenShot {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.switchTo().defaultContent();

	}

}
