package operationalMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOption
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/ashish/Desktop/Automation/single.html");
		Thread.sleep(5000);
		
		WebElement GetAllselected = driver.findElement(By.id("menu"));
		Select sel = new Select(GetAllselected);
		
		for(int a=0;a>7;a++)
		{
			sel.selectByIndex(a);
		}
		
		List<WebElement> allSelect = sel.getAllSelectedOptions();
				for(WebElement ashish:allSelect)
				{
					String textofSelectedOption = ashish.getText();
					System.out.println(textofSelectedOption);
				}
		

}
}