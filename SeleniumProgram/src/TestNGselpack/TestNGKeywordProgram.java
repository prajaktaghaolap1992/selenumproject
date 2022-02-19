package TestNGselpack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGKeywordProgram
{
	@Test
	public void methodA()
	{
		System.out.println("methodA");
	//	Assert.assertTrue(false);
		//Assert.assertFalse(true);
	}

	
	@Test(dependsOnMethods= {"methodA"})
	public void methodB()
	{
		System.out.println("methodB");
	}
	
	@Test(timeOut=2000)
	public void methodC() throws InterruptedException
	{
		System.out.println("methodC");
		Thread.sleep(5000);
	}
	
	@Test
	public void methodD()
	{
		System.out.println("methodD");
	}
	
	@Test
	public void methodE()
	{
		System.out.println("methodE");
	}
}



