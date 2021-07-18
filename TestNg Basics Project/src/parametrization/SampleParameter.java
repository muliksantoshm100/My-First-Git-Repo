package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleParameter {
	
	@Parameters({"browserName","url","userName","password"})
	@Test
	void test1(String browser, String URL, String name, String pass ) {
		System.out.println("Demo Test 1");
		System.out.println(browser);
		System.out.println(URL);
		System.out.println(name);
		System.out.println(pass);
	}
}
