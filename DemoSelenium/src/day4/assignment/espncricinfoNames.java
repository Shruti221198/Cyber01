/*
 * 1. Open CricInfo.com
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

public class espncricinfoNames 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.espncricinfo.com/");
		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 List <WebElement> ESPNCricInfoTitle =driver.findElements(By.cssSelector("div[class=\"ds-flex ds-flex-row ds-items-center ds-justify-start\"]>*:nth-child(2)>div>div>a"));
		 System.out.println("ESPNCricInfoTitle Count: "+ESPNCricInfoTitle.size());
		 
		 for(int i=0; i<ESPNCricInfoTitle.size(); i++)
		 {
			 System.out.println("ESPNCricInfoTitle Lists "+i+": "+ESPNCricInfoTitle.get(i).getText());
		 }
	}

}
