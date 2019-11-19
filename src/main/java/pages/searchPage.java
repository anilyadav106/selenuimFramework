package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePack.testbase;

public class searchPage extends testbase {

	public searchPage(WebDriver driver) {

		testbase.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchBar;

	@FindBy(xpath = "//cite[text()='https://www.nagarro.com/en']")
	public WebElement nagarroLink;

}
