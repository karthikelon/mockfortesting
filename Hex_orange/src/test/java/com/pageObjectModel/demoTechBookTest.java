package com.pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTechBookTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		//login page
		demoTechLoginPage lp=new demoTechLoginPage(driver);
		lp.enterEmail("elon06820@gmail.com");
		lp.enterPassword("karthik22");
		lp.clickLogin();
		
		
		//main page
		driver.findElement(By.xpath("//div[@class='header-menu']//a[contains(text(),'Books')]")).click();
		// book page
		demoTechBookPage dtp=new demoTechBookPage(driver);
		
		dtp.clickAddToCart();
	}

}
