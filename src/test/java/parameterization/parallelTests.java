package parameterization;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTests {

	@Parameters({ "browser" })

	@Test(invocationCount = 3, threadPoolSize = 3)

	public void testdata(String browserName) {
		Date d = new Date();

		System.out.println(browserName + "  " + d);

	}

}
