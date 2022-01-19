package ExtentreportsTestNG;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//import org.testng.annotations.BeforeMethod;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GenerateExtentReports {
   ExtentReports extent;  // specify the location of report
   ExtentTest test;     // what details should be populated in the report
   @BeforeTest
   public void startReport() {
 	  extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyownReport.html", true);
       extent.addSystemInfo("Host Name","GANGADHAR");
       extent.addSystemInfo("Environment","QA");
       extent.addSystemInfo("User name", "GANGA");
       extent.loadConfig(new File(System.getProperty("user.dir")+"\\spark-config.xml"));
   }
	
	@Test
  public void demoreportpass() {
		test = extent.startTest("DemoReportPass");
		Assert.assertTrue(true);
		test.log(LogStatus.PASS,"Assert pass as condition is True");
  }
	@Test
	 public void demoreportfail() {
		test = extent.startTest("DemoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL,"Assert fail as condition is False");
  }
	
	// after method is created just because if the test is failed then it must create logs 
	@AfterMethod
	  public void getResult(ITestResult result)
	  {
		  if (result.getStatus()==ITestResult.FAILURE)
		  {
			  test.log(LogStatus.FAIL, result.getThrowable());
		  }
		  extent.endTest(test);
	  }
	
  @AfterTest
  public void endreport() {
	  extent.flush();
  }

}
