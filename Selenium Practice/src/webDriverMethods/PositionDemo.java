package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		Thread.sleep(3000);

		Point p1 = driver.manage().window().getPosition();

		System.out.println(p1.toString());

		Point p = new Point(400, 400);
		driver.manage().window().setPosition(p);

		Point p3 = driver.manage().window().getPosition();

		System.out.println(p3.toString());

		Thread.sleep(5000);
		driver.quit();
	}

}
