package switching;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingActiveElement extends SeleniumUtility
{
  @BeforeTest
  public void preCondition()
  {
	  setUp("chrome", "https://demo.actitime.com/");
  }
  
  @Test(priority=1)
  public void testMouseFocus() 
  {
	  WebElement element=driver.switchTo().activeElement();
	  String value=element.getAttribute("placeholder");
	  System.out.println("value: "+value);
	  String expectedValue="Username";
	  Assert.assertEquals(value, expectedValue);
  }
  
  @Test(priority=2)
  public void testLoginWithoutIdentifyingElement() 
  {
	  driver.switchTo().activeElement().sendKeys("admin", Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("manager", Keys.ENTER);
	  String expectedTitle="actiTIME - Enter Time-Track";
	  String actualTitle=getCurrentTitleOfApplication(expectedTitle);
	  Assert.assertEquals(actualTitle, expectedTitle);	  
  }
  
  @AfterTest
  public void postCondition()
  {
	  cleanUp();
  }
}

