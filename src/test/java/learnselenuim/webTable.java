package learnselenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("The no of rows are :" + rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]//td"));
		System.out.println("The no of columns are :" + columns.size());
		for (int i = 1; i <= rows.size(); i++) {

			for (int j = 1; j <= columns.size(); j++) {
				System.out
						.print(driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]"))
								.getText() + "  ");

			}
			System.out.println();
		}
		driver.close();
	}

}
