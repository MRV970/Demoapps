package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Prameters_Test {
	
	@Parameters({"URL","Search"})
	@Test
	public void searchtest(String url, String search) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.close();
		
	}
	

}
