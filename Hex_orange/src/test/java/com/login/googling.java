package com.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Qspider");
		Thread.sleep(5000);
		List<WebElement> suggestion =   driver.findElements(By.xpath("//span[contains(text(),'QSpider')]"));
		Thread.sleep(3000);
		
		
		int count = suggestion.size();
		System.out.println(count);
		for (WebElement x : suggestion) {
            // Check if the suggestion text is "QSpiders Vadapalani"
			Thread.sleep(4000);
            if (x.getText().equals("QSpiders Vadapalani")) {
                x.click();
                break;
            }
        }
	}

}
