package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class openBrowser {
	public static void main(String[] args) throws InterruptedException {
		
 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	//login
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("elon06820@gmail.com");
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("karthik22");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
	
	//Book module
	
	driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
	driver.findElement(By.cssSelector("div.product-item[data-productid='13'] input.button-2.product-box-add-to-cart-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div.product-item[data-productid='45'] input.button-2.product-box-add-to-cart-button")).click();

	
	
	//shopping cart module
	driver.findElement(By.linkText("Shopping cart")).click();
	driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();

	//checkout window
	driver.findElement(By.xpath("//input[@class='button-1 new-address-next-step-button' and @title='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("PickUpInStore")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[contains(@onclick,'Shipping.save')])")).click();
	
	//payment method 
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("div#payment-method-buttons-container input.button-1.payment-method-next-step-button")).click();
	//payment info
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[contains(@onclick,'PaymentInfo.save')]")).click(); 
	//confirm order
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@onclick,'ConfirmOrder.save')]")).click();
	
	//thank you 
	driver.findElement(By.xpath("//div[@class='buttons']//input[@class='button-2 order-completed-continue-button']")).click();

	
	}

}




 
