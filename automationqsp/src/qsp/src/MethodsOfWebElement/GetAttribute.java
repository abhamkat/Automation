package MethodsOfWebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Desktop/htmldocswcsm5a/Checkboxes.html");
		WebElement automationCheckBox = driver.findElement(By.id("ch4"));
		String attrvalue = automationCheckBox.getAttribute("name");
		System.out.println(attrvalue);//n4
	}

}



//System.setProperty("webdriver.chrome.driver","./drivers.chormedriver.exe");
//ChromeDriver driver=new ChromeDriver();//
//driver.manage().window().maximize();
//driver.get("file:///C:/Users/ashish/Desktop/Automation/single.html");
//driver.findElement(By.xpath(""))