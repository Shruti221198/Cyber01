package day4.multipleelementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeCountAndName 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.demoblaze.com/"); 
	driver.manage().window().maximize();
	
	//Get all device list by using findElements(By)
	List <WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
	System.out.println("Total device count: "+deviceList.size());
	
	/*
	//To get specific WebElement from the List
	WebElement firstdevice=deviceList.get(0);
	String firstdevicename=firstdevice.getText();
	System.out.println("First Device Name: "+firstdevicename.get(0).getText());
	*/
	
	//To print all device names one by one using loop
	  for(int i=0; i<deviceList.size(); i++)
	  {
		System.out.println("Device Name: "+deviceList.get(i).getText());
	  }
	
	}
}
