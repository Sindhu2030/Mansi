package Assertion_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_true 
{
  @Test
  public void assertTrue()
  {
	  boolean actResult=false;
	  Assert.assertTrue(actResult,"Failed: act Result is false");
  
  }
}
