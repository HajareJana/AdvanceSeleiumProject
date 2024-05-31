package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DWSAddtoProduct extends Baseclass {
	@Test
	public void addToProduct() throws InterruptedException{
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement>products=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement Web:products) {
			Web.click();
		}
		Thread.sleep(2000);
		
		
		
	}

}
