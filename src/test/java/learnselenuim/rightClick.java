package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightClick {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");

		WebDriverWait wait = new WebDriverWait(driver, 2);

		WebElement image = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img")));

		Actions action = new Actions(driver);

		action.contextClick(image).perform(); // right click

		action.click(driver.findElement(By.xpath("//td[text()='Product Info']"))).perform();

		WebElement installation = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='Installation']")));

		action.click(installation).perform();

		WebElement howtosetup = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='How To Setup']")));

		action.click(howtosetup).perform();

		driver.findElement(By.linkText("Download")).click();

		action.sendKeys(Keys.chord(Keys.CONTROL + "A"));

	}

}
