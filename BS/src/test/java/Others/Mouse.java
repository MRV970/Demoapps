package Others;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[1]")).click();
driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		WebElement Mobile_charger=driver.findElement(By.xpath
				("//div[@style='background-color: rgb(252, 165, 165);'][1]"));
	Thread.sleep(2000);
		WebElement Mobile_Accesories=driver.findElement(By.xpath("//div[@class='drop-column  min-h-[200px] bg-slate-100']"));
		Actions action =new Actions(driver);
		action.dragAndDrop(Mobile_charger, Mobile_Accesories);
		//mouse over
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
	
	WebElement icon=	driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		//action.moveToElement(icon).perform();
		//click and hold
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		
		WebElement circle=driver.findElement(By.id("circle"));
		Thread.sleep(1000);
		action.clickAndHold(circle);
		System.out.println("all actions successful");
	}

}
