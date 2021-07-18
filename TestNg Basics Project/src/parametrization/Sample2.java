package parametrization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample2 {

	WebDriver driver;
	
	@Parameters({"browserName","url"})
	@BeforeMethod
	void setup(String browser, String url) {
		
		System.out.println("Start execution");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium files\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Parameters({"userName","password"})
	@Test
	void loginTest(String user, String pass) throws InterruptedException {
		System.out.println("validate login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	void closeAll() {
		driver.close();
	}
}
