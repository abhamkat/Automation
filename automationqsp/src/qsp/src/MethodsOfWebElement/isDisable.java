package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisable {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(300);
		WebElement loginbin = driver.findElement(By.xpath("//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')]"));
		
		boolean statusOfLoginButton = loginbin.isEnabled();
	    System.out.println(statusOfLoginButton);
		

	}

}
