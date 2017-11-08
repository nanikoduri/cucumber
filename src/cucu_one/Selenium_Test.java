// checking integration with GITHUB and Jenkins
package cucu_one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Selenium_Test {

	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     	driver.get("https://www.facebook.com/");
 	       
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nani_acrazy@yahoo.com"); 
	        	 
	        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("N765890i");
	 
	        // Print a Log In message to the screen
	       
	      driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
	      
	  	        System.out.println("Login Successfully");
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	        
	       	        
	        Assert.assertEquals("Facebook", driver.getTitle());
	        System.out.println(driver.getTitle());
	        
	      	// Close the driver	              
	        driver.quit();
	        System.out.println("ThANK YOU");
	 
		}

	}


