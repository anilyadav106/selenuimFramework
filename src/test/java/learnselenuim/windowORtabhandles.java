package learnselenuim;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// before performing any action, you need to switch to that window first- Mind it !
public class windowORtabhandles {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.online.citibank.co.in/");
		String handle1 = driver.getWindowHandle();
		System.out.println("Handle 1 :" + handle1);

		driver.switchTo().frame("vizury-notification-template");

		if (driver.findElement(By.xpath("//div[@id='div-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@id='div-close']")).click();
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

		System.out.println("After logins tabs :" + tabs2.size());

		tabs2.remove(handle1);
		String secondtab = tabs2.get(0);
		driver.switchTo().window(tabs2.get(0));
		driver.findElement(By.xpath("//a[text()='Security tips']")).click();
		ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());

		System.out.println("After opening securitytips tabs :" + tabs3.size());
		tabs3.remove(handle1);
		tabs3.remove(secondtab);
		String thirdtab = tabs3.get(0);
		driver.switchTo().window(thirdtab);
		driver.close();
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());

		System.out.println("After closing securitytips tabs :" + tabs4.size());

		driver.switchTo().window(secondtab);
		driver.close(); // to close 2nd tab
		driver.switchTo().window(handle1);
		driver.findElement(By.xpath("//a[@id='topMnuhomeloans']")).click();

		driver.close();

	}

}
