package AssigmentOnDropdown;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class UsinghashSet
 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("file:///C:/Users/ashish/Desktop/Automation/multipledrpodown.html");
			WebElement Element = driver.findElement(By.id("menu"));
			
			Select sel=new Select(Element);
			List<WebElement> optionsOfDropdown = sel.getOptions();
			
			HashSet<String>S =new HashSet<String>();
			for(int i=0;i<optionsOfDropdown.size();i++) 
			{
				 String textofOption = optionsOfDropdown.get(i).getText();
				 S.add(textofOption);
			
			}
			for(String ashish:S)
			{
				System.out.println(ashish);
			}
			
			

	}

}
