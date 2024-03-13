package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/* To hover over a web element
		driver.get("https://demowebshop.tricentis.com/fiction");
		WebElement element=	driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		 
		Actions act=new Actions(driver);
		 
		act.moveToElement(element).build().perform();						
		driver.findElement(By.xpath("//a[contains(text(),'Desktops')]")).click();
		*/
		/*   TO right click on a web element
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element1=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		 
		Actions act=new Actions(driver);
		 
		
		act.contextClick(element1).perform();
		
		*/
		
		// To double click
		/*
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement element2=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		 
		Actions act=new Actions(driver);

		act.doubleClick(element2).perform();
		*/
		
		//  to drag and drop
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("in explicit wait ");

		// Wait for the title to contain "OrangeHRM"
		wait.until(ExpectedConditions.titleContains("Selenium Easy Demo - Drag and Drop Demo"));

		driver.get("https://demo.seleniumeasy.com/drag-and-drop-demo.html");
		WebElement drag=driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"mydropzone\"]"));
		 
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
	}

}
