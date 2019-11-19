package learnselenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basePack.testbase;

public class iFrames extends testbase {

	public static void main(String[] args) {

		testbase.launchbrowser();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.switchTo().defaultContent();
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.close();

	}

}
