package KeywordsDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo {

	@Test(priority = 1)
	void loginTest() {
		Assert.fail();
		System.out.println("1- login successfully");	
	}
	
	@Test(priority = 2, dependsOnMethods = "loginTest")
	void homePageTest() {
		System.out.println("2- home page test");
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
