package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowRoot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow Root Elements')]")).click();
		driver.findElement(By.xpath("//section[text()='Shadow Root']")).click();
		
		//shadow host
		Thread.sleep(2000);
		SearchContext shadow_host=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadow_host.findElement(By.cssSelector("input[type='text']")).sendKeys("cvcgghv");
		Thread.sleep(2000);
		SearchContext shadow_host_password=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
		shadow_host_password.findElement(By.cssSelector("input[type='text']")).sendKeys("234rtfg");
		//close root
		driver.findElement(By.linkText("Close Shadow Root")).click();
		driver.findElement(By.xpath("//h1[text()='Login']"));
		Actions action =new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys("bhghh").perform();
action.sendKeys(Keys.TAB).perform();
		action.sendKeys("asdsdf@123").perform();
		
		
		
		

	}

}
