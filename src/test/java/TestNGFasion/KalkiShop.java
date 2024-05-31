package TestNGFasion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KalkiShop {
	@Test(groups="smoke")
	public void  KalkiShop() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://dan.com/buy-domain/kalki.com");
		driver.close();


}
}
