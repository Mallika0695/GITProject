package org.mallika;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
public static void main(String[] args) throws IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\drivers\\chromedriver.exe");
 	WebDriver d2=new ChromeDriver();
 	//	d1.get("http://www.greenstechnologys.com");
 		d2.get("http://www.greenstechnologys.com");
 		TakesScreenshot tk=(TakesScreenshot)d2;
 		File src=tk.getScreenshotAs(OutputType.FILE);
 		File dec=new File("D:\\eclipse-jee-kepler-SR2-win32-x86_64\\Mallika\\screenshot\\greenstechnologys.png");
 		FileUtils.copyFile(src, dec);
 	
	
	
	
	
	
	
	

}

}
