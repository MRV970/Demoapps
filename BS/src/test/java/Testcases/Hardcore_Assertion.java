package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardcore_Assertion {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		//Assert the application launch
		String title=driver.getTitle();
		//Assert tool class
		
		Assert.assertEquals(title, "Demo Web Shop");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String value=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		//Assert for the given search condition
		
		Assert.assertEquals(value, "SearchVBB", "computers text is not present");
		
		driver.quit();		
		
		
		
	}

}
