package Axis.BCGS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		List <WebElement> checkall = driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		for(WebElement wb : checkall)
		{
			wb.click();
		}
		Thread.sleep(800);
		
		WebElement wb2 = driver.findElement(By.xpath("//input[@type='button']"));
		if(wb2.isEnabled())
		{
			wb2.click();
		}
			
		driver.close();

	}

}
