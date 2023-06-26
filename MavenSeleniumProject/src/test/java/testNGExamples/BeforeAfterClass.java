package testNGExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass 
{
	 @BeforeClass
	 public void beforeClassExample() 
	 {
	    System.out.println("I am before Class");
	 }
	  
	 @Test
	 public void tc1()
	 {
		System.out.println("I am TC1");
	 }
	  
	 @Test
	 public void tc2()
	 {
		System.out.println("I am TC2");
	 }
	  
	 @AfterClass
	 public void afterClassExample()
	 {
		System.out.println("I am after Class");
	 }

}
