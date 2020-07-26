package com.mobile.pack;

import java.net.MalformedURLException;

public class ScrollingAction extends BaseforApiDemo{

	public static void main(String[] args) {
		 
		try {
			initializedriver();
			
			//finding by xpath
			getDriver().findElementByXPath("//android.widget.TextView[@text='Views']").click();
			
			//There is no direct method to scroll. There is no specific method in appium, have to go with Android API.
			getDriver().findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(description(\"WebView\"));");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}

	}

}
