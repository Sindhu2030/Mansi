package Assertion_testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass 
{
  @Test
  public void TC()
  {
	  SoftAssert soft=new SoftAssert();
	  boolean actResult=false;
	  soft.assertTrue(actResult, "Failed1: act Result is false");
	  String actResult1="Hi";
	  String expResult1="Hello";
	  soft.assertEquals(actResult1, expResult1,"Failed2:act & exp Results are differ");
	  soft.assertAll();
  }
}
