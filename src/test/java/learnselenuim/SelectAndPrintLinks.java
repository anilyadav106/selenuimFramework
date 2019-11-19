package learnselenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAndPrintLinks {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https:www.amazon.com");

		/*
		 * WebElement elem = driver.findElement(By.id("searchDropdownBox"));
		 * 
		 * Select sel = new Select(elem);
		 * 
		 * List<WebElement> elems = sel.getOptions();
		 * 
		 * System.out.println("Total elements in searchbox are :" +
		 * elems.size());
		 */
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total links on page are " + links.size());
		for (WebElement link : links) {

			System.out.println("Links are " + link);
		}

	}

}
