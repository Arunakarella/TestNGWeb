package DDtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class DDTests1 {
	WebDriver driver;
  @Test(priority=0)
  public void Account() {
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Accounts")).click();
	  }
  @Test(priority=1)
  public void OrderHistory() {
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Order History")).click();
  }
  @Test(priority=2)
  public void Favourites() {
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Favorites")).click();
	  
  }
  @BeforeMethod
  public void login() {
	  System.out.println("Login into dollardays");
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.id("inputLoginUsername")).sendKeys("vijji@gmail.com");
	  //Enter password
	  driver.findElement(By.id("inputLoginPassword")).sendKeys("Delete@9");
	  //Click SignIN
	  driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();	  
  }

  @AfterMethod
	  
	  public void logout() {
		  driver.findElement(By.xpath("//span[normalize-space()='Vijay K.']")).click();
		  driver.findElement(By.linkText("Sign Out")).click();
  }

  @BeforeClass	  
	  public void startCar() {
		  System.out.println("Intializing ChromeDriver");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  //setting 30 seconds implicit wait
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  //Open Gmail 
		  driver.get("https://www.dollardays.com/");
  }

  @AfterClass
  public void stopCar() {
	  //Close the browser
	  System.out.println("Close the browser");
	  driver.quit();
  }

}
