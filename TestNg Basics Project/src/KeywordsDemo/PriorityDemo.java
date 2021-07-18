package KeywordsDemo;

import org.testng.annotations.Test;

public class PriorityDemo {

	//keyword
	//priority- controls the flow of execution 
	//default priority of each test case is 0
	//highest priority is 0----1,2
	//if 2 or more test methods having same priority then they will execute by alfabeticaly
	
	@Test(priority = 1)
	void loginTest() {
		System.out.println("1- login successfully");
	}
	
	@Test(priority = 2)
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
