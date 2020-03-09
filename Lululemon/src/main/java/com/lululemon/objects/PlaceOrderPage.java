package com.lululemon.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderPage {
	
	@FindBy(xpath="/html/body/header/div[2]/nav/div[3]/ul/div/div[3]/input")
	private WebElement searchTheProduct;
	
	@FindBy(xpath="/html/body/header/div[2]/nav/div[3]/ul/div/div[3]/input")
	private WebElement clickTheSearchButton;
	
	@FindBy(xpath="//img[@id='us_116650045_0']")
	private WebElement clickTheProductButton;
	
	@FindBy(xpath="//span[@class='colorSwatch-3fY2k']")
	private WebElement selectTheColour;
	
	@FindBy(xpath="(//span[@class='sizeTile-J3BmZ'])[5]")
	private WebElement selectTheSize;
	
	@FindBy(xpath="//button[@class='button-1xp0M add-to-bag buttonPrimary-2q4bX']")
	private WebElement clickTheAddToBagButton;
	
	@FindBy(xpath="//a[@class='button-1xp0M bag-details__checkout-btn all-caps buttonPrimary-2q4bX buttonBlock-1LKHl']")
	private WebElement clickCheckOutButton;
	
	@FindBy(xpath="//option[@value='MEX']")
	private WebElement selectTheCountry;
	
	@FindBy(id="firstname")
	private WebElement enterTheFirstName;
	
	@FindBy(id="lastname")
	private WebElement enterTheLastName;
	
	@FindBy(id="address-1")
	private WebElement enterTheAddress;
	
	@FindBy(id="city")
	private WebElement enterTheCity;
	
	@FindBy(id="postal-code")
	private WebElement enterTheZipCode;
	
	@FindBy(id="phone-number")
	private WebElement enterThePhoneNumber;
	
	@FindBy(id="nickname")
	private WebElement enterTheNickNameForAddress;
	
	@FindBy(id="shipping-submit")
	private WebElement clickContinueToPaymentButton;

	public WebElement getSearchTheProduct() {
		return searchTheProduct;
	}

	public WebElement getClickTheSearchButton() {
		return clickTheSearchButton;
	}

	public WebElement getClickTheProductButton() {
		return clickTheProductButton;
	}

	public WebElement getSelectTheColour() {
		return selectTheColour;
	}

	public WebElement getSelectTheSize() {
		return selectTheSize;
	}

	public WebElement getClickTheAddToBagButton() {
		return clickTheAddToBagButton;
	}

	public WebElement getSelectTheCountry() {
		return selectTheCountry;
	}

	public WebElement getEnterTheFirstName() {
		return enterTheFirstName;
	}

	public WebElement getEnterTheLastName() {
		return enterTheLastName;
	}

	public WebElement getEnterTheAddress() {
		return enterTheAddress;
	}

	public WebElement getEnterTheCity() {
		return enterTheCity;
	}

	public WebElement getEnterTheZipCode() {
		return enterTheZipCode;
	}

	public WebElement getEnterThePhoneNumber() {
		return enterThePhoneNumber;
	}

	public WebElement getEnterTheNickNameForAddress() {
		return enterTheNickNameForAddress;
	}

	public WebElement getClickContinueToPaymentButton() {
		return clickContinueToPaymentButton;
	}

		
	public WebElement getClickCheckOutButton() {
		return clickCheckOutButton;
	}

		
	
}
