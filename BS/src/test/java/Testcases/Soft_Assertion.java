package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	@Test
	public void Demo() {
		//create an object of soft assertion
				SoftAssert asrt= new SoftAssert();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		
		asrt.assertEquals(title, "Demo Web Shop");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		  
		String value=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		asrt.assertEquals(value, "Searchmnm");
		//assert all method is mandatory
		//Record all the validations
		
		//asrt.assertAll();
		driver.close();
		asrt.assertAll();
		
		
	}

}
