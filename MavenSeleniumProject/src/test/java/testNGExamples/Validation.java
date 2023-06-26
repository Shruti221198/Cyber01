package testNGExamples;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class Validation extends SeleniumUtility
{
/*
  @Test
  public void testGoogleSearchResultWithIfElse() 
  {
	  setUp("chrome", "https://www.google.com");
	  typeInput(driver.findElement(By.name("q")), "selenium");
	  clickOnElement(driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")));
	  String expectedTitle="selenium1";
	  String actualTitle=getCurrentTitleOfApplication();
	  if(actualTitle.contains(expectedTitle)) 
	  {
		  System.out.println("Test case pass");
	  }
	  else 
	  {
		  System.out.println("test case failed");
	  }
	  cleanUp();
  }
 */ 
  @Test
  public void testGoogleSearchResultWithAsserts() 
  {
	  setUp("chrome", "https://www.google.com");
	  typeInput(driver.findElement(By.name("q")), "selenium");
	  clickOnElement(driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")));
	  String expectedTitle="selenium - Google Search1";
	  String actualTitle=getCurrentTitleOfApplication();
	  
	  //use assert to validate expected and actual result
	  //Assert.assertEquals(actualTitle, expectedTitle);
	  Assert.assertEquals(actualTitle, expectedTitle,"Either google search not happened or page title got changed");
  
	 // Assert.assertTrue(actualTitle.contains("selenium"));
    //Assert.assertTrue(actualTitle.contains("selenium"),"Either google search not happened or page title got changed"); 
	  cleanUp();
  }
}