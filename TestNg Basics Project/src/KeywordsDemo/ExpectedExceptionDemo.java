package KeywordsDemo;

import org.testng.annotations.Test;

public class ExpectedExceptionDemo {

	@Test(priority = 1)
	void loginTest() {
		System.out.println("1- login successfully");
	}
	
	@Test(priority = 2, expectedExceptions = RuntimeException.class)
	void homePageTest() {
		System.out.println("2- home page test");
		//throw new ArithmeticException();
		System.out.println(20/0);
	}
	
	@Test(priority = 3)
	void productPageTest() {
		System.out.println("3- product page test");
	}
	
	@Test(priority = 4)
	void closeAll() {
		System.out.println("4- close all the drivers");
	}
}
