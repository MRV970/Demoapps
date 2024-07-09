package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabel {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		//click on Webelement
		driver.findElement(By.xpath("//li[1]")).click();
		//click on linktext
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		//static webtable
		WebElement item=	driver.findElement(By.xpath("//th[contains(text(),'HP')]/../td[4]"));
		Thread.sleep(2000);
	System.out.println(item.getText());
	//dynamic webtable
	driver.findElement(By.xpath("//a[text()='Dynamic Web Table']")).click();
	WebElement price=	driver.findElement(By.xpath("//th[contains(text(),'Apple')]/../td[4]"));
	Thread.sleep(2000);
  System.out.println("price"+price.getText());
  //table with sort
  driver.findElement(By.xpath("//a[text()='Table With Sort']")).click();
  List<WebElement> sort=driver.findElements(By.xpath("//div[contains(@class,'relative top-4 pb-5')]"));
  for(WebElement st:sort) {
	  System.out.println(st.getText());
  }
//  //table with pagination
//  driver.findElement(By.xpath("//a[text()='Table Pagination']")).click();
//  List<WebElement> pages=driver.findElements(By.xpath("//div[contains(@class,'relative shadow-md sm:rounded-lg')]"));
//  List<WebElement>no=driver.findElements(By.xpath("//li[contains(@class,'cursor-pointer ')]"));
//  
//  for(WebElement page:pages) {
//	  for(WebElement nos:no) {
//		  nos.click();
//	  System.out.println(page.getText());
//	  }
//	  
//  }
  //System.out.println(page.gerText());
  
  driver.findElement(By.xpath("//a[text()='Table With Checkbox']")).click();
  driver.findElement(By.xpath("//input[@value='false']")).click();
  
  
  
		
		
	}

}
