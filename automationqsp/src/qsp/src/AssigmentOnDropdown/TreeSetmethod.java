package AssigmentOnDropdown;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetmethod {

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
		   
		   TreeSet<String>S =new TreeSet<String>();
		   
		   for(int i=0;i<OptionOfDropDown.size();i++)
		   {
			   String textOfOptionTree = OptionOfDropDown.get(i).getText();
			   S.add(textOfOptionTree);
		   }
		   
		   for(String ashish:S)
			{
				System.out.println(ashish);
			}
		   
		   
		   
		

	}

}
