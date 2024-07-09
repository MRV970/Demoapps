package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Nested with Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		System.out.println("switching to frame");
		
	   String email=driver.findElement(By.xpath("//div[@class='form_container']//p[text()='Admin@gmail.com']")).getText();
	   String pwd=driver.findElement(By.xpath("//div[@class='form_container']//p[text()='Admin@1234']")).getText();
	   String cp=driver.findElement(By.xpath("(//div[@class='form_container']//p[text()='Admin@1234'])[2]")).getText();
		//switch to child
//	   Thread.sleep(3000);
	   driver.switchTo().frame(0);
	   driver.switchTo().frame(0);
	//   Thread.sleep(5000);
	   System.out.println("switching");
	   driver.findElement(By.id("email")).sendKeys(email);
	//   Thread.sleep(2000);
	   //switch back to parent
	   driver.switchTo().parentFrame();
	   //switch to child2
	//   Thread.sleep(1000);
	   driver.switchTo().frame(1);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	   //switch to parent
	   driver.switchTo().parentFrame();
	   //switch to child3
	   driver.switchTo().frame(2);
	   driver.findElement(By.id("confirm")).sendKeys(cp);
	   //switch back to inner frame
	   driver.switchTo().parentFrame();
	   //switch to child 4
	   driver.switchTo().frame(3);
	   driver.findElement(By.id("submitButton")).click();
	   
	   
	   
	   
	   
		
	}

}
