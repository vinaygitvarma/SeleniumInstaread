package automation.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

import automation.utils.ExtentManager;

public class Listener implements ITestListener{
	ExtentReports extent=ExtentManager.ExtentReport();
	
	@Override
    public void onTestStart(ITestResult result) {
       extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
       
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        
    }

}
