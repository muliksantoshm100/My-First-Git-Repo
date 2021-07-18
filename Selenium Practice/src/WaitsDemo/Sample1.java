package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1 implicit wait
		//2 explicit wait
		//3 fluent wait
		//4 pageLoadTimeout
		
		//1 implicit wait
		//wait till all the elements are present on the web page
		//if the page is load in 2 sec it will skip remain sec, bt if it is not loaded
		//in given time it will a timeout exception/can NoSuchElementException
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Java");
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		driver.quit();
	}

}
