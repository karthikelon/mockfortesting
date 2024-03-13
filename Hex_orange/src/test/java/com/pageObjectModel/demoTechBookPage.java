package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoTechBookPage {

	//Declaration
	
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button'][1]")
	public WebElement book1Tocart;
	
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button'][2]")
	public WebElement book2Tocart;
	
	@FindBy(xpath="//input[@class='button-2 product-box-add-to-cart-button'][3]")
	public WebElement book3Tocart;
	
	
	//constructor to intitialize all the above webelements
	
	public demoTechBookPage(WebDriver driver)

	{

		PageFactory.initElements(driver, this);

	}
	
	public void clickAddToCart() {
		book1Tocart.click();
		book2Tocart.click();
		book3Tocart.click();
	}
	
}
