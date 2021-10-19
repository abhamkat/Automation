package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethodFacebook {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Ashish@12.gmail.com");
		driver.findElement(By.id("m_login_password")).sendKeys("54156555");
		driver.findElement(By.id("signup-button")).click();

	}

}
