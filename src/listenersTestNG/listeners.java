package listenersTestNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class listeners extends TestListenerAdapter {
	
	public void onTeststart(ITestResult tr) {
		System.out.println("Test start");
	}
	
	public void onTestsuccess(ITestResult tr) {
		System.out.println("Test success");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failure");
		
	}
	public void onTestskipped(ITestResult tr) {
		System.out.println("Test skipped");
	}

}
