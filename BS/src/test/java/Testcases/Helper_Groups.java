package Testcases;

import org.testng.annotations.Test;

public class Helper_Groups {
	@Test(groups = "SmokeTest")
	public void AddToCart() {
		System.out.println("Executing addtocart");
	}
	@Test(groups = "SmokeTest")
	public void Subscribetest() {
		System.out.println("Executing subscribe test");
	}
	@Test
	public void VoteTest() {
		System.out.println("Executing Vote test");
	}

}
