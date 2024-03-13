package com.login;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonScrollTillTarget {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		//Thread.sleep(28000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 11);
		
		// Enter the search query
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("mobile under 10000");
        searchBox.submit();

        JavascriptExecutor j = (JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='POP 8 (Gravity Black,(8GB*+64GB)| 90Hz Punch Hole Display with Dynamic Port & Dual Speakers with DTS| 5000mAh Battery |10W Type-C| Side Fingerprint Sensor| Octa-Core Processor']")));
	
		
		WebElement element = driver.findElement(By.xpath("//span[text()='POP 8 (Gravity Black,(8GB*+64GB)| 90Hz Punch Hole Display with Dynamic Port & Dual Speakers with DTS| 5000mAh Battery |10W Type-C| Side Fingerprint Sensor| Octa-Core Processor']"));
		j.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='POP 8 (Gravity Black,(8GB*+64GB)| 90Hz Punch Hole Display with Dynamic Port & Dual Speakers with DTS| 5000mAh Battery |10W Type-C| Side Fingerprint Sensor| Octa-Core Processor']")).click();     
        
        
        
    }

        
}
