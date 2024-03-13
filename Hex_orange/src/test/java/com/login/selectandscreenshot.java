package com.login;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectandscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("elon06820@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("karthik22");

		driver.findElement(By.xpath("//div[@class='inputs reversed']//input[@id='RememberMe']")).click();
		driver.findElement(By.xpath("//div[@class='buttons']//input[@class=\"button-1 login-button\"]")).click();
		
		// going to book section
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		//select section from low to high
		WebElement element=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sel=new Select(element);
		List<WebElement> li = sel.getOptions();		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@id='products-orderby']/option"), 1));
		int count = li.size();
		System.out.println("Number of options available is " + count);
		for (WebElement option : li) {
			
		    System.out.println(option.getText());
		}
		sel.selectByIndex(4);
		
		//screen shot 
		driver.findElement(By.xpath("//div[@class='header-menu']//a[contains(@href, 'computers')]")).click();
		TakesScreenshot scr=(TakesScreenshot)driver;
		File src=scr.getScreenshotAs(OutputType.FILE);
		System.out.println("first screen shot taken");
		File dest=new File("E:\\selenium screenshots\\Screenshot1computer.png");
		FileUtils.copyFile(src, dest);
		
		
		driver.findElement(By.xpath("//div[@class='header-menu']//a[contains(@href, 'apparel-shoes')]")).click();
		wait.until(ExpectedConditions.titleContains("Demo Web Shop. Apparel & Shoes"));
		TakesScreenshot scr2=(TakesScreenshot)driver;
		System.out.println("second screen shot taken ");
		File src2=scr2.getScreenshotAs(OutputType.FILE);
		File dest2=new File("E:\\selenium screenshots\\Screenshot2apparel-shoe.png");
		FileUtils.copyFile(src2, dest2);

	}

}
