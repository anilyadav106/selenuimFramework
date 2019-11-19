package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramsFromTestNGXML {

	@Parameters({ "browser", "os" })

	@Test

	public void testdata(String browserName, String osName) {

		System.out.println(browserName + "---" + osName);

	}

}
