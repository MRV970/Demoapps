package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Nested iframe")).click();
		
		Thread.sleep(2000);
		//switch to iframe
		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("class='form_container'");
		
		WebDriver rootFrame = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]")));
		WebElement email=driver.findElement(By.xpath("//div[@class=\"form_container\"]//p[text()='Admin@gmail.com']"));
		WebElement pwd=driver.findElement(By.xpath("(//div[@class=\"form_container\"]//p[text()='Admin@1234'])[1]"));
		WebElement cpwd=driver.findElement(By.xpath("(//div[@class=\"form_container\"]//p[text()='Admin@1234'])[2]"));
		String e=email.getText();
		String p=pwd.getText();
		String cp=cpwd.getText();
		//switch to child
		driver.switchTo().frame(0);
	//	WebElement frame=driver.findElement(By.xpath("//div[@class='flex justify-center items-center h-screen bg-gray-100']"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(e);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p);
		
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(cp);
		
		
		
		
		//WebDriver frame=driver.switchTo().frame("driver")
		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("cgghhjj");
//		Actions ac=new Actions(driver);
//		ac.sendKeys(Keys.TAB).perform();
		
		
		
		
	}

}
