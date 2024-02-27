package Axis.BCGS;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(700);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		com.google.common.io.Files.copy(f, new File("C:\\Users\\rohit\\OneDrive\\Pictures\\Screenshots\\SS\\ss1.png"));
		
		System.out.println("SS is Capture!");
		
		driver.close();
	}

}
