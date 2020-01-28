package org.mal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rakesh {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstechnologys.com/");
			driver.manage().window().maximize();	        

			Actions acc=new Actions(driver);
						WebElement txt=driver.findElement(By.xpath("//font[text()='GREENS TECHNOLOGY']"));

			acc.doubleClick(txt).perform();
			acc.contextClick().perform();
			Thread.sleep(5000);
			 Robot r=new Robot();

			for(int i=1;i<=5;i++)
			{
				

				r.keyPress(KeyEvent.VK_SHIFT);
				r.keyRelease(KeyEvent.VK_DOWN);
			}	
			//acc.contextClick().perform();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_P);
			
			
			

			
				
		
			
			
		

			
}
}
}