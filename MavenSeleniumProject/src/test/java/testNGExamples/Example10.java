package testNGExamples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Example10 
{
  @BeforeSuite
  public void startUp() 
  {
	  System.out.println("********Before Suite********");
  }
  
  @Test
  public void testFB() 
  {
	  System.out.println("User Successfully Logged In FB");
  }
  
  @AfterSuite
  public void endUp() 
  {
	  System.out.println("********After Suite********");
  }
  
}
