package extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;
import com.crm.pom.DWSloginPage;

public class ReportWithActualTestcase extends DwsBaseClass {
	@Test
	public void dwsLoginCorrect()
	{
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
		
		DWSloginPage dws = new DWSloginPage(driver);
		 dws.username("admin01@gmail.com");
		 dws.password("admin01");
		 dws.login_button();
		 driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
	@Test
	
	
	public void dwsLoginWrong()
	{
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
		
		DWSloginPage dws = new DWSloginPage(driver);
		 dws.username("admin01@gmail.com");
		 dws.password("admin02");
		 dws.login_button();
		 driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		 assertEquals("123", "234");
	}
	@Test(dependsOnMethods="dwsLoginWrong")	
			public void redBus()
			{
				driver.get("https://redbus.in/");
				assertEquals("mani", "manu");
				
			}

}
