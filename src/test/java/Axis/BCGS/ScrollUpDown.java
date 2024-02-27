package Axis.BCGS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(700);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement web = driver.findElement(By.xpath("//h3[@class='appDnldCnt__heading']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", web);
		
		/*
		 * Other Way // vertical down scroll (x and y coordinates)
		 * 
		 * js.executeScript("window.scrollBy(0 , 800)", "");
		 * 
		 * // vertical up scroll (x and y coordinates)
		 * js.executeScript("window.scrollBy(0 , -400)", "");
		 * 
		 * Thread.sleep(500); // resizing of the window // horizontal down scroll (x and
		 * y coordinates) js.executeScript("window.scrollBy(200 , 0)", "");
		 * 
		 * // vertical up scroll (x and y coordinates)
		 * js.executeScript("window.scrollBy(-300 , 0)", "");
		 */
		driver.close();
	}

}
