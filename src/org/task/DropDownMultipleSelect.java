package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();



WebElement txtUserName=driver.findElement(By.id("username"));
txtUserName.sendKeys("vinothvk");
WebElement txtpwd=driver.findElement(By.id("password"));
txtpwd.sendKeys("535G9D");
WebElement login=driver.findElement(By.id("login"));
login.click();
	
	WebElement location = driver.findElement(By.id("location"));
	Select select = new Select(location);
	//Select all options by Index
	List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	for(int i=0;i<options.size();i++) {
		select.selectByIndex(i);
	WebElement element=	options.get(i);
	System.out.println(element.getText());	
	}
		System.out.println("select by value");
	WebElement hotel = driver.findElement(By.id("hotels"));
	Select s = new Select(hotel);
	//Select all options by Values
	List<WebElement> options2 = s.getOptions();
	System.out.println(options2.size());
for (WebElement webElement : options2) {
	String text=webElement.getAttribute("value");
	s.selectByValue(text);
	System.out.println(text);
}
	
	WebElement room = driver.findElement(By.id("room_type"));
	Select s1 = new Select(room);
List<WebElement> options3 = s1.getOptions();
	for (WebElement webElement : options3) {
		
		String text=webElement.getText();
		s1.selectByVisibleText(text);
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static void foreach() {
		// TODO Auto-generated method stub
		
	}

}
