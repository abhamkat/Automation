package selectTheMultipleDropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectAll {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		
		
		driver.get("file:///C:/Users/ashish/Desktop/Automation/multipledrpodown.html");
		Thread.sleep(5000);
		
		WebElement dropdownDeselect = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownDeselect);
		
		for (int i = 0; i<= 5; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(5000);
			
		}
		sel.deselectAll();
		
		
		
		

	}

}
