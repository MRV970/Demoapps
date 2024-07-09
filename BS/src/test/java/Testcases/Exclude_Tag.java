package Testcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Exclude_Tag {
	@Test
	public void Logintest() {
		System.out.println("Executing login test");
		
		Reporter.log("Logintest", true);
	}
	@Test
	public void Registertest() {
		System.out.println("Executing register test");
		Reporter.log("dddhghjhjhkkkk",true);
		
	}
	@Test
	public void Searchtest() {
		System.out.println("Executing search test");
	}

}
