package testNGExamples;

import org.testng.annotations.Test;

public class Example8 
{
  @Test(priority=1, expectedExceptions=ArithmeticException.class)
  public void testSignIn() 
  {
	  int i=10/0;
	  System.out.println("User Successfully Signed In the Application");
  }
  
  @Test(priority=2, description="This is Login Method")
  public void testLogin()
  {
	  System.out.println("User Successfully Logged in the Application");
  }
  
  @Test(priority=3, timeOut=2000)
  public void testLogout() throws InterruptedException
  {
	  System.out.println("User Successfully Logged Out from the Application");
	  Thread.sleep(3000);
  }
  
}
