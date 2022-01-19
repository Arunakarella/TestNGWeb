package DDtestng;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshotelement {
	static WebDriver driver;
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();	

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
				
		// Find the element to take a screenshot

	   WebElement element = driver.findElement(By.xpath ("//div[@class='rt-logo-block']//a//img"));

		// Along with driver pass element also in takeScreenshot() method.

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,element);

		ImageIO.write(screenshot.getImage(), "png", new File("C:\\workspace1\\TestNGWeb\\Screenshots\\ElementScreenshot.png"));
			}
		}