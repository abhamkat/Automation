package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.cowin.gov.in/");
		
		driver.findElement(By.cssSelector("input[id='user_name']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("abcd123");
		
}
	
}