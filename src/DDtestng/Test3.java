package DDtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test3 {
  @Test
  public void Busroute() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Bus travels to route1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Bus travels to route1a");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Bus travels to route2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Bus travels to route2a");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Bus travels to route3");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Bus travels to route3a");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Bus travels to route4");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Bus travels to route4a");
  }

}
