package day7.keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingWithClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	    
	    //scrolling down the page
	    for(int i=0; i<6; i++)
	    {
	    	driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
	    	Thread.sleep(1000);
	    }
	    
	    Thread.sleep(2000);
	    //scrolling up the page
	    for(int i=0; i<6; i++)
	    {
	    driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
	    Thread.sleep(1000);
	    }
	}

}
