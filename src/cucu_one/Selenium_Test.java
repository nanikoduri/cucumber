// checking integration with GITHUB and Jenkins
package cucu_one;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Selenium/geckodriver.exe" );
		 driver = new FirefoxDriver();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	     	driver.get("https://www.facebook.com/");
 	       
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("nanikoduri@yahoo.com"); 
	        	 
	        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("N@n!765890");
	 
	       driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("Login Successfully");
	        
	      	        // Close the driver
	         	          
	        driver.quit();
	 
		}

	}


