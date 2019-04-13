package jenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		RemoteWebDriver driver = null; 
		DesiredCapabilities dc = DesiredCapabilities.chrome(); 
		driver = new RemoteWebDriver(new URL("http://192.168.1.5:6666/wd/hub"), dc);

		 
		driver.manage().window().maximize();
		
		System.out.println("Open URL");
		
		driver.get("https://www.google.co.in");
		
		
		
		Thread.sleep(8000);
		
		driver.close();
		
		System.out.println("Test passed");
		
		
		

        
        
	}
	
}
