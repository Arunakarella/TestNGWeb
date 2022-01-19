package co.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dollardays.com/");
		driver.findElement(By.xpath("//img[@class='header-user']")).click();
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputLoginUsername")).sendKeys("vijji@gmail.com");
		driver.findElement(By.id("inputLoginPassword")).sendKeys("Delete@9");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='header-user']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		
	}

}
