package testNGExamples;

import org.testng.annotations.Test;

public class Example3 
{
  @Test
  public void tc1() 
  {
	  System.out.println("I am TC1");
  }
  
  @Test
  public void tc2()
  {
	  System.out.println("I am TC2");
	  tc3();
  }
  
  public void tc3()
  {
	  System.out.println("I am TC3");
  }
}
