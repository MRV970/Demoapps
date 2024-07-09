package Testcases;

import org.testng.annotations.Test;

public class Group_Helper {
	@Test(groups="SmokeTest")
	public void Logintest() {
		System.out.println("Executing login test");
	}
	@Test(groups = "SmokeTest")
	public void Registertest() {
		System.out.println("Executing register test");
	}
  @Test
  public void Searchtest() {
	  System.out.println("Executing Search test");
  }
}
