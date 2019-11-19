package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterTestExcel {

	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {

		System.out.println(username + " " + password + " " + is_correct);
	}

	@DataProvider
	public Object[][] getData() {

		// total no of columns in data should be total no of arguments in test
		// method

		Object[][] data = new Object[2][3];
		data[0][0] = "anil1@test.com";
		data[0][1] = "anil1";

		data[1][0] = "anil2@test.com";
		data[1][1] = "anil2";

		data[2][0] = "anil3@test.com";
		data[2][1] = "anil3";

		return data;

	}
}
