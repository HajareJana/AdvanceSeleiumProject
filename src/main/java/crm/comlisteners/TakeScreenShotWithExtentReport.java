package crm.comlisteners;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.DwsBaseClass;

public class TakeScreenShotWithExtentReport  extends DwsBaseClass implements ITestListener  {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	 public ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
		test.log(Status.INFO, " Welcome to our class");
		test.log(Status.INFO, " My wonderful  fellows.......");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "your test case has passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		test.log(Status.FAIL, "your test case has fail");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "your testCase has skipp");
		
	}

	@Override
	public void onStart(ITestContext context) {
		File path=new File("./capture.html");
		spark=new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("");
		spark.config().setReportName("jana");
		spark.config().setTheme(Theme.STANDARD);
		report=new ExtentReports();
		report.setSystemInfo("os", "windwos10");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onfinsh");
		report.flush();
		
	}

}
