package BaseClass1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassDWS1 {
	
 public WebDriver driver;
	
	
	@BeforeSuite
	public void beforSuite()
	{
		System.out.println("Connect DB");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("pre condition for test runner");
		
	}@BeforeClass
	public void beforeClass()
	{
		//enter to dws
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		
	}@BeforeMethod
	public void beforeMethod()
	{
		//login
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("round@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("sr12345");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("post condition for test runner");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("dissconect DB");
	}
	
	

}