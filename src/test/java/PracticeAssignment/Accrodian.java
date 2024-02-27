package PracticeAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Accrodian {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("(//a[@id='page-object-model'])[2]"));

		js.executeScript("arguments[0].scrollIntoView(true);", web);

		web.click();
		System.out.println("Scrolling complete");

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement fn1 = driver.findElement(By.xpath("//button[@id='manual-testing-accordion']"));
		fn1.click();
		waitForElementVisibility(By.xpath("//p[@id='hidden-text']"), 10);
		System.out.println("First accordion");

		WebElement fn2 = driver.findElement(By.xpath("//button[@id='cucumber-accordion']"));
		fn2.click();
		waitForElementVisibility(By.xpath("//p[@id='hidden-text']"), 10);
		System.out.println("Second accordion");

		WebElement fn3 = driver.findElement(By.xpath("//button[@id='automation-accordion']"));
		fn3.click();
		waitForElementVisibility(By.xpath("//p[@id='hidden-text']"), 10);
		System.out.println("Third accordion");

		WebElement fn4 = driver.findElement(By.xpath("//button[@id='click-accordion']"));
		fn4.click();
		waitForElementTextToBe(By.xpath("//p[@id='hidden-text']"), "LOADING COMPLETE.", 10);

		WebElement hiddenText = driver.findElement(By.xpath("//p[@id='hidden-text']"));

		if (hiddenText.getText().equals("LOADING COMPLETE.")) {
			WebElement fn5 = driver.findElement(By.xpath("//button[@id='click-accordion']"));
			fn5.click();
			System.out.println("Click 1");
			waitForMillis(500);
			fn5.click();
			System.out.println("Click 2");
			waitForMillis(500);
			fn5.click();
			System.out.println("Click 3");
		} else {
			System.out.println("The hidden text is not 'LOADING COMPLETE'. Skipping the subsequent code.");
		}

		driver.close();
	}

	// Custom method to wait for an element to be visible
	public static void waitForElementVisibility(By by, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	// Custom method to wait for an element's text to be a specific value
	public static void waitForElementTextToBe(By by, String text, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
		wait.until(ExpectedConditions.textToBe(by, text));
	}

	// Custom method to wait for a specific duration in milliseconds
	public static void waitForMillis(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
