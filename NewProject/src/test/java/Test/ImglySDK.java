package Test;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ImglySDK {


		
		@Test

	private WebDriver driver;
		    private JavascriptExecutor js;

		    public void SliderHelper(WebDriver driver) {
		        this.driver = driver;
		        this.js = (JavascriptExecutor) driver;
		    }

		 
			driver.findElement(By.name("Adjustments")).click();
			 
		
		   
		      
		        WebElement slider = sliderHelper.findSlider(By.name("effect/adjustments/brightness"));
		        
		     
		        sliderHelper.setSliderValue(slider, 50.0);

		       
		        double value = sliderHelper.getSliderValue(slider);

		      
		        Assert.assertEquals(value, 50.0, "Slider value is not as expected");
		    }

		
			
			
	}

}
