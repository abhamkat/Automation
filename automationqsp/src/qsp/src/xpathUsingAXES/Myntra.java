package xpathUsingAXES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tshirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='common-customCheckbox vertical-filters-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Puma']")).click();
		
		
		String PriceOfTshirt = driver.findElement(By.xpath("(//h3[.='Roadster']/ancestor::a[@target='_blank']/descendant::span[@class='product-discountedPrice'])[1]")).getText();
		
		System.out.println(PriceOfTshirt);
		

	}

}
