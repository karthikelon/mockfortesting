package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageObjectModel.LoginPage;

public class orangeLoginTest {
	
	@Test
	@Parameters({"a","b"})

	public void method1(String a, String b) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(a);

		driver.findElement(By.name("password")).sendKeys(b);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}


}
