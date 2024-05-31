package DataProviderTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvirderBasic {
	@Test(dataProvider="login")
	public void  recevier( String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
        driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	//enter the value in email text field
	driver.findElement(By.id("Email")).sendKeys(username);
	//enter pass the password text field
	driver.findElement(By.id("Password")).sendKeys(password);
	//driver.findElement(By.id("RememberMe")).click();
	//click on login button
	driver.findElement(By.cssSelector("//input[value='log in']")).click();
	driver.close();
}
	@DataProvider(name="login")
	public Object[][]sender(){
		Object[][]obj=new Object[2][2];
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="admin01";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="admin02";
		return obj;
		
		
	}

}
