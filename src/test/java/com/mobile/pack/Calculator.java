package com.mobile.pack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
	
		try {
			Calcfunction();
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void Calcfunction() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "OnePlus 5");
		caps.setCapability("udid", "739993f5");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.0");
		caps.setCapability("appPackage", "com.oneplus.calculator");
		caps.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,caps);
		
		System.out.println("Application started.....");
		
	}

}
