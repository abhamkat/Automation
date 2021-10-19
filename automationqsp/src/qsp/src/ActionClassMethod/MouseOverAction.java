package ActionClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.bluestone.com/");
		WebElement ringtarget = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		 Actions act=new Actions(driver);
		 act.moveToElement(ringtarget).perform();
		 
		//this engagement option is now interactable  (exception)
		 driver.findElement(By.xpath("//a[@title='Engagement Rings']")).click();
		 
		 

	}

}
