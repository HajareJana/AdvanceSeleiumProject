package extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport2 {
	@Test

	public void launchReport() {
		ExtentReports report=new ExtentReports();
		//  ./FOLDER NAME/ANY TYPE OF FILE .HTML(EXTENSION
		File path =new File("./ExtentReport/sample2.html");
		//OR==FOLDER NAME.HTML(EXTENSION)
		File path =new File("./ExtentReport.html");
		ExtentSparkReporter spark=new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("M3&A5 Batch");
		spark.config().setReportName("jana");
		spark.config().setTheme(Theme.DARK);
		//aatch the report
		report.attachReporter(spark);
		//create the test case
		ExtentTest test1=report.createTest("test1");
		test1.log(Status.PASS, "login function succssfully work");
		report.flush();
		

}
}
