package XpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);

		// tagName[@attribute='value']
		

		// text()- the contained by element
		// contains()- text/attribute are containing
		// starts-with()
		// index
		// and
		// or
		
		
		//text()
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		// index
		String logText = driver.findElement(By.xpath("//div[@class='_6ltg'][1]")).getText();
		System.out.println(logText);
		
		//contains()
		//driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		driver.findElement(By.xpath("//a[starts-with(text(), 'Create New')]")).click();
		
		
		//driver.findElement(By.xpath("//a[contains(@data-testid, 'open-registration-form-button')]")).click();
		Thread.sleep(2000);
		
		//starts-with
		driver.findElement(By.xpath("//input[starts-with(@name, 'first')]")).sendKeys("Python");
		
		//or
		//input[@type='text' or @name='lastname']
		
		//and
		driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("Java");

		Thread.sleep(5000);
		driver.quit();
	}

}
