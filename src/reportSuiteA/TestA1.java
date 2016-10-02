package reportSuiteA;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestA1 {

	@Test
	public void testA1_1(){
		System.out.println("Inside suiteA.testA1_1");
	}
	
	@Test
	public void testA1_2(){
		System.out.println("Inside suiteA.testA1_2");
		Assert.fail("Faliure Message");
	}
	
	@Test
	public void testA1_3(){
		System.out.println("Inside suiteA.testA1_3");
		throw new SkipException("Skipping test due to some failure"); 
	}
}
