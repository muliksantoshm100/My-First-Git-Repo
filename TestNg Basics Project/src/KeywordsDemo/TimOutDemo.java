package KeywordsDemo;

import org.testng.annotations.Test;

public class TimOutDemo {

	@Test(priority = 1)
	void loginTest() {
		System.out.println("1- login successfully");
	}

	@Test(priority = 2, timeOut = 3000)
	void homePageTest() throws InterruptedException {
		Thread.sleep(5000);
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
