package Axis.BCGS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		// implicit wait will wait for all the elements in the script to load before it could throw 
				//element not found exception

				driver.manage().timeouts().implicitlyWait(20 , TimeUnit.MILLISECONDS);
		//
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Option3");
 
		Thread.sleep(500);
 
		// select by value
 
		sel.selectByValue("OptionFive");
 
		// select by indexing
 
		sel.selectByIndex(1);
		
		driver.close();
 
	}

}
