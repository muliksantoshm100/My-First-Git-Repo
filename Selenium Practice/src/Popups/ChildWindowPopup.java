package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='  Follow On Twitter ']")).click();
		Thread.sleep(2000);

		//to handle any child we need to move selenium focus to that child window 
		//we need to use a method ie window(String addressOfChildWindow)
		
		//to find the address of window we need to use 
		
		//this method returns a string address which selenium is focusing on
		String main = driver.getWindowHandle();
		System.out.println(main);
		
		//this method returns all the set of strings address which selenium session
		Set<String> allWindows = driver.getWindowHandles();
//		for(String str:allWindows ) {
//			System.out.println(str);
//		}
		
		Iterator<String> itr = allWindows.iterator();
		String mainPage=itr.next();
		String child = itr.next();
		
		
		driver.switchTo().window(child);
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//a[@aria-label='Twitter']"));
		
		boolean isLogo = logo.isDisplayed();
		System.out.println(isLogo);

		driver.findElement(By.xpath("//span[text()='No, thanks']")).click();
		
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(mainPage);
		boolean isMainLogo = driver.findElement(By.xpath("//a[text()='Selenium Easy']")).isDisplayed();
		
		System.out.println(isMainLogo);
		Thread.sleep(3000);
		driver.quit();
	}

}
