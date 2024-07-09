package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
//	driver.findElement(By.xpath("//li[1]")).click();
//	Thread.sleep(1000);
	driver.findElement(By.xpath("//section[text()='Keyboard Actions']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Keyboard']")).click();
	Actions action =new Actions(driver);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bnbbh");
	//Actions action =new Actions(driver);
	
	action.sendKeys(Keys.TAB).perform();
	Thread.sleep(1000);
	action.sendKeys("asdsdf@123").perform();
	action.sendKeys(Keys.TAB).perform();
	Thread.sleep(1000);
	action.sendKeys("asdsdf@123").perform();

}}
