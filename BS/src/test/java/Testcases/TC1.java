package Testcases;

import org.testng.annotations.Test;

public class TC1 {
	
	
	@Test(dataProvider = "TestData", dataProviderClass = Data_Provider.class)
	public void tc3(String Firstname,String Lastname) {
//		System.out.println(Firstname);
//		System.out.println(Lastname);
	}

}
	