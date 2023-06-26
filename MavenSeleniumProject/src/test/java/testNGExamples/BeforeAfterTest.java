package testNGExamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest 
{
  @BeforeTest
  public void beforeTestExample() 
  {
	  System.out.println("User Logged In Successfully");
  }
  
  @Test
  public void testPMICreation()
  {
	  System.out.println("PMI Created Successfully");
  }
  
  @Test
  public void testPMIDeletion()
  {
	  System.out.println("PMI Deleted Successfully");
  }
  
  @AfterTest
  public void afterTestExample()
  {
	  System.out.println("User Successfully Logged Out");
  }
  
}
