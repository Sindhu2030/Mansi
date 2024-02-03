package Assertion_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals
{
  @Test
  public void assertnotEquals()
 
  {
	  String actResult="Hi";
	  String expResult="Hi";
	  Assert.assertNotEquals(actResult,expResult,"Failed:both results are same ");
  }
}
