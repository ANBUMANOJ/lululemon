package com.lululemon.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lululemon.baseclass.FunctionalLibrary;

public class ForgetPasswordPom extends FunctionalLibrary {
	
	@FindBy(id="forgotPwdLink")
	private WebElement clickForgetPassword;
	
	@FindBy(id="ma-forgotten-password-email")
	private WebElement enterEmailId;
	
	@FindBy(name="reset")
	private WebElement clickResetButton;

	public WebElement getClickForgetPassword() {
		return clickForgetPassword;
	}

	public WebElement getEnterEmailId() {
		return enterEmailId;
	}

	public WebElement getClickResetButton() {
		return clickResetButton;
	}
	public ForgetPasswordPom() {
		PageFactory.initElements(driver, this);
	}

}
