package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        WebElement cread = driver.findElement(By.xpath("//span[contains(text(),'Username')] "));
	        String colourCread = cread.getCssValue("color");
	        
	        System.out.println(colourCread);
			
	}

}
