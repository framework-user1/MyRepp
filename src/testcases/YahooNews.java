package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooNews {
  
  @Test
  public void getNewsLink() {
	  System.out.println("Getting news link");
	  //throw new SkipException("Skipping test due to some failure");
  }

  @Test
  public void readNewsLink() {
	  System.out.println("Reading news link");
  
	  System.out.println("Before assertion text");
      // Assert.assertEquals("100","101");
      try{
    	  Assert.assertTrue(6>10, "Condition failing");
      }catch(Throwable e){
    	  System.out.println("Caught an error");
    	  // Need to use Listeners for reporting errors 
      }
      // Assert.assertFalse(6>1, "Negative test not passing");
      System.out.println("After assertion text");
  }
  
}
