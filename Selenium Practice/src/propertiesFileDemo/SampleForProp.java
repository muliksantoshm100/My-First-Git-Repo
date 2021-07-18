package propertiesFileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleForProp {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Santosh\\Desktop\\New folder\\Automation Practice\\Selenium Practice\\src\\propertiesFileDemo\\imp_Data.properties");

		Properties props = new Properties();

		props.load(file);

		String browser = props.getProperty("browserName");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		String url = props.getProperty("url");
		driver.get(url);
		Thread.sleep(3000);
		
		String user = props.getProperty("userName");
		String pass = props.getProperty("password");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
