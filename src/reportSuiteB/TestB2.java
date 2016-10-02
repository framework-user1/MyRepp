package reportSuiteB;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestB2 {

	@Test
	public void testB2_1(){
		System.out.println("Inside suiteA.testB2_1");
	}
	
	@Test
	public void testB2_2(){
		System.out.println("Inside suiteA.testB2_2");
		throw new SkipException("Skipping test due to some failure");
	}
	
	@Test
	public void testB2_3(){
		System.out.println("Inside suiteA.testB2_3");
		Assert.fail("Faliure Message");
	}
}
