package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui");
		//click on Webelement
		driver.findElement(By.xpath("//li[1]")).click();
		//click on buttons
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.id("btn3")).click();
		driver.findElement(By.id("btn6")).click();
		//rightclick
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		WebElement rt1=driver.findElement(By.id("btn30"));
		Actions action=new Actions(driver);
		action.contextClick(rt1).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement rt2=driver.findElement(By.id("btn31"));
		action.contextClick(rt2).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		WebElement rt3=driver.findElement(By.id("btn32"));
		action.contextClick(rt3).perform();
		driver.findElement(By.xpath("//div[text()='3']")).click();
		//double click
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement dt1=driver.findElement(By.id("btn21"));
		
		action.doubleClick(dt1).perform();
		
		WebElement dt2=driver.findElement(By.id("btn22"));
		action.doubleClick(dt2).perform();
		
		WebElement dt3=driver.findElement(By.id("btn26"));
		action.doubleClick(dt3).perform();
		
		//submit click
		driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		driver.findElement(By.id("sat1")).click();
		driver.findElement(By.xpath("//button[@id='btn40']")).submit();
		driver.findElement(By.id("prob2")).click();
		driver.findElement(By.xpath("//button[@id='btn41']")).submit();
		driver.findElement(By.id("r1")).click();
		driver.findElement(By.xpath("//button[@id='btn42']")).submit();
		//disabled
		driver.findElement(By.xpath("//a[text()='Disabled']")).click();
		driver.findElement(By.id("btn11")).click();
		driver.findElement(By.id("btn12")).click();
		driver.findElement(By.id("btn16")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("submitButton")).click();
		
		}

}
