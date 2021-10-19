package xpathUsingAXES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingIndepedantandDesecdant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/s?k=laptop&ref=nb_sb_noss_2");
		
		Thread.sleep(2000);
		
	    String priceOfLaptop = driver.findElement(By.xpath("//span[.='Lenovo IdeaPad Slim 3 2021 Intel Core i3 11th Gen 14 inches FHD, LED IPS T&L Business, Laptop (8GB/256GB SSD/Windows 10/MS Office/Backlit/Fingerprint Reader/Arctic Grey/1.41kg) 82H700J8IN']/ancestor::div[@class='s-expand-height s-include-content-margin s-latency-cf-section s-border-bottom']/descendant::span[@class='a-price-whole']")).getText();
	  System.out.println(priceOfLaptop);
	
	}

}
