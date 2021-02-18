package com.tekarch.SwitchTo;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tekarch.poSwitchTo.poSwitchTo;
import com.tekarch.pohome.pohome;
import com.tekarch.pologin.pologinTekApp;
import com.tekarch.utilities.TestBase;

public class SwitchTo extends TestBase{
	pologinTekApp login;
	pohome home;
	poSwitchTo switchTo;
	Logger log = Logger.getLogger(getClass().getSimpleName());
	@BeforeTest
	public void settingDependecy() throws Exception {
		driver.get(oCons.getTekAppURL());
		login = new pologinTekApp(driver);
		home=new pohome(driver);
		switchTo=new poSwitchTo(driver);
		login.loginToTekApp();
		home.navigateToSwitchTo();
		
	}
	@Test
	public void windowAlert() throws Exception {
		switchTo.WindowAlert();
	}


}
