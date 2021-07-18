package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		//id (1)
		WebElement emailBox = driver.findElement(By.id("email"));
		
		emailBox.sendKeys("test123@gmail.com");
		Thread.sleep(2000);
		
		//linkText (6)
		WebElement newAcc = driver.findElement(By.linkText("Create New Account"));
		
		newAcc.click();
		
		Thread.sleep(2000);
		
		//name (4)
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		firstName.sendKeys("Java");
		Thread.sleep(2000);
		
		//partialLinText (7)
		WebElement cookie = driver.findElement(By.partialLinkText("Cookie Pol"));
		String text1 = cookie.getText();
		System.out.println(text1);
		//cookie.click();
		
		//tagName (8)
		WebElement firstinputTag = driver.findElement(By.tagName("input"));
		boolean isDip = firstinputTag.isDisplayed();
		System.out.println(isDip);
		
		Thread.sleep(2000);
		//className (5)
		WebElement close = driver.findElement(By.className("_8idr"));
		close.click();

		Thread.sleep(2000);
		
		//cssSelector (3)
		//works of ID/ Class
		// #idValue
		// .classValue
		WebElement pass = driver.findElement(By.cssSelector("#pass"));
		pass.sendKeys("Python@123");
		
		WebElement newPage = driver.findElement(By.cssSelector("._8esh"));
		newPage.click();
		
		//xpath (2)
		
		Thread.sleep(5000);
		driver.quit();
	}

}
