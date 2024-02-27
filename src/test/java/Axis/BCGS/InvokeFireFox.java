package Axis.BCGS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFireFox {


		public static WebDriver driver;

		public static void main(String[] args) {

			System.setProperty("webdriver.Gecko.driver",
					"C:\\Users\\rohit\\OneDrive\\Documents\\geckodriver-v0.34.0-win64/msedgedriver.exe");

			driver = new FirefoxDriver();
			driver.get("https://www.selenium.dev/");

	}

}
