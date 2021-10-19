package AssigmentOnDropdown;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetMethod {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   ChromeDriver   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	   driver.get("file:///C:/Users/ashish/Desktop/Automation/multipledrpodown.html");
	   WebElement Elements = driver.findElement(By.id("menu"));
	   Select sel = new Select(Elements);
	   List<WebElement> OptionOfDropDown = sel.getOptions();
	   LinkedHashSet<String>S =new LinkedHashSet<String>();
	   
	   for(int i=0;i<OptionOfDropDown.size();i++)
	   {
		   String textOfOptionLinked = OptionOfDropDown.get(i).getText();
		   S.add(textOfOptionLinked);
	   }
	   
	   for(String ashish:S)
		{
			System.out.println(ashish);
		}
	   
	   
	   
	   
	   
		
	}

}
