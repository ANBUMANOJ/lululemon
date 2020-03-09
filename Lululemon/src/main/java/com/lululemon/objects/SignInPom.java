package com.lululemon.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lululemon.baseclass.FunctionalLibrary;

public class SignInPom extends FunctionalLibrary {
	
	@FindBy(xpath="//p[@class='profile-name']")
	private WebElement signinClick;
	
	@FindBy(id="email-signin-account")
	private WebElement enterUserName;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(id="signin-submit")
	private WebElement clickSignInButton;
	
	@FindBy(xpath="//*[@id=\"content-wrapper\"]/div/div/div[1]/ul[2]/li/a")
	private WebElement signoutClick;

	public WebElement getSignoutClick() {
		return signoutClick;
	}

	public WebElement getSigninClick() {
		return signinClick;
	}

	public WebElement getEnterUserName() {
		return enterUserName;
	}

	public WebElement getEnterPassword() {
		return enterPassword;
	}

	public WebElement getClickSignInButton() {
		return clickSignInButton;
	}

	public SignInPom() {
		PageFactory.initElements(driver, this);
	}
}
