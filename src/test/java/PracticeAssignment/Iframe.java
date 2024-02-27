package PracticeAssignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iframe {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
		//driver.switchTo().frame(newFrame);
		Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[2]/a")).click();
	

	}

}
