package com.lululemon.baseclass;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) throws Throwable {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ammu\\eclipse-workspace\\Lululemon\\Drivers\\chromedriver.exe");
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Ammu\\eclipse-workspace\\Lululemon\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\Ammu\\eclipse-workspace\\Lululemon\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browserName.equalsIgnoreCase("seleniumgrid")) {
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setPlatform(Platform.WINDOWS);
				driver = new RemoteWebDriver(new URL("http://192.168.43.139:4444/wd/hub"), capabilities);

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return driver;
	}

	public static void launchApp(String url) throws Throwable {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void enterTextInTheWebelement(WebElement element, String value) throws Throwable {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void clickBtn(WebElement element) throws Throwable {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void driverQuit() throws Throwable {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static boolean elementIsDisplayed(WebElement element) throws Throwable {
		try {
			boolean displayed = element.isDisplayed();
			return displayed;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void mouseHover(WebElement element) throws Throwable {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void elementHighlight(WebElement element) throws Throwable {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border 2px solid pink')", element);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
	}

	public static void dropDown(WebElement element, String value, String options) {
		Select sl = new Select(element);
		if (options.equalsIgnoreCase("index")) {
			int d = Integer.parseInt(value);
			sl.selectByIndex(d);
		} else if (options.equalsIgnoreCase(value)) {
			sl.selectByValue(value);
		} else {
			sl.selectByVisibleText(value);
		}
	}

	public static File screenShot(String name) throws Throwable {
		TakesScreenshot tss = (TakesScreenshot) driver;
		File srcFile = tss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Screenshot" + name + ".png");
		FileUtils.copyFile(srcFile, destFile);
		return destFile;

	}

}
