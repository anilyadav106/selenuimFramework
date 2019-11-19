package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dragAndDrop {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement source = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/p[text()='Drag me to my target']")));

		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));

		Actions action = new Actions(driver);

		action.dragAndDrop(source, dest).perform(); // drag and drop

	}
}
