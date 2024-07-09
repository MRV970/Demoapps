package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
		driver.findElement(By.xpath("//li[1]")).click();
	
		driver.findElement(By.partialLinkText("Dropdown")).click();
		
		WebElement phone=driver.findElement(By.id("select1"));
		Select obj=new Select(phone);
		obj.selectByValue("+92");
		
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement country=driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
		Select obj1=new Select(country);
		System.out.println(obj1.isMultiple());
		
		obj1.selectByVisibleText("India");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[text()='State']"));
		obj1.selectByIndex(0);
		Thread.sleep(1000);
		obj1.deselectByIndex(0);
		//
		driver.findElement(By.linkText("Search With Select")).click();
//		driver.findElement(By.xpath("(//div[@class=' css-1xc3v61-indicatorContainer'])[2]")).click();
//		driver.findElement(By.xpath("//div[text()='male']")).click();
		driver.findElement(By.linkText("Disabled")).click();
	WebElement gender=	driver.findElement(By.id("optionmale"));
	Select oj=new Select(gender);
	oj.selectByIndex(1);
		
		
		
	}

}
