package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration_Annotation {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@Test
	public void TC1(){
		
		System.out.println("Executing Tc1");
		
		
	}
	@Test
	public void Tc2() {
		System.out.println("Executing Tc2");
	}
	//drdtfhg
	//fghhhgj

}
