package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.linkText("Live Scores")).click();
		driver.findElement(By.partialLinkText("Women")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath
	("//a[@href=\'/live-cricket-scorecard/95742/zimaw-vs-ngaw-24th-match-kwibuka-womens-tournament-2024\']")).click();
	  Thread.sleep(2000);
	  
	  List<WebElement> runs=	driver.findElements(By.xpath
				
("//span[text()='ZIMAW Innings']/parent::div/following-sibling::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/descendant::div[@class=\"cb-col cb-col-8 text-right text-bold\"]"))
	;
//	  List<WebElement> value=	driver.findElements
//				(By.xpath("//span[text()='ZIMAW Innings']/parent::div/following-sibling::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/div[contains(@class,\"cb-col cb-col-25 \") or contains(@class,\"cb-col cb-col-8 text-right text-bold\") ]"));
	  for(WebElement run:runs) {
		 // System.out.println(run);
	  
	 
	String r=run.getText();
//	System.out.println(run);
	int i=Integer.parseInt(r);
	  
	if( i<30) {
		String N=driver.findElement(By.xpath("//span[text()='ZIMAW Innings']/parent::div/following-sibling::div/following-sibling::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/descendant::div[@class=\"cb-col cb-col-25 \"]")).getText();
		String R=driver.findElement(By.xpath("//span[text()='ZIMAW Innings']/parent::div/following-sibling::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/descendant::div[@class=\"cb-col cb-col-8 text-right text-bold\"]")).getText();
	    String S=driver.findElement(By.xpath("//span[text()='ZIMAW Innings']/parent::div/following-sibling::div/following-sibling::div[@class=\"cb-col cb-col-100 cb-scrd-itms\"]/descendant::div[@class=\"cb-col cb-col-8 text-right\"]/following-sibling::div/following-sibling::div/following-sibling::div[@class=\"cb-col cb-col-8 text-right\"]")).getText();
	
	//    String
	    System.out.println(N+"name "+R+"Run "+S+"Strikerate ");
	    
	    
		//System.out.println(v.getText());
		//System.out.println("print");
	}}}
	
	  
		
		
	
	
	
	
	}
	
	


