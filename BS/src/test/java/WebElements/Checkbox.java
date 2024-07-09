package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
		driver.findElement(By.xpath("//li[1]")).click();
		
		driver.findElement(By.linkText("Check Box")).click();
		
		
		List<WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(all.size());
		for(WebElement allCheck:all) {
			allCheck.click();
			
		}
		driver.findElement(By.linkText("Selected")).click();
		if(driver.findElement(By.id("domain1")).isSelected()) {
			System.out.println("Email selected");
			
			
		}
		//disabled
		driver.findElement(By.linkText("Disabled")).click();
		
//		List<WebElement> disable=driver.findElements(By.xpath("//input[@type='checkbox']"));
//		for(WebElement db:disable) {
			
		
		if(driver.findElement(By.id("domain1")).isEnabled()==false){
			System.out.println("all buttons are enabled");
		}
		else {
			System.out.println("all bts are disabled");
		}
	}
	}

