package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobutton {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
		driver.findElement(By.xpath("//li[1]")).click();
		
		driver.findElement(By.partialLinkText("Radio Button")).click();
		
		//default
		driver.findElement(By.xpath("//input[@value='Upi']")).click();
		//selected Radio button
	List<WebElement> radio=	driver.findElements(By.xpath("//input[@type='radio']"));
	for(WebElement rdbt:radio) {
		rdbt.click();
		
	}
		//driver.findElement(By.xpath("//button[@type='submit']")).submit();
	//selected
	driver.findElement(By.partialLinkText("Selected")).click();
	driver.findElement(By.xpath("//input[@value='upi']")).click();
		System.out.println("working");
		driver.findElement(By.partialLinkText("Disabled")).click();
		if(driver.findElement(By.xpath("//a[text()='Disabled']")).isEnabled()) {
			System.out.println("radio button is disabled");
		}
	}

}
