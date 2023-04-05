package myListeners;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

import extentReport.Extentreport;




public class mylistener implements ITestListener, ISuiteListener {

	
	WebDriver driver = new ChromeDriver();
  
    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        Extentreport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
        Extentreport.closeReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        driver.close();

    }

    @Override
    public void onTestFailure(ITestResult result) {
      //  ITestListener.super.onTestFailure(result);
       // Extentreport.getTest().fail(result.getMethod().getMethodName()+ " is failed", MediaEntityBuilder.createScreenCaptureFromBase64String(base.getBase64()).build());
        driver.close();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        driver.close();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
        driver.close();
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
        driver.close();
    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
        driver.close();
    }
    
}