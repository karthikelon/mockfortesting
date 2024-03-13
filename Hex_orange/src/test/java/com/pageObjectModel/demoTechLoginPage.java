package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoTechLoginPage {

		//Declaration

		@FindBy(id="Email")

		public WebElement textEmail;


		@FindBy(name="Password")

		public WebElement textPassword;


		@FindBy(xpath="//input[@class='button-1 login-button']")

		public WebElement buttonLogin;
	 
		//Initilization
	 
		public demoTechLoginPage(WebDriver driver)
	
		{
	
			PageFactory.initElements(driver, this);
	
		}
		 
		//Utilization
		 
		public void enterEmail(String str)
	
		{
	
		textEmail.sendKeys(str);
	
		}
		 
		 
		public void enterPassword(String str)
	
		{
	
		textPassword.sendKeys(str);
	
		}
		 
		public void clickLogin()
	
		{
	
			buttonLogin.click();
	
		}
}
