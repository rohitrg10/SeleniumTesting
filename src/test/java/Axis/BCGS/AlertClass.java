package Axis.BCGS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Gecko.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\geckodriver-v0.34.0-win64/msedgedriver.exe");

		driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement alert = driver.findElement(By.xpath("//input[@name='alert']"));
		alert.click();
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		WebElement confirmation = driver.findElement(By.xpath("//input[@name='confirmation']"));
		confirmation.click();
		Thread.sleep(500);
		
		Alert conf = driver.switchTo().alert();
		conf.dismiss();
		
		WebElement prompt = driver.findElement(By.xpath("//input[@name='prompt']"));
		prompt.click();
		Thread.sleep(500);
		
		Alert pro =driver.switchTo().alert();
		pro.sendKeys("Hey Hello");
		Thread.sleep(500);
		pro.accept();
		
		driver.close();
		
	}

}
