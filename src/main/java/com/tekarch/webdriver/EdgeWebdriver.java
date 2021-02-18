package com.tekarch.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeWebdriver implements IWebdriver {

	@Override
	public WebDriver getDriver() {
		WebDriverManager.edgedriver().setup();
		return  new EdgeDriver();
	}
}
