package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation_ThreadPoolSize {
@Test(invocationCount=5,threadPoolSize  = 4 )
public void Tc1() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.close();
}
}
