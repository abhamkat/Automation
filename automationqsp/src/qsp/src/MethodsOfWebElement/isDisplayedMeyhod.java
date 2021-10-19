package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMeyhod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("http://127.0.0.1/login.do");
		WebElement Textbox = driver.findElement(By.xpath("//input[@name='username']"));
		   boolean statusOf= Textbox.isDisplayed();
		   System.out.println(statusOf);
	}

}///true Ofthe webelement is present
