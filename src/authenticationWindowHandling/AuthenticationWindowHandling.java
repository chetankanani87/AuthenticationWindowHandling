package authenticationWindowHandling;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import lib.BrowserDriverUtility;
import lib.ExtentReportUtility;
import lib.ScreenshotUtility;

public class AuthenticationWindowHandling {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver dr;
		ExtentReports report = ExtentReportUtility.InvokeExtentReport();
		ExtentTest logger = report.createTest("Handling Authentication Window");
		String path;
		
		dr = BrowserDriverUtility.InvokeBrowser("webdriver.gecko.driver",
				"C:\\Chetan\\SeleniumSuite\\WebDrivers\\geckodriver.exe", "http://www.engprod-charter.net");
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Chetan\\AutoIT\\AutoIT_Stuff\\WinGetTitle.exe");

		path = ScreenshotUtility.CaptureScreenshot(dr, "1_MainPage");
		logger.pass("Authentication Window Main Page - Screenshot taken.", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		dr.close();

	}
}