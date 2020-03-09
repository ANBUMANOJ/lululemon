package com.lululemon.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.lululemon.baseclass.FunctionalLibrary;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty",
		"json:src\\test\\java\\com\\lululemon\\reports\\reports.json",
		"junit:src\\test\\java\\com\\lululemon\\reports\\reports.xml",
		"html:src\\test\\java\\com\\lululemon\\reports"},

		features="C:\\Users\\Ammu\\eclipse-workspace\\Lululemon\\src\\test\\resource\\com\\lululemon\\feature\\lululemon.feature",

		glue="com.lululemon.stepdefinition",
		
		dryRun=false,strict=true,monochrome=true)

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() throws Throwable {
		FunctionalLibrary.launchBrowser("seleniumgrid");
	}
	
	@AfterClass
	public static void driverQuit() throws Throwable {
		FunctionalLibrary.driverQuit();

	}
}
