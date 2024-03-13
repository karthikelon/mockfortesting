package com.login;
import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitandexplicit {

		public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Implicit 
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(5000);
		
		//Explicit 
		WebDriverWait wait = new WebDriverWait(driver, 10);
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
		
		//logging in  
		
		WebDriverWait wait2 = new WebDriverWait(driver, 7);
		System.out.println("logged in");
		wait2.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		//admin module 
		//By adminLocator = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']]");
		//wait2.until(ExpectedConditions.elementToBeClickable(adminLocator));
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']]")).click();

	 		
		}
	 
	}

	
