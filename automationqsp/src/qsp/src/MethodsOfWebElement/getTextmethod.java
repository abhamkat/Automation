package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextmethod {

	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://www.selenium.dev");
			
			WebElement downloudlink = driver.findElement(By.xpath("//a[.='Downloads']"));
			String textOfthelink = downloudlink.getText();
			System.out.println(textOfthelink);

	}

}
//driver.get("https://www.selenium.dev");
//WebElement downloadLink = driver.findElement(By.xpath("//a[.='Downloads']"));
//String textOfTheLink = downloadLink.getText();