package KeywordsDemo;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	//invocationCount- execute the test case multiple times
	//timeOut
	//depends on method
	//expected exception
	
	@Test(priority = 1)
	void loginTest() {
		System.out.println("1- login successfully");
	}
	
	@Test(priority = 2, invocationCount = 3)
	void homePageTest() {
		System.out.println("2- home page test");
	}
	
	@Test(priority = 3)
	void productPageTest() {
		System.out.println("3- product page test");
	}
	
}
