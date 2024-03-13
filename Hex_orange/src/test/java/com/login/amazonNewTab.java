package com.login;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		// login in to amazon 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(28000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 11);
		/*
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pintola peanut butter ");
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']//div[@role='button']"));
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
        }

        // Click on the option containing "pintola peanut butter 1_kg crunchy"
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().contains("pintola peanut butter 1_kg crunchy")) {
                suggestion.click();
                break;
            }
        }
        */
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pintola peanut butter 1_kg crunchy");
		driver.findElement(By.xpath("//i nput[@id='nav-search-submit-button']")).click();
		
		//new page containing target product
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		
		// navigating to new page 
				String parent_handle= driver.getWindowHandle();
				System.out.println(parent_handle);
				Set<String> handles = driver.getWindowHandles(); // parentid,childid,subchild
				System.out.println(handles);
					
				for(String handle1:handles)
				    if(!parent_handle.equals(handle1))
				    {
				        driver.switchTo().window(handle1);
				        break;
				}
		// adding to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//clicking proceed to check out 
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		
		//changing the payment method
		driver.findElement(By.xpath("//a[@id='payChangeButtonId']")).click();
		
		//choosing the credit card radio button
		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
		driver.findElement(By.xpath("//input[@name='ppw-instrumentRowSelection']")).click();
		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
		//clicking enter card details button
		driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
		wait.until(ExpectedConditions.titleContains("Amazon.in Checkout"));
		//getting into frame via code and entering details
		
		// switch to new frame
		
		driver.switchTo().frame(0);
		System.out.println("Frame switched");
		driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("1232543243443544");
		
		 
		// changing the expiry date 
		System.out.println("card name entered");

		driver.findElement(By.xpath("(//span[contains(@class,'a-button-dropdown pmts-expiry')])[1]")).click();

		// Locate the select element for the month dropdown
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@name='ppw-expirationDate_month']"));

		// Initialize the Select object with the select element
		Select monthSelect = new Select(monthDropdown);

		// Select the month by value
		monthSelect.selectByValue("1");

		// year 
		WebElement yearDropdown = driver.findElement(By.xpath("(//div[@class='a-row a-spacing-small']//span[@class='a-dropdown-prompt'])[2]"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByValue("2025");

		driver.findElement(By.xpath("//button[contains(@name,'CancelAddCreditCardEvent')]")).click();
		System.out.println("cancel button");

		// switching to main page
		driver.switchTo().defaultContent();

	}

}
