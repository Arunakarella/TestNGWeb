package co.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("clovek7890@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Delete@9");
		Thread.sleep(2000);
		driver.findElement(By.xpath("u_0_h_lW")).click();
		Thread.sleep(7000);
		driver.quit();
		
		
		

	}

}
