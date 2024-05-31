package TestNGFasion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioShop {
	@Test(groups="smoke")
	public void  AjioShopping() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		driver.close();


}
}
