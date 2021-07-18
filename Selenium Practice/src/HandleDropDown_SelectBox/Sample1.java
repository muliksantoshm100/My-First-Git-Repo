package HandleDropDown_SelectBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
	
		WebElement btn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		btn.click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select monthDrop=new Select(month);
		Thread.sleep(2000);
		//monthDrop.selectByVisibleText("Dec");
		//monthDrop.selectByIndex(2);
		monthDrop.selectByValue("12");
		
		List<WebElement> allMonths = monthDrop.getOptions();
		System.out.println(allMonths.size());
		for(WebElement e:allMonths) {
			System.out.println(e.getText());
		}
		
		System.out.println();
		System.out.println(monthDrop.isMultiple());
		
		Thread.sleep(3000);
		driver.quit();
	}

}
