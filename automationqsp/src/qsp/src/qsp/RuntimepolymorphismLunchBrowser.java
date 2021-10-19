package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RuntimepolymorphismLunchBrowser
 {

	public static void main(String[] args)
	{
		WebDriver driver;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browesr name");
		String browserValue=sc.nextLine();
		
		if (browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
		 else if(browserValue.equalsIgnoreCase("firefox"))
			{
				System.setProperty("WebDriver.gecko.driver","./ driver/chromedriver.exe");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
	        }
		 else
		 {
		System.out.println("enter the web browser");
		 }
		
	}
}
