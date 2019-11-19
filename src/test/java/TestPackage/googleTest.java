package TestPackage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePack.testbase;
import pages.googleHomePage;
import pages.searchPage;

public class googleTest extends testbase {

	googleHomePage home;
	searchPage search;

	@BeforeTest

	public void setup() {

		launchbrowser();
		driver.get("https://www.google.com/");
		home = new googleHomePage(driver);
		search = new searchPage(driver);
	}

	@Test(priority = 1, alwaysRun = true)

	public void googleSearchPage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(home.searchBar)).click();

		String actualPageTitle = driver.getTitle();

		String expectedPageTitle = "Google";
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "title didnt match search criteria");

	}

	@Test(priority = 2, alwaysRun = true, dependsOnMethods = "googleSearchPage")
	public void nagarroSearchTest() {

		home.searchBar.sendKeys("Nagarro");
		home.searchBar.submit();
		search.nagarroLink.click();

	}

	@AfterTest(enabled = true)
	public void tearDown() {

		driver.close();

	}

}
