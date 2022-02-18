package org.task;

import java.awt.*;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenShotOfDesktopScreenUsingRobotClass {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			//FullScreenShot Of Desktop Screen Using RobotClass
			Robot robot = new Robot();
			java.awt.Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rectangle = new Rectangle(screensize);
			BufferedImage sourcefile = robot.createScreenCapture(rectangle);
			File destinationfile = new File("G:\\fb.png");
			ImageIO.write(sourcefile, "png", destinationfile);
		
	}

}
