package testNGExamples;

import org.testng.annotations.Test;

public class Example6 
{
  @Test(invocationCount=3)
  public void testSignIn() 
  {
	  System.out.println("User Successfully Signed In the Application");
  }
}
