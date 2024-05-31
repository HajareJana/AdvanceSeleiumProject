package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSloginPage;

public class Logindws {
@Test
	public void login() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		//class name and constructor name same,objection creation name same
		DWSloginPage dws=new DWSloginPage(driver);
//		Thread.sleep(2000);
//		dws.username.sendKeys("admin01@gmail.com");
//		Thread.sleep(2000);
//		dws.password.sendKeys("admin01");
//		Thread.sleep(2000);
//		dws.login_button.click();
		
		
		
		//to show::selenium.NoSuchElementException
//		driver.findElement(By.id("email"));
//		dws.username=driver.findElement(By.id("email1"));
//		dws.username.sendKeys("admin01@gmail.com");
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
	}

}
