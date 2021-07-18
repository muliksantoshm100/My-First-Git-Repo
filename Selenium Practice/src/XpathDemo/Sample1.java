package XpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);

		// xpath

		//tagName[@attribute='attributeValue']
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("java");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("25");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
