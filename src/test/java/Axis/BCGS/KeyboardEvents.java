package Axis.BCGS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		
		Actions builder = new Actions(driver);
		Action series = builder.moveToElement(email).click().keyDown(email,Keys.SHIFT).sendKeys(email, "rohitrg000").build();
		series.perform();
		
		driver.close();
	}

}
