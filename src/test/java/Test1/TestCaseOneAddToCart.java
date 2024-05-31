package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseClass1.BaseClassDWS1;

@Listeners(BaseClass1.DWSListeners.class)
public class TestCaseOneAddToCart extends BaseClass1.BaseClassDWS1{
	@Test
	public void addToCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> carts = driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));		
		for (WebElement web : carts)
		{
			web.click();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		}
	}