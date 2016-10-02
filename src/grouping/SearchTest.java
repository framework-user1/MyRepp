package grouping;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.Data_Provider_Utility;

public class SearchTest {

	@DataProvider
	@Test(priority=1, dataProviderClass=Data_Provider_Utility.class, dataProvider="searchDataProvider")
	public void domesticSearch(String start, String dstn){
		System.out.println(start + " - " + dstn);
	}
	
	@Test(priority=2, dataProviderClass=Data_Provider_Utility.class, dataProvider="searchDataProvider")
	public void intlSearch(String start, String dstn){
		System.out.println(start + " - " + dstn);
	}
}
