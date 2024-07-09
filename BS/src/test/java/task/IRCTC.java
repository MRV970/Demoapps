package task;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys("sbc");
	
	driver.findElement(By.xpath("//strong[contains(text(),'KARNATAKA')]")).click();
     driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).sendKeys("hy");
     driver.findElement(By.xpath("//span[contains(text(),' HYDERABAD DECAN - HYB ')]")).click();
     WebElement all=driver.findElement(By.xpath("//span[@class=\"ui-dropdown-trigger-icon ui-clickable ng-tns-c65-11 pi pi-chevron-down\"]"));
     all.click();
     driver.findElement(By.xpath("//span[text()='Sleeper (SL)']")).click();
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
   WebElement train= driver.findElement(By.xpath("//div[@class=\"dull-back no-pad col-xs-12\"]/descendant::strong[contains(.,' SAMPARK KRANTI (12649)')]"));
	System.out.println(train.getText());
   List<WebElement> links=driver.findElements(By.xpath("(//div[@class=\"white-back no-pad col-xs-12\"])[6]"));
   for(WebElement li:links) {
	   System.out.println(li.getText());
	   
   }
   
   
   
   driver.close();  
	
	
	
}
}
