package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecutorInsteadOfSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			WebElement txtUserName = driver.findElement(By.id("email"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','vinoth kumar')", txtUserName);
			Object name=executor.executeScript("return arguments[0].getAttribute('value')", txtUserName);
			System.out.println(name);
			
			
			WebElement txtPassword  = driver.findElement(By.id("pass"));
			executor.executeScript("arguments[0].setAttribute('value','vinoth899900')", txtPassword);
			Object pass=executor.executeScript("return arguments[0].getAttribute('value')", txtPassword);
			System.out.println(pass);
			
			
			WebElement login = driver.findElement(By.name("login"));
			executor.executeScript("arguments[0].click()", login);

}
}
