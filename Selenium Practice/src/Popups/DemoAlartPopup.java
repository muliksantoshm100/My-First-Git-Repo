package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlartPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("USERID_101");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Thread.sleep(2000);
		
		Alert ale = driver.switchTo().alert();
		
		String text = ale.getText();
		System.out.println(text);
		//ale.dismiss();
		ale.accept();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
