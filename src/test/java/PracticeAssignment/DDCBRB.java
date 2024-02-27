package PracticeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;

public class DDCBRB {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		WebElement fn = driver.findElement(By.xpath("//a[@id='dropdown-checkboxes-radiobuttons']"));
		fn.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select sel = new Select(dropdown);

		for (int index = 0; index < 4; index++) {
			sel.selectByIndex(index);
			System.out.println("DDM openend and clicked");
		}

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select sel2 = new Select(dropdown2);

		for (int index = 0; index < 4; index++) {
			sel2.selectByIndex(index);
			System.out.println("DDM openend and clicked");
		}

		WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select sel3 = new Select(dropdown3);

		for (int index = 0; index < 4; index++) {
			sel3.selectByIndex(index);
			System.out.println("DDM openend and clicked");
		}

		String[] checkBoxXPaths = { "//input[@value='option-1']", "//input[@value='option-2']",
				"//input[@value='option-3']", "//input[@value='option-4']" };

		String[] dropDownXPaths = { "//input[@value='green']", "//input[@value='blue']", "//input[@value='yellow']",
				"//input[@value='orange']", "//input[@value='purple']" };

		for (String checks : checkBoxXPaths) {
			WebElement checkBox = driver.findElement(By.xpath(checks));
			if (checkBox.isEnabled()) {
				checkBox.click();
				System.out.println("Checkbox clicked");

			} else {
				System.out.println("Checkbox not enabled");
			}
		}

		for (String drops : dropDownXPaths) {
			WebElement ddmBox = driver.findElement(By.xpath(drops));
			if (ddmBox.isEnabled()) {
				ddmBox.click();
				System.out.println("ddm clicked");

			} else {
				System.out.println("ddm not enabled");
			}
		}

		WebElement seldis1 = driver.findElement(By.xpath("//input[@value='lettuce']"));
		seldis1.click();

		WebElement seldis2 = driver.findElement(By.xpath("//input[@value='pumpkin']"));
		seldis2.click();

		WebElement dropdown4 = driver.findElement(By.id("fruit-selects"));
		Select sel4 = new Select(dropdown4);
		sel4.selectByIndex(0);

		sel4.selectByIndex(2);

		sel4.selectByIndex(3);

		System.out.println(" Successfull checked second dropdowns");

		driver.close();
	}

}
