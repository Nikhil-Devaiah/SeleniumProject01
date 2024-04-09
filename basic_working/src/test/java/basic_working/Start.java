package basic_working;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) 
	{
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/");
		
		driver.close();
		
		

	}

}
