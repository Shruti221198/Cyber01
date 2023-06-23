package day2.basicobjectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginInApplication 
{
  public static void main(String[] args) 
  {  
	 WebDriver driver=setUp("Firefox");
     //Enter Application URL
	 driver.get("https://www.saucedemo.com/");
	 
	 //Print Page Title
	 System.out.println("Page Title is: "+driver.getTitle());
	 
	 //Enter Username
	 /*Step1: Identify Username field input*/
	 WebElement userNameInputField=driver.findElement(By.id("user-name"));
	 
	 /*Step2: Perform Required Operations*/
	 userNameInputField.sendKeys("standard_user");
	 
	 //Enter Password
	 /*Step1: Identify Password field input*/
	 WebElement PasswordInputField=driver.findElement(By.id("password"));
	 
	 /*Step2: Perform Required Operations*/
	 PasswordInputField.sendKeys("secret_sauce");
	               //or
	 /*Identify Login Button and perform operation at same time. Declare & Initialize at same time*/
	 //driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 
	 //Click on Login Button 
	 /*Step1: Identify Login Button*/
	 WebElement LoginButton=driver.findElement(By.id("login-button"));
	 
	 /*Step2: Perform Required Operations*/
	 LoginButton.click();
	           //or
	/*Identify Login Button and perform operation at same time. Declare & Initialize at same time*/
	//driver.findElement(By.id("login-button")).click();
	 
	 System.out.println("Home Page Title is: "+driver.getTitle());
    
	 //driver.close();
    }
	
    public static WebDriver setUp(String browsername)
	{
	     if(browsername.equalsIgnoreCase("Chrome"))
	     {
		  /*1. Set the required browser driver executable path using:	System.setProperty( key, value); */
		     System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	
		  /*2.After setting the path of driver executable path, Create an instance of required browser*/
		     return new ChromeDriver();
	     }
	     
	     else if(browsername.equalsIgnoreCase("Firefox"))
	     {
		  /*1. Set the required browser driver executable path using:	System.setProperty( key, value); */
		     System.setProperty("webdriver.gecko.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\geckodriver.exe");
		
	   	  /*2. After setting the path of driver executable path, Create an instance of required browser*/
		     return new FirefoxDriver();
	     }
	  
	  return null;
	} 
}
