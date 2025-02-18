package ParametersAnnotation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShopperStack {
	@Parameters({"url","username","password"})
	@Test
	
	public void  recevier(String url,String username,String password ) throws IOException, InterruptedException {
		
//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//maximize the condition
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(url);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
WebElement login_Button=driver.findElement(By.id("loginBtn"));
if (login_Button.isEnabled())
{
	login_Button.click();

	

	driver.findElement(By.id("Email")).sendKeys(username);
	

	driver.findElement(By.id("Password")).sendKeys(password);
	
	driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	else {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",login_Button);
	}
}
}


}
