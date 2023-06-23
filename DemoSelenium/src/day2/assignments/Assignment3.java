//Perform Login-Logout Operation of OrangeHRM-Demo Application

package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		                                   //or
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
	    driver.findElement(By.name("password")).sendKeys("admin123");
		
	    //driver.findElement(By.className("orangehrm-login-button")).click();
	                                    //or
       //driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		driver.close();
	}

}
