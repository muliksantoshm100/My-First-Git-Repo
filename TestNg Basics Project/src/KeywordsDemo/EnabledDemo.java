package KeywordsDemo;

import org.testng.annotations.Test;

public class EnabledDemo {

	@Test(priority = 1)
	void loginTest() {
		System.out.println("1- login successfully");
	}
	
	@Test(priority = 2)
	void homePageTest() {
		System.out.println("2- home page test");
	}
	
	@Test(priority = 3, enabled = false)
	void productPageTest() {
		System.out.println("3- product page test");
	}
	
	@Test(priority = 4)
	void closeAll() {
		System.out.println("4- close all the drivers");
	}
}
