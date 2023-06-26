package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingPromptPopup extends SeleniumUtility
{
  @Test
  public void testAlert() 
  {
     WebDriver driver=setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	  
	  //Using to Frame using name attribute
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
	  
	  //get text from Alert Popup
	  String alertText=driver.switchTo().alert().getText();
	  System.out.println("Alert Popup msg: "+alertText);
	  
	  //Type Pune in Popup
	  driver.switchTo().alert().sendKeys("PUNE");
	  
	  //Click on OK Button of Alert
	  driver.switchTo().alert().accept();  
	  
	  //Click on Cancel Button of Alert
	  driver.switchTo().alert().dismiss();
  }
}
