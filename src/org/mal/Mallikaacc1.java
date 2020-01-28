package org.mal;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mallikaacc1{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement dDn=driver.findElement(By.id("month"));
Select s= new Select(dDn);
s.selectByIndex(8);
driver.quit();
	}
}
		

			 
			
			
			
			
			
			
			 
			 
			 
		 
	
	
	


