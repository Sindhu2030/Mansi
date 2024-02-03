package Assertion_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals   //explaination
{
  @Test
  public void assertEquals()
  {
	  String actResult="Hi";
	  String  expResult="Hi";
	 Assert.assertEquals(actResult, expResult,"Failed:act & Exp Results are different:");
  }
}
