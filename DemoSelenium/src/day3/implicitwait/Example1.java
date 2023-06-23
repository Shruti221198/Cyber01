package day3.implicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		/*implict wait*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/* identify and enter username, will get 0-30sec to identify the element */
		driver.findElement(By.name("username")).sendKeys("Admin");
		                                   //or
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		/* identify and enter password, will get 0-30sec to identify the element */
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
	    /* identify and click on Login Button, will get 0-30sec to identify the element */
	    driver.findElement(By.className("orangehrm-login-button")).click();
	                                    //or
       //driver.findElement(By.className("//button[@type='submit']")).click(); -  not working 
	    
	    /* identify and click on user profile, will get 0-30sec to identify the element */
	    driver.findElement(By.className("oxd-userdropdown-name")).click();
	    
	    /* identify and click on logout, will get 0-30sec to identify the element */
	    driver.findElement(By.linkText("Logout")).click();
		
	    /*Close Browser*/
		driver.close();
	}

}
