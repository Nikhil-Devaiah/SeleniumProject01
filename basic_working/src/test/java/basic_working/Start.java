package basic_working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) 
	{
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'For my personal use')]")).click();
		
		driver.close();
		
		
		

	}

}
