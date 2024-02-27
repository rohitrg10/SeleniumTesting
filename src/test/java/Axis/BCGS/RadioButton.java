package Axis.BCGS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\rohit\\OneDrive\\Documents\\edgedriver_win64/msedgedriver.exe");

		driver = new EdgeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		if(radio.isEnabled())
		{
			radio.click();
		}
		if(radio.isSelected())
		{
			if(radio.isDisplayed())
			{
			
			}
		}
		driver.close();
		

	}

}
