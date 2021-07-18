package Validations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample1_Hard_Assert {

	// Hard assert
	// when any assertion got failed in a test method then it will stop the test
	// method execution
	// it will not execute bellow statements

	// Assert.assertEquals("Actual", "Expected");
	// Assert.assertTrue(boolean);

	// Soft assert
	// when any assertion got failed in a test method then it continue test method
	// execution and
	// it will combine all result and give pass of fail marker

	SoftAssert soft;

	@Test
	void test1() {
		System.out.println("Start test 1");
		String title = "Welcome";

		Assert.assertEquals(title, "Welcome");// hard assert

		System.out.println("assertion complete");

		boolean isLogo=false;
		Assert.assertTrue(isLogo);
		System.out.println("END test 1");
	}

	@Test
	void test2() {
		soft = new SoftAssert();
		System.out.println("Start test2");

		soft.assertTrue(true);// pass
		System.out.println("pass");
		soft.assertEquals("welcome", "WELCOME");// failed
		System.out.println("failed");
		soft.assertEquals(10, 11);//failed
		System.out.println("failed 1");

		System.out.println("End test2");
		soft.assertAll();// this method will combine all results and mark test case as pass/fail
	}
}
