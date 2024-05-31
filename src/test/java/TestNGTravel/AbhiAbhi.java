package TestNGTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbhiAbhi {

		@Test(groups="regression")
		public void  MakemyShop() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.abhibus.com/");
			driver.close();

}
	}
