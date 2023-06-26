package testNGExamples;

import org.testng.annotations.Test;

public class Example4 
{
  @Test(enabled=false)
  public void testCase1() 
  {
	  System.out.println("I am TestCase1");
  }
  
  @Test(enabled=true)
  public void testCase2() 
  {
	  System.out.println("I am TestCase2");
  }
  
  @Test(enabled=true)
  public void testCase3()
  {
	  System.out.println("I am TestCase3");
  }
  
  @Test(enabled=false)
  public void testCase4()
  {
	  System.out.println("I am TestCase4");
  }
  
}
