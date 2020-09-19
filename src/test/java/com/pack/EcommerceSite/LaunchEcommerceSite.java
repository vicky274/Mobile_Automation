package com.pack.EcommerceSite;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import com.mobile.pack.BaseforEcommerce;
import com.mobile.pack.MobileBrowserBase;

import io.appium.java_client.MobileElement;

public class LaunchEcommerceSite extends BaseforEcommerce{

	public static void main(String[] args) {
		
		try {
			initializedriver();
			//getDriver().findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Hello");
			getDriver().hideKeyboard();
			getDriver().findElementByXPath("//*[@text='Male']").click();
			getDriver().findElementById("android:id/text1").click();
			
			//sometimes this wont work in few apps. so use below one
			getDriver().findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Belgium\"));").click();
			
		//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
			
			getDriver().findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
			
			
			//For identifying toast messages use this class name. and the message displays will be inside attribute 'name'
			MobileElement el = getDriver().findElement(By.xpath("//android.widget.Toast[1]"));
			
			System.out.println(el.getAttribute("name"));
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
