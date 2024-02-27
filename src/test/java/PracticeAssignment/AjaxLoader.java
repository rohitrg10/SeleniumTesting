package PracticeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxLoader {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'CLICK ME!')]")));
		
		
		 WebElement clickme=driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]"));
		clickme.click();
		
		
		WebElement ajaxclose=driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Close'])[1]")));
		ajaxclose.click();
		
		System.out.println("Ajax Loader has been loaded successfully and clicked on click me");

	}

}