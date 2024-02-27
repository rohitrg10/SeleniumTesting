package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClicks {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement web = driver.findElement(By.xpath("(//a[@id='button-clicks'])[1]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		Thread.sleep(600);
		web.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles)
		{
			driver.switchTo().window(windowHandle);
		}
		
		WebElement click1 = driver.findElement(By.xpath("//span[@id='button1']"));
		click1.click();
		Thread.sleep(900);
		System.out.println("CLICKED");

		WebElement cancel1 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]"));
		cancel1.click();
		Thread.sleep(900);

		WebElement click2 = driver.findElement(By.cssSelector("#button2"));
		click2.click();
		Thread.sleep(900);
		System.out.println("CLICKED");

		WebElement cancel2 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[2]"));
		cancel2.click();
		Thread.sleep(900);
		System.out.println("Cancled");

		WebElement click3 = driver.findElement(By.xpath("// span[@id='button3']"));
		click3.click();
		Thread.sleep(900);
		System.out.println("CLICKED");
		
		WebElement cancel3 = driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Close'])[3]"));
		cancel3.click();
		Thread.sleep(900);
		System.out.println("Cancled");

		System.out.println(" Successfull");

		driver.close();
	}

}
