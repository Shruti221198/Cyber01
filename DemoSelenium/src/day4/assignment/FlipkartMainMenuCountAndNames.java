/*
 * 1. Open Browser and Enter Flipkart URL
 * 2. Validate Home Page
 * 3. Get Main Menu Option Count
 * 4. Print Main Menu Option Name
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMainMenuCountAndNames 
{
	public static void main(String[] args) 
	{		
	 System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 List <WebElement> Menu=driver.findElements(By.cssSelector("div[class=\"_331-kn _2tvxW\"]>div>div>div>a"));
	 System.out.println("Menu Count listed on top are: "+Menu.size());
	 
	 for(int i=0; i<Menu.size(); i++)
	 {
		System.out.println("Menu Listed are: "+i+": "+Menu.get(i).getText()); 
	 }
	}
}
