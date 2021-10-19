package ActionClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/ashish/Downloads/dragdrop.html");
		
		WebElement source = driver.findElement(By.xpath("//div  [@id='draggable-2']"));
		WebElement target = driver.findElement(By.xpath("//div  [@id='droppable-2']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

}
