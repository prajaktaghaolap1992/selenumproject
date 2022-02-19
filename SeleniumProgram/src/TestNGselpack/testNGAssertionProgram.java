package TestNGselpack;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class testNGAssertionProgram
{
	@Test
	public void Loginmethod()
	{
		String actualTitle="SwagLabs";
		String expectedTitle="Labs";
		Assert.assertEquals(actualTitle, expectedTitle, "test is passed");
	
		
		String actualurl="URL1";
		String expectedurl="URL1";
		Assert.assertEquals(actualTitle, expectedTitle, "test is fail");
	}
		
@Test
		public void logoutmethod()
		{
			Assert.assertTrue(true);
		}

// soft assertion 
// SoftAssert soft=new SoftAssert();
// public void loginmethod()
// {
//	String actualTitle="Swag Labs";
//	String expectedTitle="Swag labs";
//	soft.assertEquals(actualTitle, expectedTitle, "test is passed");
//	
//	String actualurl="URL1";
//	String expectedurl="URLl";
//	soft.assertEquals(actualTitle, expectedTitle, "test is passed");
//	soft.assertAll();
//}
//	
//@Test
//	public void logoutmethod()
//	{
//		Assert.assertTrue(true);
//		soft.assertAll();
//	}
 
 
 
 
 
}
 
