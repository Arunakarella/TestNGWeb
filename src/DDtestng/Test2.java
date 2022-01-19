package DDtestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	
	  @Test
	  public void driveCar() {
		  System.out.println("Drive the car");
	  }
	  
	  @BeforeMethod
	  public void startCar() {
		  System.out.println("Start the car");
	  }

	  @AfterMethod
	  public void stopCar() {
		  System.out.println("Stop the car");
	  }

	}