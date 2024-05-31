package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("connecting to the Database");
		
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("PreCondition for the test runner");
		
	}
	@BeforeClass
	public void beforeClass() {
		//Launch the browser
		driver=new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//explicit wait
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//navigate to the url
		driver.get("https://demowebshop.tricentis.com/login");
	
	
	}
	@BeforeMethod
	public void beforeMethod() {
		//click on login link
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		//enter the value in email text field
		driver.findElement(By.id("Email")).sendKeys("jana@123gmail.com");
		//enter pass the password text field
		driver.findElement(By.id("Password")).sendKeys("admin01");
		//click on login button
		driver.findElement(By.xpath("//input[@value='log in']")).click();
	}
	@AfterMethod
	public void afterMthod() throws InterruptedException {
		//click on logout button
		driver.findElement(By.cssSelector("a[class='ico-logout']")).click();
		Thread.sleep(2000);
		
		
	}
	@AfterClass
	public void afterClass() {
		//close the browser
		driver.close();
		
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("PostCondition for test Runner");
		
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Disconnecting to the Database");
	}
	

}
