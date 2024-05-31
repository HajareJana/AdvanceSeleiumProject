package DataProviderTestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Connectoneclasstoanotherclass {
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
	driver.findElement(By.id("RememberMe")).click();
	//click on login button
	driver.findElement(By.cssSelector("//input[value='log in']")).click();
	driver.close();
}
	@DataProvider(name="login")
	public Object[][]sender() throws EncryptedDocumentException, IOException{
		//return DataProviderUtility.dwsLogin();
		//classname.methodname
		//to take data from excel file
return HowtotakedatatoExcelFile.dwsLogin();
}
}
