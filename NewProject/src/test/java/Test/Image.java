package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;



public class Image {
	
	private WebDriver driver;
    private JavascriptExecutor js;

    @BeforeSuite
    public void setUp() throws InterruptedException {
    	
    	 WebDriverManager.chromedriver().setup();
    	 ChromeOptions options = new ChromeOptions();
    	 WebDriver driver = new ChromeDriver(options);
    	 Thread.sleep(2000);
    	 driver.get("https://ubique.img.ly/develop/apps/cesdk_web/web/smoketests/slow-assets.html");
    	
        js = (JavascriptExecutor) driver;
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testAddImageAndVerify() {
    	
       
        //driver.get("https://ubique.img.ly/develop/apps/cesdk_web/web/smoketests/slow-assets.html");

//Locating the image icon on the web page
        WebElement assetLibrary = driver.findElement(By.name("librarydock-ly.img.image"));
       
WebElement imageElement = assetLibrary.findElement(By.xpath("//button/img/div"));
       
        imageElement.click();

     
        Object result = js.executeScript("return cyGlobals.cesdk.engine.block.findByKind('imageElement')");
        

        Assert.assertTrue(result instanceof ArrayList);
        Assert.assertEquals(((ArrayList<?>) result).size(), 1);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


