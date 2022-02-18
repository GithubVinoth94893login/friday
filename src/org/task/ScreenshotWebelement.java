package org.task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWebelement {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username1 = driver.findElement(By.id("email"));
		username1.sendKeys("vinoth kumar");
		
		WebElement username2  = driver.findElement(By.id("pass"));
		username2.sendKeys("564645");
		
		WebElement box = driver.findElement(By.xpath("//form[@data-testid='royal_login_form']"));
		//without using takesScreenshot interface , using only
		//getScreenshotAs  method to take screenshot of particular web element
		//
		File f = box.getScreenshotAs(OutputType.FILE);
		File d = new File("G:\\fb.png");
		FileUtils.copyFile(f, d);
		driver.close();
	}

}
