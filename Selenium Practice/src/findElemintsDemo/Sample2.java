package findElemintsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		//open google.com page and find out total number of links are present
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
		
		//for(Datatype var:collection/array)
		
		for(WebElement e:allLinks) {
			System.out.println(e.getText());
		}

		//		for(int i=0;i<allLinks.size();i++) {
//			System.out.println(allLinks.get(i).getText());
//		}
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
