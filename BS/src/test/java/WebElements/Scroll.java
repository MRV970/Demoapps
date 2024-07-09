package WebElements;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.cssSelector("ul[class='mt-1 ps-3 pe-4']")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Open In New Tab")).click();
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Horizontal")).click();
//		driver.findElement(By.partialLinkText("Open In New Tab")).click();
		String w=	driver.getWindowHandle();
		Set<String> wi=	driver.getWindowHandles();
	System.out.println(wi);
		for(String a:wi) {
			if(!w.equals(a)) {
				driver.switchTo().window(a);
				
			}}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		WebElement free= driver.findElement(By.xpath("//h3[text()='Free Materials']"));
		Actions a=new Actions(driver);
		a.scrollToElement(free);
js.executeScript("window.scrollToElement()");

	}}
