package Axis.BCGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragAndDrop {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(src, dest).perform();
		
		System.out.println("Objet is Dragged and Dropped!");
		
		driver.close();
	}

}
