package org.mal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
	   //driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	  // Alert a=driver.switchTo().alert();
	  // String text=a.getText();
	   //System.out.println(text);
	   //a.accept();
	   
	// driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	   Alert a=driver.switchTo().alert();
	  //  String text1=a.getText();
	    //System.out.println(text1);
	    //a.dismiss();
	     
	    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	    a.sendKeys("YES");		
	     a.accept();
	     
	     
	  
	   
	   
	   
	   
	   
	   
}
}
