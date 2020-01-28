package org.mal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DownloadLink {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();
			
			  Actions acc=new Actions(driver);
			     WebElement txt=driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/download-links.pdf']"));
			    
			     txt.click();
			     //acc.contextClick(txt).perform();
			     Thread.sleep(5000);
			     acc.contextClick(txt).perform();	
					Robot r=new Robot();
					
					for(int i=1;i<=4;i++)
					{
					
					
						
						r.keyPress(KeyEvent.VK_DOWN);
						r.keyRelease(KeyEvent.VK_DOWN);
						
					
						
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
		
			

}
}
}
