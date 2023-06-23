package day3.explicitFluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example1 
{
   public static void main(String[] args) 
   {
	 System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
			
	 driver.get("https://demo.actitime.com/login.do");
		
	 /*implict wait*/
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	 /* identify and enter username, will get 0-30sec to identify the element */
	 driver.findElement(By.id("username")).sendKeys("admin");
		                                   //or
	 //driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
	 /* identify and enter password, will get 0-30sec to identify the element */
	 driver.findElement(By.name("pwd")).sendKeys("manager");
		
     /* identify and click on Login Button, will get 0-30sec to identify the element */
	 driver.findElement(By.id("loginButton")).click();
	    
     //Validate Home Page
	 String ExpectedHomePageTitle="actiTIME - Enter Time-Track";
	    
	 //In Real World, Acti-time HomePage Title changes after sometime, that's why selenium will get Login Page Title
	 //To avoid this we can use conditional wait of selenium
	 
	 //Create an instance of FluentWait class with timeout, polling time(retry) and exception to be ignored
	 FluentWait wait=new FluentWait(driver)
     .withTimeout(Duration.ofSeconds(20))
     .pollingEvery(Duration.ofSeconds(5))
     .ignoring(NoSuchElementException.class);
	 
	 wait.until(ExpectedConditions.titleIs(ExpectedHomePageTitle));
	    
	 String ActualHomePageTitle=driver.getTitle();
	 System.out.println("Actual Home Page Title is: "+ActualHomePageTitle);
	 System.out.println("Expected Home Page Title is: "+ExpectedHomePageTitle);
	    
	 if(ActualHomePageTitle.equals(ExpectedHomePageTitle))
	    {
	      System.out.println("Home Page validation is successfull, logout from Application now");
	        
	      /* identify and click on logout, will get 0-30sec to identify the element */
	      driver.findElement(By.id("logoutLink")).click();
	    }
	  else
	    {
	  	   System.out.println("Home Page validation is failed, not allowed to logout from Application");
	    }
	//driver.close();
	}
}