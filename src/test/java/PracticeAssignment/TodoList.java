package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoList {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='to-do-list']"));
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		web.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
		WebElement Inp = driver.findElement(By.xpath("//input[@type='text']"));
		Inp.sendKeys("Buy a Car");
		System.out.println("DATA ENTERED");
		
		Inp.sendKeys(Keys.ENTER);
		System.out.println("DATA STORED IN TABLE");
		driver.close();
	}
}



