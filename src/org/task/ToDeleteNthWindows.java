package org.task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeleteNthWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com");


WebElement input = driver.findElement(By.id("inputValEnter"));
input.sendKeys("iphone 11",Keys.ENTER);

WebElement phone = driver.findElement(By.xpath("//*[@id=\"5764608200107409160\"]/div[3]/div[1]/a/p"));
phone.click();

Set<String> allWindows = driver.getWindowHandles();
String window = driver.getWindowHandle();

for (String x : allWindows) {
	if(!x.equals(window)) {
driver.switchTo().window(x);
	}
	
	Thread.sleep(8000);
WebElement cart = driver.findElement(By.id("add-cart-button-id"));
cart.click();

WebElement checkout=driver.findElement(By.xpath("iPhone 7 Shock Proof Case Diaz - Black Shutter cover"));
checkout.click();


	}
	}
}
