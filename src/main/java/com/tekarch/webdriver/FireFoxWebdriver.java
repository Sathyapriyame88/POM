package com.tekarch.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxWebdriver implements IWebdriver {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.desktop-notification", 1);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		return new FirefoxDriver(capabilities);
	}
}
