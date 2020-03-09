package com.lululemon.objects;

import java.io.File;

import com.lululemon.baseclass.FunctionalLibrary;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.Reporter;

public class HooksClass {
	
	@Before
	public void beforeHook(Scenario scenario) {
		System.out.println(scenario.getName());
	}
	@After
	public void afterHook(Scenario scenario) throws Throwable {
		if(scenario.isFailed()) {
			File filepath=FunctionalLibrary.screenShot(scenario.getName());
			
		}
	}
	
}
