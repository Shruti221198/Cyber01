package demo.webdrivermanagerexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class LoginIntoActitime 
{
	public static void main(String[] args) 
	{
      SeleniumUtility s1=new SeleniumUtility();
      WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/");
      
      WebElement userNameInputField=driver.findElement(By.id("username"));
      s1.typeInput(userNameInputField, "admin");
      
      s1.typeInput(driver.findElement(By.name("pwd")), "manager");
      
      s1.clickOnElement(driver.findElement(By.id("loginButton")));
	}

}
