package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Meethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://login.globalglaze.in/");
	    driver.findElement(By.id("ctl00_ContentPlaceHolder1_usernm")).sendKeys("admin");
	    driver.findElement(By.id("adminpassword")).sendKeys("A1235");
        driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_go")).click();
	}

}
