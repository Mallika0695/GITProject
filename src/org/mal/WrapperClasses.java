package org.mal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WrapperClasses {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("http://greenstech.in/selenium-course-content.html");
				driver.manage().window().maximize();
				  WebElement txt=driver.findElement(By.xpath("//b[text()='Wrapper Classes:']"));
				  Actions acc=new Actions(driver);
				   
				    acc.doubleClick(txt).perform();
				    Robot r=new Robot();
						Thread.sleep(2000);
							r.keyPress(KeyEvent.VK_CONTROL);
							r.keyRelease(KeyEvent.VK_A);
							acc.contextClick(txt).perform();	
						{
						r.keyPress(KeyEvent.VK_DOWN);
						r.keyPress(KeyEvent.VK_DOWN);
						
						
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
					
						
						
						}
	}


}
