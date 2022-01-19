package DDtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Test4 {
	public WebDriver driver;
	
  @Test
  public void Login() throws InterruptedException {
	  System.out.println("Login into Gmail");
	  driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
	 // driver.findElement(By.xpath("//div[contains(text(),'Use another account')]")).click();
	  //Enter user name
	  driver.findElement(By.id("identifierId")).sendKeys("clovek7890@gmail.com");
	  //Click Next button
	  driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	  Thread.sleep(2000);
	  //Enter password
	  driver.findElement(By.name("password")).sendKeys("Delete@9");
	  //Click SignIN
	  driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
  }
  
  @BeforeMethod
  public void startCar() {
	  System.out.println("Intializing ChromeDriver");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //setting 30 seconds implicit wait
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  //Open Gmail 
	  driver.get("https://www.google.com/gmail/about/");	  
  }

  @AfterMethod
  public void stopCar() {
	  //Close the browser
	  System.out.println("Close the browser");
	  driver.quit();
  }

}
