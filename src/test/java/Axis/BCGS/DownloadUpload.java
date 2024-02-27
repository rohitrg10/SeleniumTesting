package Axis.BCGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadUpload {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement download = driver.findElement(By.xpath("//input[@name='download']"));
		download.click();
		Thread.sleep(500);
		
		WebElement upload = driver.findElement(By.xpath("//input[@name='upload']"));
		upload.sendKeys("C:\\Users\\rohit\\Downloads\\QA Axis Bank\\New Text Document.txt");
	}

}
