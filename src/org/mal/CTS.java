package org.mal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CTS
{      
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("http://greenstech.in/selenium-course-content.html");
				driver.manage().window().maximize();
				
     Actions acc=new Actions(driver);
     WebElement txt=driver.findElement(By.xpath("//div[@id='article-wrapper']"));
     
    acc.contextClick(txt).perform();
	Thread.sleep(5000);
	
		Robot r=new Robot();
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
		
		}
	}

}

		
		
		
		

	
	
	
	
	
	
	
	
			


   

