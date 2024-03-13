package com.login;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		Robot robot =new Robot();
		//WebElement element = driver.findElement(By.tagName("body"));
		
		
		robot.mouseMove(200,340);
		System.out.println("mouse moved to target coordinates");
		
		// to use keyboard to scroll down  to key press and key release
		/*
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		*/
		//
		/*
		WebElement element = driver.findElement(By.tagName("body"));
		Thread.sleep(5000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click	
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click	
        */
        // right click 
      robot.mouseMove(400,240);
      robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);  //right click
      robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(2000);
      robot.keyPress(KeyEvent.VK_ENTER);
      robot.keyRelease(KeyEvent.VK_ENTER);
      //robot.keyRelease(KeyEvent.VK_UP); // Key up event
      
	}

}
