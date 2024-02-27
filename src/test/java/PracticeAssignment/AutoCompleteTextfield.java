package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoCompleteTextfield {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='autocomplete-textfield']"));

		js.executeScript("arguments[0].scrollIntoView(true);", web);
		Thread.sleep(600);
		web.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
			
		}
		WebElement autocompleteField = driver.findElement(By.id("myInput"));
		autocompleteField.sendKeys("App");
		
		

	}

}
