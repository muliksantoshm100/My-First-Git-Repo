package findElemintsDemo;

import java.io.Serial;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone 12");
		
		//NoSuchElementException
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		//empty list created
		List<WebElement> allName = driver.findElements(By.xpath("//a[@class='a-link-normal a-text-normal']"));
		System.out.println(allName.size());
		
		for(WebElement e:allName) {
			System.out.println(e.getText());
		}
		
		//xpath for prices
		//span[@class='a-price-whole']
		Thread.sleep(5000);
		driver.quit();
	}

}
