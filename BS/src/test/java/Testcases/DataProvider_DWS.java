package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_DWS {
	@DataProvider(name="Searchtest")
	public Object[][] testdata(){
		Object[][] data=new Object[2][2];
		data[0][0]="https://demowebshop.tricentis.com/";
		data[0][1]="Books";
		data[1][0]="https://demowebshop.tricentis.com/";
		data[1][1]="Computers";
		
		
		return data;
	}
@Test(dataProvider="Searchtest")
public void search(String url,String search) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	driver.findElement(By.id("small-searchterms")).sendKeys(search);
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	driver.close();
	
}
	
}
