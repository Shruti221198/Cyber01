package day3.browserOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
  public static void main(String[] args) 
  {
	/*set required browser driver executable path using System.setProperty(key,value);*/
    System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	
    /*create instance of required browser class*/
    WebDriver driver=new ChromeDriver();
    
    /*implicitWait*/
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
	/*Enter the required URL*/			
	driver.get("https://demo.automationtesting.in/Register.html");
	
	/*maximize browser window*/
	driver.manage().window().maximize();
	
	/*It will hold the next action till the time is over*/
	//Thread.sleep(1500);
	
	/*Set required browser size (minimize browser window)*/
	driver.manage().window().setSize(new Dimension(700, 200));
	
	/*maximize browser window*/
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("WebTable")).click();
	
	/*to come back to the previous page*/
	driver.navigate().back();
	
	/*to move to next page*/
	driver.navigate().forward();
	
	/*to refresh current page*/
	driver.navigate().refresh();
		
	/*to move to different applications*/
	driver.navigate().to("https://www.google.com");
	
	
  }
}
