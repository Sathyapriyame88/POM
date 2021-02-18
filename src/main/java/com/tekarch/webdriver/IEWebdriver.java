package com.tekarch.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEWebdriver implements IWebdriver {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.iedriver().setup();
		return  new EdgeDriver();
	}
}
