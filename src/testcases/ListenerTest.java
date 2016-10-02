package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import listeners.ErrorUtil;

public class ListenerTest {
	
	@Test()
	public void test1(){
		System.out.println("Running test1");
	}
	
	@Test
	public void test2(){
		System.out.println("Start of Assertion#1");

		try{
			Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("Assertion failed");
			// write customo code
			ErrorUtil.addVerificationFailure(t);
		}
		
		System.out.println("End of Assertion#1");
		
		System.out.println("Start of Assertion#2");

		try{
			Assert.assertEquals("C", "D");
		}catch(Throwable t){
			System.out.println("Assertion failed");
			// write customo code
			ErrorUtil.addVerificationFailure(t);
		}
		
		System.out.println("End of Assertion#2");
		
	}
	
	@Test(enabled=false)
	public void test3(){
		System.out.println("Running test3");
		throw new SkipException("Skipping test3");
	}
}
