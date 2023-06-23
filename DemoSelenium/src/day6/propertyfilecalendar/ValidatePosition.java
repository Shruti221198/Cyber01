package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidatePosition 
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
	   
	   //Get point class object using getLocation method
	   Point errorCordinates=errorMsg.getLocation();
	   
	   //Get x and y co-ordinates based on requirement from point class
	   int errorCordinates_x=errorCordinates.getX();
	   int errorCordinates_y=errorCordinates.getY();
	   System.out.println("Error Msg x Cord: "+errorCordinates_x);
	   System.out.println("Error Msg y Cord: "+errorCordinates_y);
	   
	   //wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
	   WebElement usernameInputField=driver.findElement(By.id("username"));
	   
	   //Get point class object using getLocation method
	   Point usernameInputCordinates=usernameInputField.getLocation();
	   
	   //Get x and y co-ordinates based on requirement from point class
	   int user_x=usernameInputCordinates.getX();
	   int user_y=usernameInputCordinates.getY();
	   System.out.println("Username Input Field X Co-ordinates: "+user_x);
	   System.out.println("Username Input Field Y Coordinates: "+user_y);
	   
	   System.out.println("Is Error Msg getting displayed over username Input Field: "+(errorCordinates_y < user_y));
	}

}
/*Verify, 
 *         1. Password Field is getting displayed below username Input Field.
 *         2. Keep me logged in text is getting displayed next to checkbox.
 *         3. login button is getting displayed right side of keep me logged in text.
*/
