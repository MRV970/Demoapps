package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	//ChromeOptions =new ChromeOptions();
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
	driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	
	//withTimer
	Thread.sleep(1000);
	driver.findElement(By.partialLinkText("With Timer")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	//disappear element
	driver.findElement(By.linkText("With Element Disappear")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder=\"Enter time in seconds\"]")).sendKeys("4");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	Thread.sleep(5000);
	//Disabled element
	driver.findElement(By.linkText("Disabled Element")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("3");
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	Thread.sleep(5000);
	//hidden element
	driver.findElement(By.linkText("Hidden Element")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("2");
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	Thread.sleep(3000);
	
	//page loading
	driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
	Thread.sleep(3000);
	System.out.println("synchronization successful");
	
	driver.quit();
	
	
	
}
}
