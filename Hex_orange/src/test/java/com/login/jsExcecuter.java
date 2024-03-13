package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jsExcecuter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Explicit 
		WebDriverWait wait = new WebDriverWait(driver, 15);
		System.out.println("in explicit");

		// Wait for the title to contain "OrangeHRM"
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));

		// Use explicit wait for the input field to be clickable
		By usernameLocator = By.xpath("//input[@placeholder='Username']");
		wait.until(ExpectedConditions.elementToBeClickable(usernameLocator)).sendKeys("Admin");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click the login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		System.out.println("Page Loaded");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		String Scrolldown="window.scrollBy(0,300)";

		j.executeScript(Scrolldown);
		
		System.out.println("Page scrolled down");

		
		
		
		
		
	}

}
