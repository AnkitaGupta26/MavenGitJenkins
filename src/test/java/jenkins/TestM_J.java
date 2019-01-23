package jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestM_J {

	
	@Test
	public void TestMaven() throws InterruptedException, MalformedURLException{
		System.out.println("Welcome to Jenkins and Maven integration");
		
		/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();*/
		
		
		RemoteWebDriver driver = null; 
		DesiredCapabilities dc = DesiredCapabilities.firefox(); 
		driver = new RemoteWebDriver(new URL("http://10.151.158.81:5555/wd/hub"), dc);

		
		driver.manage().window().maximize();
		
		System.out.println("Open URL");
		
		driver.get("https://www.google.co.in");
		
		
		
		Thread.sleep(8000);
		
		driver.close();
		
		System.out.println("Test passed");
		
		
		

        
        
	}
	
}
