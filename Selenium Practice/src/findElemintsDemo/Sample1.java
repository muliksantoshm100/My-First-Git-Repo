package findElemintsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		
		WebElement btn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		
		btn.click();
		Thread.sleep(2000);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
