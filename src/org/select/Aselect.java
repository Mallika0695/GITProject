package org.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Aselect {
public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 driver.get("http://www.facebook.com");
	 WebElement txDa=driver.findElement(By.id("month"));
	 Select s= new Select(txDa);
	 s.selectByIndex(8);
	 driver.quit();
     		 
	 	
}
}
