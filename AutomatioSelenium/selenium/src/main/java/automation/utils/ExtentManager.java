package automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	    public static ExtentReports ExtentReport() {
	    	String path =System.getProperty("user.dir")+"//reports//index.html"; 
	    	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	    	reporter.config().setReportName("Web Automation Results"); 
	    	reporter.config().setDocumentTitle("Test Results");
	    	ExtentReports extent =new ExtentReports();
	    	extent.attachReporter (reporter);
	    	extent.setSystemInfo("Tester", "Rahul Shetty");
	    	extent.createTest(path);
	    	return extent;
		}
}
