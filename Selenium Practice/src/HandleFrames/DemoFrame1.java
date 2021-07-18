package HandleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame1 {

	public static void main(String[] args) throws InterruptedException {

		// when do we get the NoSuchElementException
		// 1 web-site taking too much time to load
		// 2 if the element is present on any frame
		// 3 if the element is present on any child window pop-up

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		Thread.sleep(2000);

		// frame(Index)
		// driver.switchTo().frame(1);

		// frame(name)
		// driver.switchTo().frame("iframeResult");

		// frame(WebEleMenr)
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frameEle);

		WebElement textEle = driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		System.out.println(textEle.isDisplayed());
		System.out.println(textEle.getText());

		WebElement childFrame = driver.findElement(By.xpath("//iframe[@title='W3Schools Free Online Web Tutorials']"));
		driver.switchTo().frame(childFrame);
		boolean isPhy = driver.findElement(By.xpath("//h1[text()='PYTHON']")).isDisplayed();
		System.out.println(isPhy);

		//// to move selenium focus from child frame to parent frame
		driver.switchTo().parentFrame();
		WebElement textEle2 = driver.findElement(By.xpath("//h1[text()='The iframe element']"));
		System.out.println(textEle2.isDisplayed());
		System.out.println(textEle2.getText());

		// to move selenium focus from frme to main page
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.quit();
	}

}
