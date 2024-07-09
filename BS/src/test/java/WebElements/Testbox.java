package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbox {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui");
		//click on Webelement
		driver.findElement(By.xpath("//li[1]")).click();
		//click on linktext
		driver.findElement(By.xpath("//section[text()='Text Box']")).click();
		//identifying webelements
		driver.findElement(By.id("name")).sendKeys("mnbhhhj");
		driver.findElement(By.name("email")).sendKeys("n@v123@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("234455");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//without placeholder
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		driver.findElement(By.id("name")).sendKeys("vbv");
		driver.findElement(By.name("email")).sendKeys("cvbv@gh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("23435");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//with tooltip
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		driver.findElement(By.name("name")).sendKeys("ggjh");
		driver.findElement(By.xpath("//input[@title='Enter Your Email']")).sendKeys("cggg@ghghg@gmail");
		driver.findElement(By.id("password")).sendKeys("bvv233");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//multiline text area
		driver.findElement(By.xpath("//li[text()='Multiline Text Area']")).click();
		driver.findElement(By.id("name")).sendKeys("vghhjh");
		driver.findElement(By.name("email")).sendKeys("cvhgh@gfh@");
		driver.findElement(By.id("password")).sendKeys("ghgh123");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		//disabled
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		driver.findElement(By.id("name")).sendKeys("vghhjhfn");
		driver.findElement(By.name("email")).sendKeys("cvhgh@gfh@");
		driver.findElement(By.id("password")).sendKeys("ghgh123");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
	}

}
