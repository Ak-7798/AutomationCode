package GenericFunc;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtendReportExample implements ITestListener {
    static ExtentReports extent;
    static ExtentTest test;

    public static void main(String[] args) {
        // Set up the HTML report
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Start the test
        test = extent.createTest("Result Report", "Testing Google Homepage");
        System.setProperty("webdriver.chrome.driver", "D:/DailyCode/ECommerceProject/Framework/chromedriver.exe");
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        test.info("Launching Chrome Browser");

        driver.get("https://www.google.com");
        test.pass("Navigated to Google");

        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
        test.pass("Closed the browser");
test.info("Google website closed after quit successfully");
        // Flush the report
        extent.flush();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail("Test Failed: " + result.getName());
    }
}
