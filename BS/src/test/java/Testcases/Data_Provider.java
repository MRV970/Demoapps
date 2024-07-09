package Testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@DataProvider(name="TestData")
	public Object[][] testdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="Rohit";
		data[0][1]="sharma";
		data[1][0]="Virat";
		data[1][1]="Kohli";
		data[2][0]="Shubman";
		data[2][1]="Gill";
		
		
		return data;
		
	}
	
	@Test(dataProvider="TestData")
	public void TC1(String Firstname,String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
		
	}

}
