package com.tekarch.webdriver;

import org.openqa.selenium.WebDriver;

public class WebDrManagerFactory {

	public static WebDriver createDriver(String browser) throws Exception {
		WebDriver driverWeb;
		// Check if parameter passed from TestNG is 'firefox'/chrome
		if (browser.toLowerCase().startsWith("ch")) {
			driverWeb = new ChromeWebdriver().getDriver();
		} else if (browser.equalsIgnoreCase("ff") || browser.toLowerCase().startsWith("fi")) {
			driverWeb = new FireFoxWebdriver().getDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driverWeb = new EdgeWebdriver().getDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			driverWeb = new IEWebdriver().getDriver();
		} else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		return driverWeb;

	}



}
