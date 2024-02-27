package Axis.BCGS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		// explicit wait is used to wait for a particular element based on the expected condition
				// explicit wait - to wait for the compose button to be click-able
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
		// 
				
				
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		System.out.println(rowno.size());
		
		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		System.out.println(colno.size());
		
		WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
		String text = celldata.getText();
		System.out.println(text);
		
		String expecteddata = "tconway@earthlink.net";
		
		if (text.equals (expecteddata))
		{
			System.out.println("The cell data is correct");
		}
		else
		{
			System.out.println("The cell data is not correct");
		}
		driver.close();
		
	}

}
