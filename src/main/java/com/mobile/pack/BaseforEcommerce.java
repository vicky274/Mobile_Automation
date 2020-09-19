package com.mobile.pack;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import static io.appium.java_client.touch.offset.PointOption.point;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;

public class BaseforEcommerce {

	

/*Locator strategies	                Supported Platform
accessibility id or ID	              Android and iOS
Name	                              Android and iOS
class Name	                          Android and iOS
Uiautomator selector	              Android
Predicate string	                  iOS
Class chain	                          iOS
Xpath	                              Android and iOS*/


	private static AndroidDriver<MobileElement> driver;
	
	public static AndroidDriver<MobileElement> initializedriver() throws MalformedURLException
	{
		File f = new File("./Apk/General-Store.apk");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("deviceName", "OnePlus 5");
		caps.setCapability("udid", "739993f5");
		caps.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 15);
		//caps.setCapability("chromedriverExecutableDir", "./Apk/ChromeDriver_83");
		//caps.setCapability("chromedriver_autodownload", true);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AndroidDriver<MobileElement>(url,caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	/*	driver.unlockDevice();
		
		MobileElement swipe_up =driver.findElementById("com.android.systemui:id/keyguard_indication_text");
		MobileElement charging_info = driver.findElementById("com.android.systemui:id/lock_icon");
		
		Point center1 = charging_info.getCenter();

		
		TouchAction t = new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions().withElement(element(swipe_up)).withDuration(Duration.ofSeconds(2))).moveTo(point(center1.x, center1.y+80)).release().perform();
		
		driver.findElementByXPath("//*[@text='7']").click();
		driver.findElementByXPath("//*[@text='9']").click();
		driver.findElementByXPath("//*[@text='9']").click();
		driver.findElementByXPath("//*[@text='6']").click();
		driver.findElementByAccessibilityId("Enter").click();
		*/
		
		System.out.println(getDriver().getCurrentPackage());
		System.out.println(getDriver().getContext());
		System.out.println(getDriver().currentActivity());
		System.out.println("Application started.....");
		return getDriver();
	
	}

	//adb install and apk path -to install app in emulator(make sure emulator is open)
	public static AndroidDriver<MobileElement> getDriver() {
		return driver;
	}
}
