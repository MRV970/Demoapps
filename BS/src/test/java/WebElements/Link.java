package WebElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui");
		//click on Webelement
		driver.findElement(By.xpath("//li[1]")).click();
		//click on buttons
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(4000);
		//default link
		List<WebElement> links=driver.findElements(By.xpath("//a[@class='text-white hover:text-slate-300 text-[14px]']"));
		for(WebElement dli:links) {
			Thread.sleep(2000);
			//System.out.println(dli.getText());
			System.out.println(dli.getText());
			driver.findElement(By.xpath("//a[text()='Link in New Tab']")).click();
			driver.findElement(By.partialLinkText("Twitter")).click();
		}
	}

}
