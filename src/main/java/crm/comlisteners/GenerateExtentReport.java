package crm.comlisteners;
import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport implements ITestListener  {
	public ExtentReports report;
	public ExtentSparkReporter spark;
	 public ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		report.createTest(name);
		System.out.println("on test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("onTestSuccess");
		String name=result.getMethod().getMethodName();
		
		test.log(Status.PASS,name+"is pass ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//String name=result.getMethod().getMethodName();
		
		
		System.out.println("onTestFailure");
		System.out.println("OnTestFailure");
		String name=result.getMethod().getMethodName();
		test.log(Status.FAIL, name+"is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		System.out.println("onTestSkipped");
		test.log(Status.SKIP, name+"is skipp");
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
		//ExtentReports report=new ExtentReports();
		File path =new File("./ExtentReport/sample.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("M3&A5 Batch");
		spark.config().setReportName("jana");
		spark.config().setTheme(Theme.DARK);
		//aatach the report
		report.attachReporter(spark);
		report.setSystemInfo("os", "windows10");
		report.setSystemInfo("browser", "chrome");
		//create the test case
		ExtentTest test1=report.createTest("test1");
		test1.log(Status.FAIL, "login function error");
		report.flush();
	}
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}
	


	


}
