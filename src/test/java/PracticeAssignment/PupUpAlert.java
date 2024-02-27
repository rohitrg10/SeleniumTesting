package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PupUpAlert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='popup-alerts']"));
		
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
		System.out.println("Clicked on click1 successfully");
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Clicked on popup alert(ok) successfully");
		
		WebElement click2 = driver.findElement(By.xpath("//span[@id='button2']"));
		click2.click();
		Thread.sleep(900);
		System.out.println("Clicked on click2 successfully");
		
		WebElement click2modal = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
		click2modal.click();
		Thread.sleep(900);
		
		WebElement click4 = driver.findElement(By.xpath("//span[@id='button4']"));
		click4.click();
		Thread.sleep(900);
		System.out.println("Clicked on click4 successfully");
		alt.accept();
		Thread.sleep(800);
		System.out.println("Clicked on popup alert(ok) successfully");
		click4.click();
		Thread.sleep(900);
		alt.dismiss();
		System.out.println("Clicked on popup alert(cancel) successfully");
		driver.close();

		
		
	}

}
