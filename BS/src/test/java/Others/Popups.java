package Others;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//ChromeOptions =new ChromeOptions();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		driver.findElement(By.id("buttonAlert2")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.id("buttonAlert5")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hiddendiv")).click();
	driver.findElement(By.xpath("//section[text()='Authentication']")).click();
	driver.findElement(By.id("AuthLink")).click();
//	
	//	driver.switchTo().window("https://demoapps.qspiders.com/ui/auth?sublist=0");
		//driver.switchTo().window("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		
		//driver.findElement(By.xpath("//section[text()='Hidden division']")).click();

		
		
		
		
	}

}
