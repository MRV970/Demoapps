package Testcases;

import org.testng.annotations.Test;

public class DependsOnMethods_Helper {
	@Test(dependsOnMethods = "Register")
	public void LoginTest() {
		System.out.println("Executing LoginTestcase");
		
	}
	@Test
	public void SearchTest() {
		System.out.println("Executing Searchtest");
	}
	@Test
	public void Register() {
		System.out.println("Executing Registertest");
	}
	@Test(dependsOnMethods = "SearchTest")
	public void SubscribeTest() {
		System.out.println("Executing Subscribetest");
	}

}
