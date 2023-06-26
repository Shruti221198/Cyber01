package testNGExamples;

import org.testng.annotations.Test;

public class Example5 
{
  @Test(priority=1)
  public void testSignIn() 
  {
	  System.out.println("User Successfully Signed In Application");
  }
  
  @Test(priority=2)
  public void testLogin()
  {
	  System.out.println("User Successfully Logged In Application");
  }
  
  @Test(priority=3, enabled=false)
  public void testLogout()
  {
	  System.out.println("User Successfully Logged Out from the Application");
  }
}
