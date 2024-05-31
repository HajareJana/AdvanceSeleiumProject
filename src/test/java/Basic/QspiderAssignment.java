package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("jana");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hajarejana1234");
		driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("hajarejana1234");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("janahajare@1234gmail.com");
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("12345678909");
		driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("asdrfg");
		driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("jana@1");
		driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@name='rangeLength']")).sendKeys("jana@hajare");
		driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("jana@h");
		driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("jana@hajare");
		driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("janahajare");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		
		
		
		
		
		
	}
}


