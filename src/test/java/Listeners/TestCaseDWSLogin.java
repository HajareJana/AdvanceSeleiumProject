package Listeners;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners()
public class TestCaseDWSLogin {
	
		@Test
		public void login()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.navigate().to("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("round@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("sr12345");
			driver.findElement(By.cssSelector("input[value='Loginnn in']")).click();
			driver.close();
			
		}
		@Test
		public void redBus() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.navigate().to("https://www.redbus.in/");
			
		}
		@Test(dependsOnMethods = "login")
		public void maniDum() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.navigate().to("https://manis.in/");
		}

	}

