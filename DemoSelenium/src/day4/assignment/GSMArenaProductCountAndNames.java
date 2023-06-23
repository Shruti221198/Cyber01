/*
 * 1. Open Browser and Enter GSMArena URL
 * 2. Validate Home Page
 * 3. Get Mobile Phone Name Count from Phone Finder
 * 4. Print one by one mobile phone names
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenaProductCountAndNames 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			  
		 driver.get("https://www.gsmarena.com/");
		 driver.manage().window().maximize();
		 
		 /*implict wait*/
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 /* identify classname and click, will get 0-30sec to identify the element */
		 //driver.findElement(By.className("pad")).click();
		 
		 //Identify all Product from Phone Finder and get Product Count
		 List <WebElement> devices=driver.findElements(By.cssSelector("div[class=\"brandmenu-v2 light l-box clearfix\"]>ul>li>a"));
		 System.out.println("Total Devices Count: "+devices.size());
		 
		 for(int i=0; i<devices.size(); i++)
		 {
			 System.out.println("Device Name is "+i+": " +devices.get(i).getText());
		 }
	}

}
