package PracticeAssignment;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TablesAndData {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		System.out.println("Website is openend");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		WebElement login = driver.findElement(By.xpath("//h1[contains(text(),'DATA, TABLES & BUTTON STATES')]"));
		login.click();

		System.out.println("Scrolling complete");

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
		int rowcount = rowno.size();
		System.out.println("Row Counts");
		System.out.println(rowcount);

		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[1]/th"));
		int colcount = colno.size();
		System.out.println("Column Counts");
		System.out.println(colcount);

		WebElement celldata = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[2]/td[1]"));
		System.out.println("Table Values");
		String text = celldata.getText();

		System.out.println(text);
		WebElement Inp1 = driver.findElement(By.xpath("//input[@name='firstname']"));
		Inp1.sendKeys(text);

		WebElement celldata2 = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[2]/td[2]"));
		String text2 = celldata2.getText();

		System.out.println(text2);

		WebElement Inp2 = driver.findElement(By.xpath("//input[@name='lastname']"));
		Inp2.sendKeys(text2);

		WebElement Inp3 = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/form[1]/textarea[1]"));
		Inp3.sendKeys(text + "  " + text2);

		List<WebElement> rownos = driver
				.findElements(By.xpath("//table[@class='table table-light traversal-table']/tbody/tr"));
		int rowscount = rownos.size();
		System.out.println(rowscount);

		List<WebElement> colnos = driver
				.findElements(By.xpath("//table[@class='table table-light traversal-table']/tbody/tr[1]/td"));
		int colscount = colnos.size();
		System.out.println(colscount);

		driver.close();

	}

}
			