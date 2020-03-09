package com.lululemon.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lululemon.baseclass.FunctionalLibrary;

public class HeaderPom extends FunctionalLibrary {
	
	public WebElement getPrimaryHeaderDisplay() {
		return primaryHeaderDisplay;
	}

	@FindBy(className="header-wrapper")
	private WebElement primaryHeaderDisplay;

	public HeaderPom() {
		PageFactory.initElements(driver, this);
	}
}

