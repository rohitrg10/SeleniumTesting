package PracticeAssignment;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		System.out.println("Home page opened");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='actions']"));

		js.executeScript("arguments[0].scrollIntoView(true);", web);

		web.click();

		System.out.println("Scrolled to the button");

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, dest).perform();

		System.out.println("Object is Dragged and Dropped!");

		WebElement doubleclick = driver.findElement(By.xpath("//h2[contains(text(),'Double Click Me!')]"));
		builder.doubleClick(doubleclick).perform();
		System.out.println("Object is Double Clicked");

		WebElement hover = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me First!')]"));
		builder.moveToElement(hover).perform();

		WebElement hoveredlink1 = driver
				.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[1]"));
		hoveredlink1.click();

		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		System.out.println("link is hovered on");
		WebElement hover2 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Second!')]"));
		builder.moveToElement(hover2).perform();

		WebElement hoveredlink2 = driver
				.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[2]"));
		hoveredlink2.click();

		alt1.accept();
		System.out.println("link is hovered on");
		WebElement hover3 = driver.findElement(By.xpath("//button[contains(text(),'Hover Over Me Third!')]"));
		builder.moveToElement(hover3).perform();

		WebElement hoveredlink3 = driver
				.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[3]"));
		hoveredlink3.click();

		alt1.accept();
		System.out.println("link is hovered on");
		WebElement hoveredlink4 = driver
				.findElement(By.xpath("(//a[@class='list-alert'][normalize-space()='Link 1'])[4]"));
		hoveredlink4.click();

		alt1.accept();
		System.out.println("Mouse Hovered Successfull");

		WebElement clickhold = driver.findElement(By.xpath("//div[@id='click-box']"));
		builder.clickAndHold(clickhold).perform();

		System.out.println("Box is clicked on");
		driver.close();

	}

}
