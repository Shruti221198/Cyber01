package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateColorCode 
{
	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		     
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://demo.actitime.com/login.do");
		  
		  driver.findElement(By.id("loginButton")).click();
		  
		  WebDriverWait wait=new WebDriverWait(driver,20);
		  wait.until(ExpectedConditions.attributeToBe(By.cssSelector(".errormsg"), "class", "errormsg"));
		  
		  WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
		  
		  //selenium get color in RGBA color format
		  String msgColorCode=errorMsg.getCssValue("color");
		  String msgFontSize=errorMsg.getCssValue("font-size");
		  System.out.println("Color Code: "+msgColorCode);
		  System.out.println("Button Font Size: "+msgFontSize);
	}

}
