package jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestM_J {

	
	@Test
	public void TestMaven() throws InterruptedException{
		System.out.println("Welcome to Jenkins and Maven integration");
		
		System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		System.out.println("Open URL");
		
		driver.get("https://www.google.co.in");
		
		
		
		Thread.sleep(8000);
		
		driver.close();
		
		System.out.println("Test passed");
		
		
		

        
        
	}
	
}
