package Test;

import java.sql.DriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



@Test

public class ImglySDK{

	

	private WebDriver driver;
		    private JavascriptExecutor js;
			private Object sliderHelper;

		    public void SliderHelper(WebDriver driver) {
		        this.driver = driver;
		        this.js = (JavascriptExecutor) driver;
		    }
		    driver.findElement(By.name("Adjustments")).click();
		    WebElement slider = driver.findElement(By.id("UBQ_input-effect/adjustments/brightness-1"));
		    
		    helper.moveSlider(slider, 43);
		    helper.moveSliderToValue(slider, 43, 0, 100);
		 
			 
		        
		        //Helper Methods
		       // moveSlider(By sliderLocator, int xOffset);
		        //moveSliderToValue(By sliderLocator, int value, int minValue, int maxValue)
		    

		
			
			
	}

}
