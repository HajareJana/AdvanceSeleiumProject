package Practics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Web {
	@Parameters("url")
	@Test(groups="smoke")
	public void  AjioShopping(String url) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		Thread.sleep(2000);
		driver.close();


}
}
