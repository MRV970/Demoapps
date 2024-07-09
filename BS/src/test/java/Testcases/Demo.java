package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver driver;
	@BeforeTest
	public void launching() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		System.out.println("before");
	}
	@AfterTest
	public void closing() {
		System.out.println("close");
		driver.quit();
		
	}
	@Test
	public void search() {
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println("search");
	}

}
