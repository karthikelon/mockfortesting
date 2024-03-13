package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class madamMockQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 //q11)How to switch from parent to child tab and back to parent tab?

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

        // Get the window handle of the parent tab
        String parentHandle = driver.getWindowHandle();

        // Open a new tab (child tab)
        driver.executeScript("window.open('https://www.google.com','_blank');");

        // Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the child tab
        for (String handle : windowHandles) {
            if (!handle.equals(parentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Now, WebDriver is focused on the child tab
        System.out.println("Switched to child tab: " + driver.getCurrentUrl());

        // Perform actions in the child tab if needed

        // Close the child tab
        driver.close();

        // Switch back to the parent tab
        driver.switchTo().window(parentHandle);

	*/
		
	/*
		 q12)how to switch from child frame to main frame and switch back to main frame

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

        // Switch to a child frame by index, id, or name
        driver.switchTo().frame("frameNameOrId");

        // Perform actions within the child frame
        // Example: driver.findElement(By.id("elementId")).click();

        // Switch back to the main frame
        driver.switchTo().defaultContent();
		 */
		
		/*
		 q13)Write a code to verify if element isenabled()?
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\Hex_orange\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

        // Find the element to verify if it's enabled
        WebElement element = driver.findElement(By.id("elementId"));

        // Check if the element is enabled
        if (element.isEnabled()) {
            System.out.println("Element is enabled.");
        } else {
            System.out.println("Element is disabled.");
        }

		 */
		
	 }

 }
