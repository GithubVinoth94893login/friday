package org.task;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotForEntirePageUsingFileUtilsAndFileHandler{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//using TakesScreenshot interface and using .getScreenshotAs method to take screenshot for entire page
	TakesScreenshot screenshot = (TakesScreenshot)driver;
File f=	screenshot.getScreenshotAs(OutputType.FILE);
//initializing object for file and mentioning the file location	
File d = new File("G:\\fb.png");
//using fileUtils ------ need to download commons io file version 2.4
	//FileUtils.copyFile(f, d);
	//or we can use fileHandler method ---- which is selenium inbuilt method ---- no need to download any jars
	org.openqa.selenium.io.FileHandler.copy(f, d);
	
	
	
	}

}
