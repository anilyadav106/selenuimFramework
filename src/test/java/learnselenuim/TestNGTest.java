package learnselenuim;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGTest {

	@Test(priority = 1, alwaysRun = true)
	public void registrationTest() {
		// System.out.println("User registered");

	}

	@Test(priority = 2, dependsOnMethods = { "registrationTest" })
	public void signInTest() {
		// System.out.println("Sign in");
	}

	@Test(priority = 3)
	public void hardAssertTest() {
		// use hard assert if test case priority is high and if any step gets
		// failed, dont execute further
		System.out.println("Begininng");
		String expected = "Yahoo";
		String actual = "Yahoo";

		System.out.println("Validating title");
		Assert.assertEquals(actual, expected, "Seems title not matched");

		System.out.println("Validating image");
		Assert.assertEquals(true, true, "Seems image not matched");

		System.out.println("Validating textbox");
		Assert.assertEquals(true, true, "Seems textbox not matched");

		System.out.println("Ending");
	}

	@Test(priority = 4)
	public void softAssertTest() {

		SoftAssert softassert = new SoftAssert(); // use soft assert class, for
													// low priority test cases
													// and all test case steps
													// will be executed no
													// matter if previous steps
													// failed

		System.out.println("Begininng");
		String expected = "Yahoo";
		String actual = "google";

		System.out.println("Validating title");
		softassert.assertEquals(actual, expected, "Seems title not matched");

		System.out.println("Validating image");
		softassert.assertEquals(true, false, "Seems image not matched");

		System.out.println("Validating textbox");
		softassert.assertEquals(true, false, "Seems textbox not matched");

		System.out.println("Ending");

		softassert.assertAll(); // will fail the test case also, in its absence
								// test case will be passed. Also with its
								// persence all assertion failures will be
								// reported in testNG report

	}

}
