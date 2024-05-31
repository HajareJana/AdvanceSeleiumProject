package extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	@Test
	public void launchReport() {
		ExtentReports report=new ExtentReports();
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

}
