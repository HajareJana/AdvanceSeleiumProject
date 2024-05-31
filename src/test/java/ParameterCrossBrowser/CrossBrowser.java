package ParameterCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class CrossBrowser {
	public WebDriver driver;
	@Parameters("browser")
	
	@Test
	public void Crossbrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")){
		driver=new ChromeDriver();
		
	}
		
	else if(browser.equalsIgnoreCase("edge")){
	driver=new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox")){
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://manis.in/");
	
	
	

}
}

