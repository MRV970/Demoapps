package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		WebElement fashion = driver
				.findElement(By.xpath("//div[@class=\"_3sdu8W emupdz\"]/div[@aria-label=\"Fashion\"]"));
		// fashion.sendKeys("phones");
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@class='_1BJVlg']"));
		// List<WebElement>alllinks=driver.findElements(By.xpath("//div[@class='uAl2uE']/following-sibling::a"));

		List<WebElement> sublinks = driver.findElements(By.xpath("//a[@class='_3490ry']"));
		for (WebElement all : alllinks) {
			act.moveToElement(all);
			
			for (WebElement sub : sublinks) {
				System.out.print(all.getText());
				System.out.println(sub.getText());
			}
		}

	}

}
