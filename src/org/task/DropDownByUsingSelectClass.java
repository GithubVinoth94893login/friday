package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownByUsingSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
		//select by index
		select.selectByIndex(10);
		//---------------------------------------------
		// to get the all options
		List<WebElement> options=select.getOptions();
		//to get the count of the list
		int len = options.size();
		//to print the count of all options
		System.out.println(len);
		//-------------------------------------------------
		// to print the 10th index option text
		//1.get all the options
		List<WebElement> list = select.getOptions();
		//2---------Get the 10th index position
		WebElement element = list.get(10);
		//3----Get the text
		String data = element.getText();
		System.out.println(data);
		//-----------------------------------------------
		//print the 20th index position Attribute Value
		//1.Get all the options
		List<WebElement> options2 = select.getOptions();
		//2.Get the 20th index position
		WebElement webElement = options2.get(20);
		String attribute = webElement.getAttribute("value");
		System.out.println(attribute);
		//-------------------------------------------
		//print all options list using for loop
		//2.1.Get all options
		List<WebElement> options3 = select.getOptions();
		//2.2---------Iterate all options3
		for (int i = 0; i<options.size() ;i++) {
			//2.1----------Get the EachElement
			WebElement webElement2 = options.get(i);
			//2.2------Get the text
			String text = webElement2.getText();
			System.out.println(text);
		}
		//-------------------------------------------
		//print all options list using foreach loop
		//1-------Get all options
		List<WebElement> options4 = select.getOptions();
		//Iterate all options
		for (WebElement totaloptions : options4) {
			System.out.println(totaloptions);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
