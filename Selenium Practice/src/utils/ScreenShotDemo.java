package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		int num=124;
		File dest=new File("D:\\Test output\\jequery_demo"+num+".jpg");
		
		FileHandler.copy(scr, dest);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
