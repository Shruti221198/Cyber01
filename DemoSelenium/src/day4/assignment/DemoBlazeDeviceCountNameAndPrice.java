/*
 * 1. Open Browser and Enter DemoBlaze URL
 * 2. Get Device Count
 * 3. Print one by one device name and price
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeDeviceCountNameAndPrice 
{
	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
     
      /*implict wait*/
  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	  
      driver.get("https://www.demoblaze.com/");
      driver.manage().window().maximize();
  	
      List <WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
      List <WebElement> devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
      
      System.out.println("Total device Count :"+deviceList.size());

      for(int i=0; i<deviceList.size(); i++)
      {
    	  /*System.out.println("Device Name: "+deviceList.get(i).getText());
    	  System.out.println("Device Price: "+devicePrice.get(i).getText());
    	  */
    	  //or
    	  System.out.println("Device Details- "+deviceList.get(i).getText() +" : " +devicePrice.get(i).getText());
      }
	}
}
