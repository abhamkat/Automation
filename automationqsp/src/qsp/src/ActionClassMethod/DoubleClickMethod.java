package ActionClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/ashish/Downloads/doubleclick.html");
		WebElement target = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		
	}

}
