package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavascriptScrolling {
	WebDriver driver;
	@BeforeTest
	public void before() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/");
	}
   
//   @Test
//   public void TC1() {
//	   JavascriptExecutor js= (JavascriptExecutor)driver;
//	   js.executeScript("window.scrollBy(0,150)");
//   }
//   @Test
//   public void TC2() {
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	   js.executeScript("window.scrollTo(0,150");
//   }
   @Test
   public void TC3() {
	   WebElement ele =driver.findElement(By.xpath("//button[text()='Subscribe']"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	  
	   js.executeScript("arguments[0].scrollIntoView(false)",ele);
   }
}



