package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWidowPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//a[text()='Follow Twitter & Facebook']")).click();
		Thread.sleep(2000);
		
		Set<String> allPops = driver.getWindowHandles();
		
		System.out.println(allPops.size());//count
		
		Iterator<String> itr = allPops.iterator();
		
		String main=itr.next();
		String child1=itr.next();
		String child2=itr.next();
		System.out.println(main);
		System.out.println(child1);
		System.out.println(child2);
		
		//facebook window
		driver.switchTo().window(child1);
		driver.manage().window().maximize();
		
		System.out.println("Facebook page");
		boolean isFaceBookLogo = driver.findElement(By.xpath("//a[starts-with(@title,'Facebook')]")).isDisplayed();
		System.out.println(isFaceBookLogo);
		driver.close();
		
		driver.switchTo().window(child2);
		System.out.println("twiter page");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='No, thanks']")).click();
		driver.close();
		
		System.out.println("main page");
		driver.switchTo().window(main);
		boolean isMainLogo = driver.findElement(By.xpath("//a[text()='Selenium Easy']")).isDisplayed();
		System.out.println(isMainLogo);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
