package WaitsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		FluentWait<WebDriver> wait=new FluentWait(driver);
		
		wait.withTimeout(30, TimeUnit.SECONDS)
		//wait.pollingEvery(3, TimeUnit.SECONDS);
		.ignoring(NoSuchFieldException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Python");
		
		driver.close();
		
	}

}
