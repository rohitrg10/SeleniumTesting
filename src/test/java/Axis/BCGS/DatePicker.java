package Axis.BCGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\chromedriver-win64/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?gclid=CjwKCAiA_tuuBhAUEiwAvxkgTvB0MWEBfioSEt3EDt6jnN16Oq-zmCvuNHAllej0XjvebP64A5JHZRoCE9wQAvD_BwE&cmp=SEM|D|DF|G|Brand|Brand-BrandExact_DT|B_M_Makemytrip_Search_Exact|RSA|673383350821&s_kwcid=AL!1631!3!673383350821!e!!g!!mmt&ef_id=CjwKCAiA_tuuBhAUEiwAvxkgTvB0MWEBfioSEt3EDt6jnN16Oq-zmCvuNHAllej0XjvebP64A5JHZRoCE9wQAvD_BwE:G:s&gad_source=1");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement date = driver.findElement(By.xpath("//p[@data-cy='departureDate']"));
		date.click();
		Thread.sleep(500);
		WebElement date2 = driver.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label=\"Tue Feb 27 2024\"]"));
		date2.click();
		
		driver.close();
	}

}
