/*
 * 1. Open Browser and Enter GSMArena URL
 * 2. Validate Home Page
 * 3. Click on Samsung Phone Link present in Phone Finder
 * 4. Get Device Count and Print on Console
 * 3. Print one by one all the Samsung mobile phone names
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GSMArenaSamsungDeviceCountAndName 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
			     
		 driver.get("https://www.gsmarena.com/");
		 driver.manage().window().maximize();
		 
		 /*implict wait*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElement(By.linkText("SAMSUNG")).click();
		                       //OR
		 //driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		                       //OR
		 /*
		 WebElement Samsung=driver.findElement(By.linkText("SAMSUNG"));
		 Samsung.click(); 
		 */
		 
		 //Count of Samsung Devices
		 List <WebElement> SamsungDevices=driver.findElements(By.cssSelector("div[id=\"body\"]>div>*:nth-child(2)>div>ul>li>a"));
		 System.out.println("Samsung Devices Count is: "+SamsungDevices.size());
		 
		//Display one by one Samsung Names
		 for(int i=0; i<SamsungDevices.size(); i++)
		 {
			 System.out.println("Samsung Devices Name "+i+ ": "+SamsungDevices.get(i).getText());
		 }
		 
		 
	}

}
