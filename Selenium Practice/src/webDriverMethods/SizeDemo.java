package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(3000);
		
		Dimension d2 = driver.manage().window().getSize();
		System.out.println(d2.toString());
		
		Dimension d=new Dimension(800, 700);
		
		driver.manage().window().setSize(d);
		
		Dimension d3 = driver.manage().window().getSize();
		System.out.println(d3.toString());
		
		Thread.sleep(5000);
		driver.quit();
	}

}
