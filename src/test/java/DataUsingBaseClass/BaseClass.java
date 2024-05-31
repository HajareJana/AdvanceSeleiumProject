package DataUsingBaseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	@Test
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Connecting the data");
		
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Precondition for test runner");
		
	}
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("url");
		
	}
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforeMethod(String username, String password) {
		driver.findElement(By.className("ico-login")).click();
	    driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log in']"));
		
	}
	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
	}
	@AfterClass
	public void afterClass() {
		driver.close();
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Post condition for test runner");
		
	}
	
	

}
