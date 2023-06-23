//Perform Login-Logout Operation of Actitime-Demo Application

package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");
		                         //or
		//driver.findElement(By.id("username")).sendKeys("admin");
		
		WebElement PasswordInputField=driver.findElement(By.name("pwd"));
		PasswordInputField.sendKeys("manager");
		                        //or
		//driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement LoginButton=driver.findElement(By.id("loginButton"));
		LoginButton.click();
		                        //or
		//driver.findElement(By.id("loginButton")).click();
		                       
		//Logout
		driver.findElement(By.id("LogoutLink")).click();
		                        //or
		//driver.findElement(By.linkText("/logout.do")).click();
		
		driver.close();
	}
}


/* 
Open Chrome Browser
Enter Actitime Url
Enter username as admin
Enter password as manager
Click on login
Click on logout
Close Chrome browser
*/
