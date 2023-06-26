package testNGExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod 
{
	 @BeforeMethod
	 public void beforeMethodExample() 
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
	  
	 @AfterMethod
	 public void afterMethodExample()
	 {
		System.out.println("User Successfully Logged Out");
	 }
	  
}
