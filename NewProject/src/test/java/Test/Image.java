package Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Image {
	
	private WebDriver driver;
    private JavascriptExecutor js;

    @BeforeClass
    public void setUp() {
   //Intiating chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\Downloads\\chrome-win64\\chrome-win64");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testAddImageAndVerify() {
       
        driver.get("https://ubique.img.ly/develop/apps/cesdk_web/web/smoketests/slow-assets.html");

//Locating the image icon on the web page
        WebElement assetLibrary = driver.findElement(By.name("librarydock-ly.img.image"));
       
WebElement imageElement = assetLibrary.findElement(By.xpath("//button/img/div"));
       
        imageElement.click();

     
        Object result = js.executeScript("return cyGlobals.cesdk.engine.block.findByKind('imageElement')");

        Assert.assertTrue(result instanceof ArrayList, "Result is not an array");
        Assert.assertEquals(((ArrayList<?>) result).size(), 1, "Image is not added to the scene");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


