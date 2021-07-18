package mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);

		WebElement login = driver.findElement(By.xpath("//a[text()='Login / Signup']"));

		Actions act = new Actions(driver);

		act.moveToElement(login).perform();
		
		WebElement member = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		
		act.moveToElement(member).perform();
		
		WebElement memLogin = driver.findElement(By.xpath("//a[text()='Sign up']"));

		act.moveToElement(memLogin).click().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
