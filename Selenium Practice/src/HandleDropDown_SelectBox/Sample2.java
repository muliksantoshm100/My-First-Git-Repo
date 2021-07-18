package HandleDropDown_SelectBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);

		WebElement btn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		btn.click();
		Thread.sleep(2000);

		// to handle customized list box

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		month.click();

		month.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
//		month.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(2000);
//		month.sendKeys(Keys.ARROW_DOWN);
		
		
		List<WebElement> allMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(allMonth.size());
		
		for(int i=1;i<=3;i++) {
			Thread.sleep(2000);
			month.sendKeys(Keys.ARROW_DOWN);
		}
		
		month.sendKeys(Keys.ENTER);
		Thread.sleep(3000);		
		driver.quit();
	}

}
