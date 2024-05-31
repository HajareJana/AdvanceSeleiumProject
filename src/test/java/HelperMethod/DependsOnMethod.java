package HelperMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test(priority=3)
	public void createAccout() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		System.out.println("account create");
		
	}
	@Test(priority=0,dependsOnMethods="createAccout")
public void modifyAccout() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.royalchallengers.com/");
		System.out.println("account has been modify");
		
	}
	@Test(priority=2)
public void DeleteAccout() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		System.out.println("account has been deleted........");
	
}
	

}
