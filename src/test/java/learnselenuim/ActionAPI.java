package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionAPI {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");

		if (driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).isDisplayed())

		{

			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement menButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Men']")));

		Actions act = new Actions(driver);
		act.moveToElement(menButton).perform();

		WebElement tshirtButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='T-Shirts']")));

		act.click(tshirtButton).perform();

		WebElement sliderPrice = driver.findElement(By.xpath("//div[@class='gl5Kwg']"));
		act.dragAndDropBy(sliderPrice, 30, 0);

		driver.close();
	}
}
