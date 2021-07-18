package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		// to fetch any url of browser
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(3000);
		//to maximize the browser window
		driver.manage().window().maximize();
		
		// to get the website title
		String title = driver.getTitle();
		System.out.println(title);

		// to get the url
		String url = driver.getCurrentUrl();
		System.out.println(url);

		Thread.sleep(5000);
		// to close the browser window
		// driver.close();

		// to terminate all driver sessions/ close all browser windows
		driver.quit();
	}

}
