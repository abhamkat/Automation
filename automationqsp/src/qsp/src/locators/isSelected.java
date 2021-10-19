package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args)
	{
		
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       driver.manage().window().maximize();
       
       driver.get("file:///C:/Users/ashish/Desktop/Automation/Radio.html");
      WebElement check = driver.findElement(By.xpath("//input[@id='S1']"));
      
      boolean AutomationCheckbox = check.isSelected();
      System.out.println(AutomationCheckbox);
       
 
	}

}
