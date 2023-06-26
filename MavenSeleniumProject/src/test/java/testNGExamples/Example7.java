package testNGExamples;

import org.testng.annotations.Test;

public class Example7 
{
  @Test(priority=1)
  public void createNewSavingAccount() 
  {
	  System.out.println("User Successfully Signed In the Application");
	  int i=10/0;
  }
  
  @Test(dependsOnMethods="createNewSavingAccount")
  public void createNewCurrentAccount() 
  {
	  System.out.println("User Successfully Logged in the Application");
  }
  
  @Test(priority=3)
  public void createDematSavingAccount() 
  {
	  System.out.println("User Successfully Logout from the Application");
  }
}

//1 Pass, 1 Fail(Arithmetic), 1 Skip

/*If int i=10/2, then, all 3 methods will Pass, and will get executes, 
1. createNewSavingAccount()
2. createNewCurrentAccount()
3. createDematSavingAccount()
*/
