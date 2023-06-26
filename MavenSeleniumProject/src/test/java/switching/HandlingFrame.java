package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingFrame extends SeleniumUtility
{
  @Test
  public void testFrame() 
  {
	  setUp("chrome", "https://jqueryui.com/");
	  clickOnElement(driver.findElement(By.xpath("//a[text()='Draggable']")));
	  
	  //Draggable Element is present inside the frame, so first switch into frame
	  driver.switchTo().frame(0);
	  
	  //WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	  //driver.switchTo().frame(frame);
	  
	  WebElement src = driver.findElement(By.id("draggable"));
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(src, 100, 0).perform();
	  //Once you done with all actions in innerpage and want to perform any operation on main page, then use 
	  driver.switchTo().defaultContent();
	  driver.findElement(By.cssSelector(".logo")).click();
  }
}
