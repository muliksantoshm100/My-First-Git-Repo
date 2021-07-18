	package mouseEvent;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class Sample1 {
	
		public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	
			// driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(2000);
	
			WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(frame);
	
			Actions act = new Actions(driver);
	
			WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	
			WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	
			// drag and drop
			// act.dragAndDrop(src, dest).perform();
	
			act.clickAndHold(src).
			moveToElement(dest).
			release().
			build().
			perform();
	
			Thread.sleep(3000);
			driver.quit();
		}
	
	}
