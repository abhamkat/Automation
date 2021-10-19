package operationalMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/ashish/Desktop/Automation/single.html");
			Thread.sleep(5000);
			
			WebElement Getfirst = driver.findElement(By.id("menu"));
			Select sel = new Select(Getfirst);
			
			 WebElement getfirstOption = sel.getFirstSelectedOption();
			 String firstResult = getfirstOption.getText();
			 System.out.println(firstResult);
	}

}
