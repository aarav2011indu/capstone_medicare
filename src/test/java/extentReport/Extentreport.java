package extentReport;

import java.util.Objects;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


@Test

public final class Extentreport {

    private static ExtentReports extent;
    private Extentreport(){}

    public static void initReport()
    {
        if(Objects.isNull(extent))
        {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\indus\\eclipse-workspace\\medicare_login\\test-output/extent.html");
            extent.attachReporter(spark);
            spark.config().setReportName("Selenium Automation");
            spark.config().setDocumentTitle("Assessent project3");
            spark.config().setTheme(Theme.STANDARD);
        }

    }

    public static void closeReport()
    {
        if(Objects.nonNull(extent))
        {
            extent.flush();
        }

    }

    public static void createTest(String testcasename) {
        ExtentManager.setExtentTest(extent.createTest(testcasename));
    }

    public static ExtentTest getTest()
    {
        return ExtentManager.getExtentTest();
    }

}
	


