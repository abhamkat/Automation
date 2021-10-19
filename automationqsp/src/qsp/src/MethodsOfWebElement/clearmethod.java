package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']     ")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee'] ")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='firstName'] ")).sendKeys("Ashish");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='middleName'] ")).sendKeys("gopalrao");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='lastName'] ")).sendKeys("Bhamkar");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='employeeId']")).clear();

	}

}   //clear
