package org.classtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskForSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();




WebElement txtUserName=driver.findElement(By.id("username"));
txtUserName.sendKeys("vinothvk");
WebElement txtpwd=driver.findElement(By.id("password"));
txtpwd.sendKeys("535G9D");
WebElement login=driver.findElement(By.id("login"));
login.click();
Thread.sleep(5000);


//search Hotel

//1----search loaction
WebElement location = driver.findElement(By.id("location"));
Select select = new Select(location);
select.selectByIndex(2);

//2----search Hotel
WebElement hotel=driver.findElement(By.id("hotels"));
Select select1=new Select(hotel);
select1.selectByIndex(3);

//3-----search Room type
WebElement roomType=driver.findElement(By.id("room_type"));
Select select2 =new Select(roomType);
select2.selectByVisibleText("Double");

//4----search button  click
WebElement search=driver.findElement(By.id("Submit"));
search.click();

//Book A Hotel

//1---select radio button
WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
radiobutton.click();

//2------select continue button
WebElement continuebtn=driver.findElement(By.id("continue"));
continuebtn.click();

//3------Fill Details
WebElement firstName = driver.findElement(By.id("first_name"));
firstName.sendKeys("vinoth");
WebElement lastName = driver.findElement(By.id("last_name"));
lastName.sendKeys("kumar");
WebElement address = driver.findElement(By.id("address"));
address.sendKeys("Sydney");
WebElement creditCardNo=driver.findElement(By.id("cc_num"));
creditCardNo.sendKeys("1235456748789787");
WebElement cardType = driver.findElement(By.id("cc_type"));
Select select3 =new Select(cardType);
select3.selectByVisibleText("VISA");
WebElement month = driver.findElement(By.id("cc_exp_month"));
Select select4 =new Select(month);
select4.selectByValue("5");
WebElement year = driver.findElement(By.id("cc_exp_year"));
Select select5 =new Select(year);
select5.selectByVisibleText("2020");
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("1234");
WebElement bookNow = driver.findElement(By.id("book_now"));
bookNow.click();

//4---------Print the order number
Thread.sleep(10000);
WebElement number = driver.findElement(By.id("order_no"));
String orderNumber=number.getAttribute("value");
System.out.println(orderNumber);
WebElement txt = driver.findElement(By.xpath("//*[@id=\"booking_form\"]/table/tbody/tr[14]/td[1]"));
String text = txt.getText();
System.out.println(text);
WebElement element = driver.findElement(By.id("hotel_name"));
String attribute = element.getAttribute("value");
System.out.println(attribute);


	}

}
