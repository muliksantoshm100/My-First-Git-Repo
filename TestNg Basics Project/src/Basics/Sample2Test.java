package Basics;

import org.testng.annotations.Test;

public class Sample2Test {

	@Test
	void loginTest() {
		System.out.println("login successfull.......");
	}
	
	@Test
	void homePageTest() {
		System.out.println("home page test............");
	}
	
	@Test
	void productPageTest() {
		System.out.println("product page");
	}
	
	@Test
	void closeAll() {
		System.out.println("close all pages/browser");
	}
	
}
