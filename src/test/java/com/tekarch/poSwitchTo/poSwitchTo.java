package com.tekarch.poSwitchTo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

import com.tekarch.utilities.TestBase;

public class poSwitchTo extends TestBase{
	Logger log = Logger.getLogger(getClass().getSimpleName());

	public poSwitchTo(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement button_Home;
	@FindBy(xpath = "//button[contains(text(),'Switch To')]")
	WebElement tab_SwitchTo;
	@FindBy(xpath = "//a[contains(text(),'Alert')]")
	WebElement alert;
	@FindBy(xpath = "//a[contains(text(),'Windows')]")
	WebElement Windows;
	@FindBy(xpath = "//a[contains(text(),'Tabs')]")
	WebElement Tabs;
	@FindBy(xpath = "//button[contains(text(),'Window Alert')]")
	WebElement tab_WindowAlert ;
	
	

	public boolean WindowAlert() throws Exception {
		boolean bRes_Flag=false;
		oBroUti.waitForElementVisible(driver, button_Home, 5);
		oBroUti.ufClick(alert);
		oBroUti.waitForElementVisible(driver, button_Home, 5);
		oBroUti.ufClick(tab_WindowAlert);
		Alert a=driver.switchTo().alert();
		log.info(a.getText());
		a.accept();
		return bRes_Flag;
	}


}
