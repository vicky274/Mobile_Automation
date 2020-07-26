package com.mobile.pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileBrowserBase {

	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> initializedriver() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "OnePlus 5");
		caps.setCapability("udid", "739993f5");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
		//caps.setCapability("androidPackage", "com.android.chrome");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability("chromedriverExecutableDir", "./Apk");
		//caps.setCapability("chromedriver_autodownload", true);
		
		
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
