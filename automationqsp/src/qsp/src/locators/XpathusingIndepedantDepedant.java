package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathusingIndepedantDepedant {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']  ")).sendKeys("samsang");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		String priceOfMobile = driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']    ")).getText();
		
        System.out.println(priceOfMobile);
	}

}
