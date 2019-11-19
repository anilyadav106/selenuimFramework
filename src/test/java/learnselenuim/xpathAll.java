package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpathAll {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement gmailBox = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='identifierId']")));

		gmailBox.sendKeys("anil@gmail.com");
		driver.close();
	}
}
