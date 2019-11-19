package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptInjection {

	public static void main(String[] args) {

		String driverPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", driverPath + "/src/main/resources/drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()"); // thats a function added in document
											// by JS developer
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
		driver.close();
	}

}
