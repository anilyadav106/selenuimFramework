package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.testbase;

public class googleHomePage extends testbase {

	public googleHomePage(WebDriver driver) {

		testbase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	public WebElement searchBar;

}
