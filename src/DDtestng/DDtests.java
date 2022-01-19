package DDtestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DDtests {
	WebDriver driver;
  @Test(priority=1)
  public void FacebookLogin()throws InterruptedException {
	  
	  System.out.println("Login into dollardays");
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.id("inputLoginUsername")).sendKeys("vijji@gmail.com");
	  //Enter password
	  driver.findElement(By.id("inputLoginPassword")).sendKeys("Delete@9");
	  //Click SignIN
	  driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
  }
  
  @Test(priority=2)
  public void FacebookLogout() throws InterruptedException{
	  System.out.println("Login into dollardays");
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Sign In")).click();
	  driver.findElement(By.id("inputLoginUsername")).sendKeys("vijji@gmail.com");
	  //Enter password
	  driver.findElement(By.id("inputLoginPassword")).sendKeys("Delete@9");
	  //Click SignIN
	  driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	  driver.findElement(By.xpath("//span[normalize-space()='Vijay K.']")).click();
	  driver.findElement(By.linkText("Sign Out")).click();
  }
  
  @Test(priority=3)
  public void Account() {
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Create account")).click();
	  driver.findElement(By.id("ctl00_cphContent_txtFName")).sendKeys("Jessy");
	  driver.findElement(By.id("ctl00_cphContent_txtLName")).sendKeys("Raj");
	  driver.findElement(By.id("ctl00_cphContent_txtClientEmail")).sendKeys("jessiraj@gmail.com");
	  driver.findElement(By.id("ctl00_cphContent_txtPhoneMain")).sendKeys("9855489903");
	  driver.findElement(By.id("ctl00_cphContent_txtPassword")).sendKeys("Jesi");
	  driver.findElement(By.id("ctl00_cphContent_txtPasswordConfirm")).sendKeys("Jesi");
	  driver.findElement(By.id("ctl00_cphContent_btnRegister")).click();
  }
  @Test(priority=4)
  public void search() {
	  driver.findElement(By.name("terms")).sendKeys("clothing");
	  driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
  }
  @Test(priority=5)
  public void Help() {
	  driver.findElement(By.xpath("//img[@class='header-user']")).click();
	  driver.findElement(By.linkText("Help")).click();
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
	  driver.get("https://www.dollardays.com/");	  
  }

  @AfterMethod
  public void stopCar() {
	  //Close the browser
	  System.out.println("Close the browser");
	  driver.quit();
  }

}