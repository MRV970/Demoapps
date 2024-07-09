package Testcases;

import org.testng.annotations.Test;

public class Priority_Helper {
	@Test(priority = 2)
	public void LoginTest() {
		System.out.println("Executing login testcase");
	}
	@Test(priority=3)
	public void SearchTest() {
		System.out.println("Executing search testcase");
	}
	@Test(priority = 1)
	public void RegisterTest() {
		System.out.println("Executing register testcase");
	}
	@Test(priority=4)
	public void SubscribeTest() {
		System.out.println("Executing subscribe testcase");
	}

}
