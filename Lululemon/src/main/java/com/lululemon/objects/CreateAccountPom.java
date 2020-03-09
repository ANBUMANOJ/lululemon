package com.lululemon.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lululemon.baseclass.FunctionalLibrary;

public class CreateAccountPom extends FunctionalLibrary{
	
	@FindBy(xpath="//p[@class='profile-name']")
	private WebElement signinClick;
	
	@FindBy(id="email-signup-account")
	private WebElement enterEmailAddress;
	
	@FindBy(id="new-password")
	private WebElement enterPassword;
	
	@FindBy(id="signup-submit")
	private WebElement createAccountClick;
	
	@FindBy(xpath="//li[contains(text(),'This email address is already in use')]")
	private WebElement alreadyEmailInUse;
	
	public WebElement getAlreadyEmailInUse() {
		return alreadyEmailInUse;
	}

	public WebElement getEnterEmailAddress() {
		return enterEmailAddress;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getCreateAccountClick() {
		return createAccountClick;
	}

	public WebElement getSigninClick() {
		return signinClick;
	}

	public CreateAccountPom() {
		PageFactory.initElements(driver, this);
		
	}
    }
	
