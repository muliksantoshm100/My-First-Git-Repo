package TestNGAnnotationsDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {

	/*
	 * @BeforeSuite
	 * @BeforeTest
	 * @BeforeClass
	 * 
	 * @BeforeMethod
	 * @Test 1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test 2
	 * @AfterMethod
	 * 
	 * @AfterClass
	 * @AfterTest
	 * @AfterSuite
	 * 
	 * @BeforeGroups
	 * @AfterGroups
	*/
	
	
	//preconditions annotations
	
	//postconditions annotations
	@BeforeSuite
	void getData() {
		System.out.println("Before Suite");
		System.out.println("data from properties file/excel logic");
	}
	
	@BeforeTest
	void setBrowser() {
		System.out.println("Befor Test");
		System.out.println("browser task");
	}
	
	@BeforeClass
	void setTime() {
		System.out.println("Befor class");
		System.out.println("time out / waits setup");
	}
	
	@BeforeMethod
	void testSetup() {
		System.out.println("Before Method+++++++++");
		System.out.println("test case setup");
	}
	
	@Test
	void test1() {
		System.out.println("Test1 methos");
	}
	
	@Test
	void test2() {
		System.out.println("Test2 methos");
	}
	
	
	//post conditions
	
	@AfterMethod
	void testCloser() {
		System.out.println("After Method+++++++++");
		System.out.println("test case closer");
	}
	
	
	@AfterClass
	void demoAfterClass() {
		System.out.println("After class");
	}
	
	@AfterTest
	void demoAfterTest() {
		System.out.println("After test anno");
	}
	
	
//	@AfterSuite
//	void demoAfterSuite() {
//		System.out.println("AfterSuite");
//	}

	@BeforeGroups
	void demoBeforeGroup() {
		System.out.println("before group");
	}
	
	@AfterGroups
	void demoAfterGroup() {
		System.out.println("After group");
	}
	
}
