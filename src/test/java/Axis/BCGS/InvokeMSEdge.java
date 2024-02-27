package Axis.BCGS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeMSEdge {



		public static WebDriver driver;

		public static void main(String[] args) {

			System.setProperty("webdriver.msedge.driver",
					"C:\\Users\\rohit\\OneDrive\\Documents\\edgedriver_win64/msedgedriver.exe");

			driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/");

	}

}
