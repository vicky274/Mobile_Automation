package com.mobile.pack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseforApiDemo {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> initializedriver() throws MalformedURLException
	{
		File f = new File("./Apk/ApiDemos-debug.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "OnePlus 5");
		caps.setCapability("udid", "739993f5");
		caps.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AndroidDriver<MobileElement>(url,caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Application started.....");
		return getDriver();
	
	}

	public static AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
}
