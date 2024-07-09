package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Include_Tag {
	
	
	WebDriver driver;
	@BeforeTest
	public void launching() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterTest
	public void closing() {
		driver.quit();
	}
	@Test(dependsOnMethods="Registertest")
	public void Logintest() {
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("vcghhbhb@hvhg");
		System.out.println("Executing login test");
	}
	@Test
	public void Registertest() {
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		
		System.out.println("Executing Register test");
	}
	@Test 
	public void SearchTest() {
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		System.out.println("Executing Search Test");
	}
	@Test
	public void SubscribeTest() {
		driver.findElement(By.id("newsletter-email")).sendKeys("cgfh@fhg");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		System.out.println("Executing subscribe Test");
	}

}
