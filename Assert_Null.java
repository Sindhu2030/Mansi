package Assertion_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null 
{
  @Test
  public void assertNull()
  {
	  String actResult="abc";
	 // Assert.assertNull(actResult, actResult);
	  Assert.assertNull(actResult,"Failed: act result is not null");
  }
}
