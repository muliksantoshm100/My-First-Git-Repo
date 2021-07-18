package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//to fetch the url
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//to redirect at the url
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		//to go backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		//to go forward 
		driver.navigate().forward();
		
		//to refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
