package co.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class createaccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dollardays.com/");
		driver.findElement(By.xpath("//img[@class='header-user']")).click();
		driver.findElement(By.linkText("Create account")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_cphContent_txtFName")).sendKeys("Vijay");
		driver.findElement(By.id("ctl00_cphContent_txtLName")).sendKeys("Kumar");
		driver.findElement(By.id("ctl00_cphContent_txtClientEmail")).sendKeys("Vijji@gmail.com");
		driver.findElement(By.id("ctl00_cphContent_txtPhoneMain")).sendKeys("9855841122");
		driver.findElement(By.id("ctl00_cphContent_txtPassword")).sendKeys("Delete@9");
		driver.findElement(By.id("ctl00_cphContent_txtPasswordConfirm")).sendKeys("Delete@9");
		driver.findElement(By.id("ctl00_cphContent_btnRegister")).click();
		
		
	}

}
