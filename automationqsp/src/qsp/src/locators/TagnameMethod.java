package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("file:///C:/Users/ashish/Desktop/Automation/anchor%20tag.html");
		
		driver.findElement(By.tagName("input")).clear();
			
		
		
		

	}

}
