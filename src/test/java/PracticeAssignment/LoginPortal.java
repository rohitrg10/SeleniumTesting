package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		WebElement login = driver.findElement(By.xpath("//h1[contains(text(),'LOGIN PORTAL')]"));
		login.click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}
	
		WebElement user = driver.findElement(By.xpath("//input[@id='text']"));
		user.sendKeys("webdriver");
		System.out.println("username is = webdriver");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("webdriver123");
		System.out.println("password is = webdriver123 ");
		
		WebElement logbut = driver.findElement(By.xpath("//button[@id='login-button']"));
		logbut.click();
		
		Alert alt =driver.switchTo().alert();
		 alt.accept();
		 System.out.println("Validation Successfull");
	}
}
