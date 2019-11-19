package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterTest {

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {

		System.out.println(username + " " + password);
	}

	@DataProvider
	public Object[][] getData() {

		// total no of columns in data should be total no of arguments in test
		// method

		Object[][] data = new Object[3][2];
		data[0][0] = "anil1@test.com";
		data[0][1] = "anil1";

		data[1][0] = "anil2@test.com";
		data[1][1] = "anil2";

		data[2][0] = "anil3@test.com";
		data[2][1] = "anil3";

		return data;

	}
}
