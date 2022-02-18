package org.task;


import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G://chromedriver.exe");
WebDriver driver = new ChromeDriver();
/*driver.get("https://www.amazon.com/");

WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
txtSearchBox.sendKeys("iphone",Keys.ENTER);
		
WebElement search = driver.findElement(By.xpath("//span[text()='Apple iPhone 6s 16GB Gray Unlocked 4G LTE']"));
search.click();
WebElement findElement = driver.findElement(By.id("exportsUndeliverable-cart-announce"));
findElement.click();
//Get Parent Window ID
String parentWindowId = driver.getWindowHandle();
System.out.println(parentWindowId);
//Get all window ID 
Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		//Iterate all window IDs
		for (String eachWindowId : allWindowId) {
			if(!parentWindowId.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);
			}
		}*/


//NOTE: Search iphones 7 and click 1st phone 
//      add it to cart.
//      print the you pay cost displayed.
//driver.get("https://www.snapdeal.com/ ");
//WebElement txtSearch = driver.findElement(By.name("keyword"));
//txtSearch.sendKeys("iphones 7",Keys.ENTER);
//WebElement phone = driver.findElement(By.xpath("//*[@id=\"646922147062\"]/div[3]/div[1]/a/p"));
//phone.click();

//String parentId=driver.getWindowHandle();
//System.out.println(parentId);
//Set<String> childId=driver.getWindowHandles();
//System.out.println(childId);

//		WebElement cart = driver.findElement(By.id("add-cart-button-id"));
//		cart.click();
//		
//		WebElement cost = driver.findElement(By.xpath("//span[text()='Rs. 249']"));
//		String price=cost.getText();
//		System.out.println(price);
		
//NOTE: Search celling fan 
//click 1st fan and click the remote control included	

//
//	driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
//		
//String windowId= driver.getWindowHandle();
//Set<String> allWindowId=driver.getWindowHandles();

/*System.out.println(windowId);
		System.out.println(allWindowId);
		
	List<String>	list = new ArrayList<>(allWindowId);
	String parentWindow=list.get(0);
	System.out.println(parentWindow);
	String childWindow=list.get(1);
	System.out.println(childWindow);
	
	//switching between windows
	driver.switchTo().window(parentWindow);
	System.out.println("parentWindow:  "+driver.getTitle());
	driver.switchTo().window(childWindow);
	System.out.println("childWindow  "+driver.getTitle());*/
		
//for (String w : allWindowId) {
//String title=	driver.switchTo().window(w).getTitle();	
//	if(title.equals("OrangeHRM"))	{
//		driver.close();
//	}
//}
//		QUESTION 12
//----------
//URL : http://greenstech.in/selenium-course-content.html
//
//NOTE: Click WindowsHandling in selenium Java Test Paper
//      print question 13 in practical
		
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		
//		WebElement txtPaper = driver.findElement(By.xpath("//div[@id='heading303']"));
//		txtPaper.click();
//	
//				
//			WebElement day10=	driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']"));
//		Thread.sleep(3000);
//			day10.click();
//		
//		Set<String> allWindows=driver.getWindowHandles();
//		String window=driver.getWindowHandle();
//		
//		for(String w:allWindows) {
//			
//			if(!w.equals(window)) {
//		
//				driver.switchTo().window(w);
//			}
//		Thread.sleep(2000);
//	driver.switchTo().window(window);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
//	WebElement overview = driver.findElement(By.xpath("//span[text()='Overview']"));
//	Thread.sleep(2000);
//	overview.click();
//	driver.close();

//driver.get("http://www.leafground.com/");
//WebElement frame = driver.findElement(By.xpath("//h5[text()='Frame']"));
//frame.click();
//
//List<WebElement> frames=driver.findElements(By.tagName("iframe"));
//System.out.println(frames.size());
//
//driver.switchTo().frame(0);
//
//WebElement f1 = driver.findElement(By.id("Click"));
//f1.click();
//
//System.out.println(f1.getText());
//
//driver.switchTo().defaultContent();
//
//driver.switchTo().frame(1);
//driver.switchTo().frame("frame2");
//
//WebElement f2= driver.findElement(By.id("Click1"));
//f2.click();
//
//driver.switchTo().defaultContent();


driver.get("http://www.leafground.com/");
WebElement btn = driver.findElement(By.xpath("//h5[text()='Window']"));
btn.click();

WebElement HomePage = driver.findElement(By.id("home"));
HomePage.click();

Set<String> windowHandles = driver.getWindowHandles();
String window=driver.getWindowHandle();

for (String x : windowHandles) {
	driver.switchTo().window(x);
}
WebElement edit = driver.findElement(By.xpath("//h5[text()='Edit']"));
edit.click();
driver.close();

driver.switchTo().window(window);

WebElement multiple = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
multiple.click();


Set<String> windowHandles2 = driver.getWindowHandles();
//System.out.println(windowHandles2.size());
//int i =0;
//for (String string : windowHandles2) {
//	
//	if(!string.equals(window)) {
//		driver.switchTo().window(string);
//		driver.close();
//		
//	}
//}
int count = 0;
for (String string : windowHandles2) {
	if (count==2) {
		driver.switchTo().window(string);
		driver.close();
		
	}
}









//List<String> li = new ArrayList<String>();
//li.addAll(windowHandles2);
//
//driver.switchTo().window(li.get(li.size()-1));
//driver.close();

}

}



























