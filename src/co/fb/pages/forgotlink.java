package co.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("identify_email")).sendKeys("clovek7890@gmail.com");
        driver.findElement(By.id("did_submit")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@name='reset_action']")).click();
        
	}

}
