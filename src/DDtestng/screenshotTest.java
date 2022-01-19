package DDtestng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class screenshotTest {
	public WebDriver driver;

	@Test

public void testDDtestng() throws Exception{

	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aruna\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();

    //goto url

    driver.get("http://demo.guru99.com/V4/");
    
    screenshotTest.takeSnapShot(driver, "C:\\workspace1\\TestNGWeb\\Screenshots\\Test3.png") ;     

    driver.findElement(By.name("uid")).sendKeys("mngr376292");
    driver.findElement(By.name("password")).sendKeys("sAgYjYd");
    driver.findElement(By.name("btnLogin")).click();
    

    //Call take screenshot function

    screenshotTest.takeSnapShot(driver, "C:\\workspace1\\TestNGWeb\\Screenshots\\Test2.png") ;     

}

/**

 * This function will take screenshot

 * @param webdriver

 * @param fileWithPath

 * @throws Exception

 */

public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

}

}
