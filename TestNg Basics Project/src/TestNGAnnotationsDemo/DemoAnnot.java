package TestNGAnnotationsDemo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoAnnot {

	static WebDriver driver;
	
	@BeforeClass
	void setUp() {
		String browser="chrome";
		if(browser=="chrome") {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser=="FF"){
			
		}
	}
	
	@BeforeMethod
	void webSetUp() {
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	void validateFacebookTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	void validateLoginPageLogo() {
		boolean isLogo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(isLogo);
		Assert.assertTrue(isLogo);
	}
	
	@AfterMethod
	void cleanUp() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	void closeAll() {
		driver.close();
	}
	
}
